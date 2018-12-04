
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer  o);
	
	// called when Subject's state has changed
	public void notifyObserver(); 
}
