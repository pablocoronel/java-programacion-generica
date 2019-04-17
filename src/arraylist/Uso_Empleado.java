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

		// agregar elementos
		listaEmpleados.add(new Empleado("cacho", 25, 20000));
		listaEmpleados.add(new Empleado("lola", 20, 20500));
		listaEmpleados.add(new Empleado("coco", 41, 10000));

		// agregar en una posicion en particular
		listaEmpleados.add(1, new Empleado("laura", 15, 30000));

		// agregar en una posicion en particular, pero lo reemplaza
		listaEmpleados.set(3, new Empleado("lolo", 30, 18000));

		System.out.println("Tamaño del ArrayList: " + listaEmpleados.size());

		System.out.println("con foreach");
		// con foreach
		for (Empleado e : listaEmpleados) {
			System.out.println(e.dameDatos());
		}

		System.out.println("\ncon for normal");
		// con for
		for (int i = 0; i < listaEmpleados.size(); i++) {
			Empleado e = listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}

		System.out.println("");
		System.out.println("En posicion 2: " + listaEmpleados.get(2).dameDatos());
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