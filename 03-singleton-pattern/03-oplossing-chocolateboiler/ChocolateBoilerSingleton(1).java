// Een kookketel waarvan maar 1 instantie kan bestaan.
// De ketel begint leeg. De gebruikscyclus is: vullen, koken, leegmaken.
public class ChocolateBoilerSingleton {
	private boolean empty;
	private boolean boiled;
	
	// De unieke instantie, private static
	private static ChocolateBoilerSingleton instance;
	
	// De constructor moet private zijn!
	private ChocolateBoilerSingleton() {
		empty = true;
		boiled = false;
	}
	
	// Accessormethode voor de unieke instantie (public static)
	public static ChocolateBoilerSingleton getInstance() {
		if (instance == null) {
			instance = new ChocolateBoilerSingleton();
		}
		return instance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
			boiled = false;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}

	