package clases_propias;

import java.util.GregorianCalendar;

public class Metodos_Genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres = { "jose", "maria", "pep" };

		// <String> en el metodo generico no es obligatorio
		String elementos = Mis_Matrices.<String>getElementos(nombres);

		System.out.println(elementos);

		// normal
//		Empleado[] listaEmpleados = new Empleado[5];
//		listaEmpleados[0] = new Empleado("cacho", 25, 20000);
//		listaEmpleados[1] = new Empleado("cacho", 25, 20000);
//		listaEmpleados[2] = new Empleado("cacho", 25, 20000);
//		listaEmpleados[3] = new Empleado("cacho", 25, 20000);
//		listaEmpleados[4] = new Empleado("cacho", 25, 20000);

		// el metodo generico permite que cambie el tipo de parametro recibido en el
		// metodo y funcione igual, ya que se adapta a al tipo necesario

		// declarado entre llaves
		Empleado[] listaEmpleados = { new Empleado("cacho", 25, 20000), new Empleado("cacho", 25, 20000),
				new Empleado("cacho", 25, 20000), new Empleado("cacho", 25, 20000), new Empleado("cacho", 25, 20000) };

		System.out.println(Mis_Matrices.getElementos(listaEmpleados));

		/***************************************************************************/
		// uso de metodo generico con return generico tambien
		// array de String
		String[] apellidos = { "Lopez", "Garcia", "Perez" };

		System.out.println(Mis_Matrices.getMenor(apellidos));

		/****************************************************************************/
		GregorianCalendar[] fechas = { new GregorianCalendar(2015, 05, 12), new GregorianCalendar(2012, 05, 12),
				new GregorianCalendar(2014, 05, 12) };
		
		System.out.println(Mis_Matrices.getMenor(fechas));
	}

}

// clase que contiene un metodo generico, no es necesario que la clase tambien sea generica
class Mis_Matrices {

	// metodo generico, indicado con <T>
	// es estatico solo para un uso sin instancia en el ejemplo
	// el argunmento que recibe tambien es generico, por eso la T delante del array
	public static <T> String getElementos(T[] a) {
		return "El array tiene " + a.length + " elementos";
	}

	// metedo generico que tambien devuelve un valor generico
	// <T extends Comparable<T>> => indica que los tipos usados deben implementar la
	// interface Comparable
	public static <T extends Comparable<T>> T getMenor(T[] arg) {
		if (arg == null || arg.length == 0) {
			return null;
		}

		// comparacion, con el metodo compareTO() de la interface Comparable
		T elemento_menor = arg[0];

		for (int i = 1; i < arg.length; i++) {
			// uso del metodo comàreTo de la interface Comparable
			// -1 si es menor, 0 si es igual, +1 si es mayor
			if (elemento_menor.compareTo(arg[i]) > 0) {
				elemento_menor = arg[i];
			}
		}

		return elemento_menor;
	}
}
