package mg.studio.weatherappdesign;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import interfaces.heweather.com.interfacesmodule.view.HeConfig;

public class MainActivity extends AppCompatActivity {
    TextView my_Date;
    TextView my_Title;
    String location;
    TextView my_Tem;
    TextView[] forelist=new TextView[4];
    TextView[] timelist=new TextView[4];
    ImageView[] foreimgelist=new ImageView[4];
    ImageView todayimage;
    TextView my_Location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_Date=findViewById(R.id.tv_date);
        my_Title=findViewById(R.id.tv_title);
        my_Tem=findViewById(R.id.temperature_of_the_day);
        my_Location=findViewById(R.id.tv_location);
        location=LocationUtils.getPlace(this);
        my_Location.setText(location);
        forelist[0]=(findViewById(R.id.tv_fore1));
        forelist[1]=(findViewById(R.id.tv_fore2));
        forelist[2]=(findViewById(R.id.tv_fore3));
        forelist[3]=(findViewById(R.id.tv_fore4));
        timelist[0]=findViewById(R.id.tv_date1);
        timelist[1]=findViewById(R.id.tv_date2);
        timelist[2]=findViewById(R.id.tv_date3);
        timelist[3]=findViewById(R.id.tv_date4);
        todayimage=findViewById(R.id.img_weather_condition);
        foreimgelist[0]=findViewById(R.id.img_fore1);
        foreimgelist[1]=findViewById(R.id.img_fore2);
        foreimgelist[2]=findViewById(R.id.img_fore3);
        foreimgelist[3]=findViewById(R.id.img_fore4);
    }

    public void onResume(){
        super.onResume();
        new refreshToday().execute();
        new refreshFore().execute();
    }

    public void btnClick(View view) {
        location=LocationUtils.getPlace(this);
        new refreshToday().execute();
        new refreshFore().execute();
    }

    private class refreshFore extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            String forecast_url_string=String.format("https://api.openweathermap.org/data/2.5/forecast?q=Chongqing&appid=99e69144324e0ad1de0b0a203d399682");
            HttpURLConnection conn=null;
            try {
                URL foreurl = new URL(forecast_url_string);
                conn=(HttpURLConnection)foreurl.openConnection();
                conn.setConnectTimeout(8000);
                conn.setReadTimeout(10000);
                Log.i("GETWEATHER","开始连接网络！");
                conn.connect();
                int statecode=conn.getResponseCode();
                if(statecode!=200){
                    Toast.makeText(getBaseContext(),"Network not good！",Toast.LENGTH_SHORT).show();
                    Log.i("GETWEATHER","网络不好！");
                    return null;
                }
                Log.i("GETWEATHER","得到反馈！");
                Log.i("GETWEATHER","连接成功！");
                InputStream foreis=conn.getInputStream();
                InputStreamReader foreisr = new InputStreamReader(foreis, "utf-8"); // 设置读取流的编码格式，自定义编码
                BufferedReader reader = new BufferedReader(foreisr);
                String line = null;
                StringBuilder sb=new StringBuilder();
                while((line=reader.readLine())!=null)
                    sb.append(line+" ");
                reader.close();
                foreisr.close();
                foreis.close();
                return sb.toString();
            } catch (java.io.IOException e) {
                Log.i("GETWEATHER","IO抛出错误!");
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(String info) {
            if(info==null||info=="") return;
            Log.i("GETWEATHER","得到非空数据!");
            Gson gson=new Gson();
            ForecastBean bean=gson.fromJson(info,ForecastBean.class);
            long tempdate=System.currentTimeMillis();    //得到long
            tempdate=tempdate-tempdate%86400000+86400000;   //得到第二天零点的日期long
            Date temp=new Date(tempdate);
            int count=0;
            int index=0;
            double min=500;
            double max=-500;
            List<ForecastBean.ListBean> weatherlist=bean.getList();
            while(count<4&&index<weatherlist.size()){
                ForecastBean.ListBean forebean=weatherlist.get(index++);
                long cha=1000*((long)forebean.getDt())-tempdate;
                if(cha<86400000&&cha>=0){    //如果符合要求，即间隔小于一天
                    if(forebean.getMain().getTemp_min()<min)
                        min=forebean.getMain().getTemp_min();
                    if(forebean.getMain().getTemp_max()>max)
                        max=forebean.getMain().getTemp_max();
                }
                if(cha==86400000||index==38){      //恰好间隔了一天
                    String temtemp=String.format("%.1f~%.1f℃",min-273.15,max-273.15);
                    forelist[count].setText(temtemp);
                    foreimgelist[count].setImageResource(translateWeatherIcon(weatherlist.get(index-5).getWeather().get(0).getIcon()));
                    Date todayDate=new Date(tempdate);
                    SimpleDateFormat sdf= new SimpleDateFormat("EEEE");
                    String datestring=sdf.format(todayDate);
                    timelist[count].setText(datestring);
                    count++;
                    tempdate+=86400000;    //加上一天
                    min=500;
                    max=-500;
                }
            }
            Toast.makeText(getBaseContext(),"Forecast Update Successfully！",Toast.LENGTH_SHORT).show();
            Log.i("GETWEATHER","设置预报内容成功!");
        }
    }

    private class refreshToday extends AsyncTask<String, Void, String> {
        String weather_url_string=String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=99e69144324e0ad1de0b0a203d399682",location);
        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection conn=null;
            try {
                URL todayurl = new URL(weather_url_string);
                conn=(HttpURLConnection)todayurl.openConnection();
                conn.setConnectTimeout(8000);
                conn.setReadTimeout(10000);
                Log.i("GETWEATHER","开始连接网络！");
                conn.connect();
                int statecode=conn.getResponseCode();
                if(statecode!=200){
                    Toast.makeText(getBaseContext(),"Network not good！",Toast.LENGTH_SHORT).show();
                    return null;
                }
                Log.i("GETWEATHER","得到反馈！");
                Log.i("GETWEATHER","连接成功！");
                InputStream foreis=conn.getInputStream();
                InputStreamReader foreisr = new InputStreamReader(foreis, "utf-8"); // 设置读取流的编码格式，自定义编码
                BufferedReader reader = new BufferedReader(foreisr);
                String line = null;
                StringBuilder sb=new StringBuilder();
                while((line=reader.readLine())!=null)
                    sb.append(line+" ");
                reader.close();
                foreisr.close();
                foreis.close();
                return sb.toString();
            } catch (java.io.IOException e) {
                Log.i("GETWEATHER","IO抛出错误!");
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(String info) {
            if(info==null||info=="") return;
            Log.i("GETWEATHER","得到非空数据!");
            Gson gson=new Gson();
            TodayBean bean=gson.fromJson(info,TodayBean.class);
            double temperature=bean.getMain().getTemp();
            my_Tem.setText(String.format("%.0f",temperature-273.15));
            Date todayDate=new Date(((long)bean.getDt())*1000);
            SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
            String datestring=sdf.format(todayDate);
            my_Date.setText(datestring);
            sdf= new SimpleDateFormat("EEEE");
            String weekstring=sdf.format(todayDate);
            my_Title.setText(weekstring);
            Log.i("GETWEATHER","设置textview内容成功!");
            String icontype=bean.getWeather().get(0).getIcon();
            todayimage.setImageResource(translateWeatherIcon(icontype));
            Log.i("GETWEATHER","设置image内容成功!");
            Toast.makeText(getBaseContext(),"Today Update Successfully！",Toast.LENGTH_SHORT).show();
        }
    }

    private int translateWeatherIcon(String iconnum){
        iconnum=iconnum.substring(0,2);
        int type=Integer.parseInt(iconnum);
        switch (type){
            case 1:
                return R.drawable.sunny_small;
            case 2:
            case 3:
            case 4:
                return R.drawable.partly_sunny_small;
            case 9:
            case 10:
            case 11:
            case 13:
                return R.drawable.rainy_small;
            case 50:
                return R.drawable.windy_small;
        }
        return 0;
    }
}
