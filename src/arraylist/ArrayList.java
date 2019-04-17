package arraylist;

// clase para mostrar la programacion sin ser generica
public class ArrayList {
	private Object[] datosElemento;
	private int i = 0;

	// constructor
	public ArrayList(int z) {
		this.datosElemento = new Object[z];
	}

	// getter
	public Object get(int i) {
		return this.datosElemento[i];
	}

	// setter
	public void add(Object o) {
		this.datosElemento[i] = o;
		this.i++;
	}
}
