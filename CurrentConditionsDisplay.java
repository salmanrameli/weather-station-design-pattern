//package headfirst.designpatterns.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement { //CurrentConditionsDisplay implements observer so it can get changes from the WeatherData object
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) { //function to register the CurrentConditionsDisplay as an observer
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) { //saving the latest info on temperature and humidity
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() { //display the current temperature and humidity
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
