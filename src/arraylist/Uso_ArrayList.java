package arraylist;

import java.io.File;

//clase para mostrar la programacion sin ser generica
public class Uso_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList archivos = new ArrayList(5);

		archivos.add("juan");
		archivos.add("pablo");
		archivos.add("carlos");
		archivos.add("lisandro");

		// 1er error, obliga a casterar todo lo retornado

		// con File
		archivos.add(new File("algo.txt"));

		// File nombrePersona = (File)archivos.get(2);

		// 2do error, no marca error en tiempo de COMPILACION si se quiere acceder a un
		// elemento de
		// tipo File cuando explicitamente se esta indicando que se espera un objeto de
		// tipo String, el error se ve en tiempo de ejecución
		String nombrePersona = (String) archivos.get(4);

		System.out.println(nombrePersona);
	}

}
