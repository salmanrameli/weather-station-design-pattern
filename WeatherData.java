import java.util.*;

public class WeatherData implements Subject { //WeatherData implements Subject interface
	private ArrayList<Observer> observers; //Adding an array list to hold the observers
	private float temperature;
	private float humidity;
	private float pressure;

	WeatherData() {
		observers = new ArrayList<Observer>();
	} //create an array list in the constructor
	
	public void registerObserver(Observer o) {
		observers.add(o);
	} //add observer to the list when an observer register itself
	
	public void removeObserver(Observer o) { //unregister an observer when the observer unregister itself
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() { //giving observers new information
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	private void measurementsChanged() {
		notifyObservers(); //notify the observers whenever the measurements have been updated
	}
	
	void setMeasurements(float temperature, float humidity, float pressure) { //giving the program some parameters just to test whether the program is running correctly or not
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
