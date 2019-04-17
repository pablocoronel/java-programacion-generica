package clases_propias;

// clase generica
// por convencion se indica una letra T, U o K
public class Pareja<T> {

	private T primero;

	public Pareja() {
		this.primero = null;
	}

	// setter, recibe un elemento generico
	public void setPrimero(T arg) {
		this.primero = arg;
	}

	// getter
	// devuelve un elemento en principio, generico
	public T getPrimero() {
		return this.primero;
	}
}
