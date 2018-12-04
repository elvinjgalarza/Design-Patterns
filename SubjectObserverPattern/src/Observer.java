
public interface Observer {
	// public void update(float temp, float humidity, float pressure);
	// above definition is bad because of potential change
	
	public void update(float temp, float hum, float press);
}
