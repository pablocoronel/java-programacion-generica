package clases_propias;

public class Herencia_Genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Empleado administrativa = new Empleado("ana", 25, 20000);
//		Jefe directora_comercial = new Jefe("maria", 20, 15000);
////		el tipo Jefe tambien puede se del tipo Empleado, por herencia
//		Empleado nuevo_empleado = directora_comercial;

		/*************************************************/
		// generica
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		Pareja<Jefe> directora_comercial = new Pareja<Jefe>();

		// el principio de sustitucion NO funciona
		// Pareja<Empleado> nuevo_empleado = directora_comercial;

		
		Pareja.imprimirTrabajador(administrativa);
		// funciona ya que el metodo declara que acepta los subtipos tambien (clases hijas)
		Pareja.imprimirTrabajador(directora_comercial);
	}

}
