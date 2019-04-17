package arraylist;

import java.util.ArrayList;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CON ARRRAY NORMAL
//		Empleado[] listaEmpleados = new Empleado[3];
//		
//		listaEmpleados[0] = new Empleado("cacho", 25, 20000);
//		listaEmpleados[1] = new Empleado("lola", 20, 20500);
//		listaEmpleados[2] = new Empleado("coco", 41, 10000);

		// CON ArrayList
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

		System.out.println("Tamaño antes de agregar elementos: " + listaEmpleados.size());
		
		listaEmpleados.add(new Empleado("cacho", 25, 20000));
		listaEmpleados.add(new Empleado("lola", 20, 20500));
		listaEmpleados.add(new Empleado("coco", 41, 10000));

		for (Empleado e : listaEmpleados) {
			System.out.println(e.dameDatos());
		}
	}

}

class Empleado {
	private String nombre;
	private double salario;
	private int edad;

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String dameDatos() {
		return "El empleado se llama " + this.nombre + ", tiene " + this.edad + " años y un salario de " + this.salario;
	}
}