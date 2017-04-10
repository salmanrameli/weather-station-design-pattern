public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(); //create the WeatherData object

		//registering observers to WeatherData
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);
//		new AsapDisplay(weatherData);

		//simulate new weather measurements
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
