package mg.studio.weatherappdesign;

import java.util.List;

public class ForecastBean {

    /**
     * cod : 200
     * message : 0.0049
     * cnt : 37
     * list : [{"dt":1551603600,"main":{"temp":291.17,"temp_min":288.699,"temp_max":291.17,"pressure":1010.21,"sea_level":1010.21,"grnd_level":953.86,"humidity":77,"temp_kf":2.47},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.82,"deg":53.0009},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-03 09:00:00"},{"dt":1551614400,"main":{"temp":286.39,"temp_min":284.743,"temp_max":286.39,"pressure":1011.38,"sea_level":1011.38,"grnd_level":954.26,"humidity":81,"temp_kf":1.64},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.06,"deg":6.50079},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 12:00:00"},{"dt":1551625200,"main":{"temp":282.29,"temp_min":281.463,"temp_max":282.29,"pressure":1012.68,"sea_level":1012.68,"grnd_level":954.89,"humidity":89,"temp_kf":0.82},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.53,"deg":18.0039},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 15:00:00"},{"dt":1551636000,"main":{"temp":279.681,"temp_min":279.681,"temp_max":279.681,"pressure":1011.74,"sea_level":1011.74,"grnd_level":953.71,"humidity":89,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.21,"deg":54.0002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 18:00:00"},{"dt":1551646800,"main":{"temp":280.081,"temp_min":280.081,"temp_max":280.081,"pressure":1010.16,"sea_level":1010.16,"grnd_level":951.97,"humidity":88,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":88},"wind":{"speed":1.17,"deg":77.0014},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 21:00:00"},{"dt":1551657600,"main":{"temp":281.506,"temp_min":281.506,"temp_max":281.506,"pressure":1009.98,"sea_level":1009.98,"grnd_level":951.79,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":1,"deg":87.0004},"rain":{"3h":0.005},"sys":{"pod":"d"},"dt_txt":"2019-03-04 00:00:00"},{"dt":1551668400,"main":{"temp":285.005,"temp_min":285.005,"temp_max":285.005,"pressure":1009.24,"sea_level":1009.24,"grnd_level":952.16,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.26,"deg":30.5007},"rain":{"3h":0.015},"sys":{"pod":"d"},"dt_txt":"2019-03-04 03:00:00"},{"dt":1551679200,"main":{"temp":286.169,"temp_min":286.169,"temp_max":286.169,"pressure":1006.33,"sea_level":1006.33,"grnd_level":949.92,"humidity":89,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.01,"deg":342.505},"rain":{"3h":0.115},"sys":{"pod":"d"},"dt_txt":"2019-03-04 06:00:00"},{"dt":1551690000,"main":{"temp":285.279,"temp_min":285.279,"temp_max":285.279,"pressure":1005.11,"sea_level":1005.11,"grnd_level":948.94,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.87,"deg":306.002},"rain":{"3h":0.505},"sys":{"pod":"d"},"dt_txt":"2019-03-04 09:00:00"},{"dt":1551700800,"main":{"temp":283.682,"temp_min":283.682,"temp_max":283.682,"pressure":1007.23,"sea_level":1007.23,"grnd_level":950.47,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.51,"deg":258.002},"rain":{"3h":2.24},"sys":{"pod":"n"},"dt_txt":"2019-03-04 12:00:00"},{"dt":1551711600,"main":{"temp":283.083,"temp_min":283.083,"temp_max":283.083,"pressure":1009.54,"sea_level":1009.54,"grnd_level":952.6,"humidity":98,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.67,"deg":230.002},"rain":{"3h":4.92},"sys":{"pod":"n"},"dt_txt":"2019-03-04 15:00:00"},{"dt":1551722400,"main":{"temp":283.113,"temp_min":283.113,"temp_max":283.113,"pressure":1009.78,"sea_level":1009.78,"grnd_level":952.55,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.28,"deg":205},"rain":{"3h":2.38},"sys":{"pod":"n"},"dt_txt":"2019-03-04 18:00:00"},{"dt":1551733200,"main":{"temp":283.091,"temp_min":283.091,"temp_max":283.091,"pressure":1009.66,"sea_level":1009.66,"grnd_level":952.38,"humidity":98,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.26,"deg":205},"rain":{"3h":4.12},"sys":{"pod":"n"},"dt_txt":"2019-03-04 21:00:00"},{"dt":1551744000,"main":{"temp":283.121,"temp_min":283.121,"temp_max":283.121,"pressure":1011.18,"sea_level":1011.18,"grnd_level":953.78,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.56,"deg":219.501},"rain":{"3h":2.04},"sys":{"pod":"d"},"dt_txt":"2019-03-05 00:00:00"},{"dt":1551754800,"main":{"temp":283.959,"temp_min":283.959,"temp_max":283.959,"pressure":1012.9,"sea_level":1012.9,"grnd_level":955.95,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.32,"deg":232.5},"rain":{"3h":0.98},"sys":{"pod":"d"},"dt_txt":"2019-03-05 03:00:00"},{"dt":1551765600,"main":{"temp":284.364,"temp_min":284.364,"temp_max":284.364,"pressure":1012.36,"sea_level":1012.36,"grnd_level":955.76,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.42,"deg":247.507},"rain":{"3h":0.58},"sys":{"pod":"d"},"dt_txt":"2019-03-05 06:00:00"},{"dt":1551776400,"main":{"temp":284.62,"temp_min":284.62,"temp_max":284.62,"pressure":1011.98,"sea_level":1011.98,"grnd_level":955.27,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.96,"deg":231.502},"rain":{"3h":0.32},"sys":{"pod":"d"},"dt_txt":"2019-03-05 09:00:00"},{"dt":1551787200,"main":{"temp":283.989,"temp_min":283.989,"temp_max":283.989,"pressure":1014.14,"sea_level":1014.14,"grnd_level":956.91,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.12,"deg":223},"rain":{"3h":0.56},"sys":{"pod":"n"},"dt_txt":"2019-03-05 12:00:00"},{"dt":1551798000,"main":{"temp":283.677,"temp_min":283.677,"temp_max":283.677,"pressure":1016.47,"sea_level":1016.47,"grnd_level":958.94,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.31,"deg":209.501},"rain":{"3h":0.42},"sys":{"pod":"n"},"dt_txt":"2019-03-05 15:00:00"},{"dt":1551808800,"main":{"temp":283.233,"temp_min":283.233,"temp_max":283.233,"pressure":1017.39,"sea_level":1017.39,"grnd_level":959.52,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.32,"deg":202.502},"rain":{"3h":2.28},"sys":{"pod":"n"},"dt_txt":"2019-03-05 18:00:00"},{"dt":1551819600,"main":{"temp":282.754,"temp_min":282.754,"temp_max":282.754,"pressure":1016.96,"sea_level":1016.96,"grnd_level":959.01,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.16,"deg":227.503},"rain":{"3h":1.79},"sys":{"pod":"n"},"dt_txt":"2019-03-05 21:00:00"},{"dt":1551830400,"main":{"temp":282.545,"temp_min":282.545,"temp_max":282.545,"pressure":1018.1,"sea_level":1018.1,"grnd_level":960.02,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.76,"deg":220.001},"rain":{"3h":0.62},"sys":{"pod":"d"},"dt_txt":"2019-03-06 00:00:00"},{"dt":1551841200,"main":{"temp":284.206,"temp_min":284.206,"temp_max":284.206,"pressure":1019.07,"sea_level":1019.07,"grnd_level":961.52,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.26,"deg":231},"rain":{"3h":0.25},"sys":{"pod":"d"},"dt_txt":"2019-03-06 03:00:00"},{"dt":1551852000,"main":{"temp":284.913,"temp_min":284.913,"temp_max":284.913,"pressure":1017.6,"sea_level":1017.6,"grnd_level":960.37,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.51,"deg":200.5},"rain":{"3h":0.25},"sys":{"pod":"d"},"dt_txt":"2019-03-06 06:00:00"},{"dt":1551862800,"main":{"temp":284.979,"temp_min":284.979,"temp_max":284.979,"pressure":1016.02,"sea_level":1016.02,"grnd_level":958.82,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.58,"deg":142.5},"rain":{"3h":0.16},"sys":{"pod":"d"},"dt_txt":"2019-03-06 09:00:00"},{"dt":1551873600,"main":{"temp":283.862,"temp_min":283.862,"temp_max":283.862,"pressure":1017.45,"sea_level":1017.45,"grnd_level":959.8,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.11,"deg":76.5031},"rain":{"3h":0.21},"sys":{"pod":"n"},"dt_txt":"2019-03-06 12:00:00"},{"dt":1551884400,"main":{"temp":283.22,"temp_min":283.22,"temp_max":283.22,"pressure":1018.68,"sea_level":1018.68,"grnd_level":960.84,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.12,"deg":86.5003},"rain":{"3h":0.19},"sys":{"pod":"n"},"dt_txt":"2019-03-06 15:00:00"},{"dt":1551895200,"main":{"temp":282.53,"temp_min":282.53,"temp_max":282.53,"pressure":1019.37,"sea_level":1019.37,"grnd_level":961.4,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.07,"deg":144.002},"rain":{"3h":0.89},"sys":{"pod":"n"},"dt_txt":"2019-03-06 18:00:00"},{"dt":1551906000,"main":{"temp":281.219,"temp_min":281.219,"temp_max":281.219,"pressure":1018.65,"sea_level":1018.65,"grnd_level":960.23,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.77,"deg":118.002},"rain":{"3h":2.78},"sys":{"pod":"n"},"dt_txt":"2019-03-06 21:00:00"},{"dt":1551916800,"main":{"temp":280.997,"temp_min":280.997,"temp_max":280.997,"pressure":1019.68,"sea_level":1019.68,"grnd_level":961.12,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.14,"deg":139},"rain":{"3h":0.83},"sys":{"pod":"d"},"dt_txt":"2019-03-07 00:00:00"},{"dt":1551927600,"main":{"temp":283.699,"temp_min":283.699,"temp_max":283.699,"pressure":1020.06,"sea_level":1020.06,"grnd_level":961.92,"humidity":94,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":80},"wind":{"speed":2.67,"deg":138.504},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-07 03:00:00"},{"dt":1551938400,"main":{"temp":285.931,"temp_min":285.931,"temp_max":285.931,"pressure":1017.62,"sea_level":1017.62,"grnd_level":959.96,"humidity":95,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":2.21,"deg":137.501},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-07 06:00:00"},{"dt":1551949200,"main":{"temp":285.336,"temp_min":285.336,"temp_max":285.336,"pressure":1015.34,"sea_level":1015.34,"grnd_level":957.86,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":76},"wind":{"speed":2.52,"deg":125.503},"rain":{"3h":0.029999999999998},"sys":{"pod":"d"},"dt_txt":"2019-03-07 09:00:00"},{"dt":1551960000,"main":{"temp":282.063,"temp_min":282.063,"temp_max":282.063,"pressure":1016.62,"sea_level":1016.62,"grnd_level":958.75,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":44},"wind":{"speed":3.41,"deg":126.003},"rain":{"3h":0.010000000000002},"sys":{"pod":"n"},"dt_txt":"2019-03-07 12:00:00"},{"dt":1551970800,"main":{"temp":280.481,"temp_min":280.481,"temp_max":280.481,"pressure":1018.47,"sea_level":1018.47,"grnd_level":960.08,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.76,"deg":131.502},"rain":{"3h":0.21},"sys":{"pod":"n"},"dt_txt":"2019-03-07 15:00:00"},{"dt":1551981600,"main":{"temp":279.879,"temp_min":279.879,"temp_max":279.879,"pressure":1018.05,"sea_level":1018.05,"grnd_level":959.59,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.82,"deg":121.005},"rain":{"3h":1.09},"sys":{"pod":"n"},"dt_txt":"2019-03-07 18:00:00"},{"dt":1551992400,"main":{"temp":279.268,"temp_min":279.268,"temp_max":279.268,"pressure":1016.53,"sea_level":1016.53,"grnd_level":958.05,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.51,"deg":107.006},"rain":{"3h":0.86},"sys":{"pod":"n"},"dt_txt":"2019-03-07 21:00:00"}]
     * city : {"id":1814906,"name":"Chongqing","coord":{"lat":29.5586,"lon":106.5493},"country":"CN","population":3967028}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1814906
         * name : Chongqing
         * coord : {"lat":29.5586,"lon":106.5493}
         * country : CN
         * population : 3967028
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            /**
             * lat : 29.5586
             * lon : 106.5493
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1551603600
         * main : {"temp":291.17,"temp_min":288.699,"temp_max":291.17,"pressure":1010.21,"sea_level":1010.21,"grnd_level":953.86,"humidity":77,"temp_kf":2.47}
         * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}]
         * clouds : {"all":0}
         * wind : {"speed":1.82,"deg":53.0009}
         * rain : {}
         * sys : {"pod":"d"}
         * dt_txt : 2019-03-03 09:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 291.17
             * temp_min : 288.699
             * temp_max : 291.17
             * pressure : 1010.21
             * sea_level : 1010.21
             * grnd_level : 953.86
             * humidity : 77
             * temp_kf : 2.47
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 0
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
        }

        public static class RainBean {
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : clear sky
             * icon : 01d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
