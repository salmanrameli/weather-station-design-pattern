//package headfirst.designpatterns.observer.weather;

public interface Observer {
	//function to update the observers, giving temp, humidity, and float pressure whern a weather measurement changes
	public void update(float temp, float humidity, float pressure);
}
