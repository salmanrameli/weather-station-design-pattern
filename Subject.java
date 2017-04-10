public interface Subject {
	//methods that take an observer as an argument; to be registered or removed
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);

	//called to notify all observers when the subject's state has changed
	public void notifyObservers();
}
