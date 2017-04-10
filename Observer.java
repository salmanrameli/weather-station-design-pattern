public interface Observer {
	//function to update the observers, giving temp, humidity, and float pressure when a weather measurement changes
	public void update(float temp, float humidity, float pressure);
}
