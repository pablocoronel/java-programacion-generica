package clases_propias;

public class Jefe extends Empleado {

	public Jefe(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}

	double incentivo(double incentivo) {
		return incentivo;
	}
}
