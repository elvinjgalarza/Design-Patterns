
// DisplayElement is an Observer so that it can get changes
// from the WeatherData object
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// this constructor is passed the Subject,
	// and we can use it to register as an observer
	public CurrentConditionsDisplay(Subject weather) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humdity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
		
	}
}
