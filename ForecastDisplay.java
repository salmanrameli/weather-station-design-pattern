public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	ForecastDisplay(WeatherData weatherData) { //registering ForecastDisplay as an observer to WeatherData class
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) { //updating the current pressure reading
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() { //display the latest forecast
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
