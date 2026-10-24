public class WeatherServiceDemo {
    interface WeatherRetrieval {
        String getWeatherInfo(String city);
    }

    public static void main(String[] args) {
        WeatherRetrieval service = new WeatherRetrieval() {
            @Override
            public String getWeatherInfo(String city) {
                return "Current weather in " + city + ": Sunny, 32°C";
            }
        };

        String result = service.getWeatherInfo("Bangalore");
        System.out.println(result);
    }
}
