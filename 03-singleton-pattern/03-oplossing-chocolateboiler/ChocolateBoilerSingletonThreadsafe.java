// Een kookketel waarvan maar 1 instantie kan bestaan, threadsafe.
// De ketel begint leeg. De gebruikscyclus is: vullen, koken, leegmaken.
public class ChocolateBoilerSingletonThreadsafe {
	private boolean empty;
	private boolean boiled;
	
	// De unieke instantie, volatile static
	private volatile static ChocolateBoilerSingletonThreadsafe instance;
	
	// De constructor moet private zijn!
	private ChocolateBoilerSingletonThreadsafe() {
		empty = true;
		boiled = false;
	}
	
	// Een static getInstance met double checked locking
	public static ChocolateBoilerSingletonThreadsafe getInstance() {
		if (instance == null) {
			synchronized (ChocolateBoilerSingletonThreadsafe.class) {
				if (instance == null)
					instance = new ChocolateBoilerSingletonThreadsafe();
			}
		}
		return instance;
	}
	
    public void fill() {
        if (isEmpty()) {
			synchronized (ChocolateBoilerSingletonThreadsafe.class) {
                if (isEmpty()) {
                    ChocolateBoiler.empty = false;
                    ChocolateBoiler.boiled = false;
                }
            }
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
			synchronized (ChocolateBoilerSingletonThreadsafe.class) {
                if (!isEmpty() && isBoiled()) {
                    ChocolateBoiler.empty = true;
                }
            }
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()) {
			synchronized (ChocolateBoilerSingletonThreadsafe.class) {
                if (!isEmpty() && !isBoiled()) {
                    ChocolateBoiler.boiled = true;
                }
            }
        }
    }

    public boolean isEmpty() {
			synchronized (ChocolateBoilerSingletonThreadsafe.class) {
            return ChocolateBoiler.empty;
        }
    }

    public boolean isBoiled() {
			synchronized (ChocolateBoilerSingletonThreadsafe.class) {
            return ChocolateBoiler.boiled;
        }
    }
}	