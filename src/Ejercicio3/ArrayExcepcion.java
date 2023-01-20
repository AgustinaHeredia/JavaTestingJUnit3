package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayExcepcion {
	static Scanner input = new Scanner(System.in);

	public void listanombre() {
		ArrayList<String> nombres = new ArrayList<String>();
	
		nombres.add("Juan");
		nombres.add("Pablo");
		nombres.add("Teo");
		nombres.add("Arnau");

	
		try {
			nombres.get(muestraposicion("Dí la posición que quieres ver"));
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ha intetado aceder a una posición fuera de la lista");
		
		}
	 	
	}
	public static int muestraposicion(String texto) {
		System.out.println(texto);
		int posicion = input.nextInt();
		
		return posicion;
	}
		
}

