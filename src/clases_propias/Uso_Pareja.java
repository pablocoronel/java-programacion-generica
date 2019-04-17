package clases_propias;

// por la programacion generica, la clase Pareja se adapata al tipo de dato que se maneja en distintas instancias
public class Uso_Pareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia de la clase generica, indicandole el tipo de objecto que va a
		// manejar
		Pareja<String> una = new Pareja<String>();

		// carga del objeto de tipo particular
		// el ide ya marca el argumento del metodo del tipo String en este caso, lo toma
		// a partir de lo especificado en <T> de la instancia
		una.setPrimero("Pablo");

		// ver
		// devuelve un tipo String, a partir de lo indicado en la instancia
		System.out.println(una.getPrimero());

		Persona persona_1 = new Persona("ana");

		Pareja<Persona> otra = new Pareja<Persona>();

		otra.setPrimero(persona_1);

		System.out.println(otra.getPrimero());
	}

}

class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

}