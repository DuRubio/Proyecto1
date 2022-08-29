package Clases;

import java.util.Scanner;
import Clases.Cine;

public class PruebaCine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Cine cineMark = new Cine(5, 5);

		do {

			MenuPrincipal();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("------CineMark------/n");
				System.out.println("1 - Entrada individual/n");
				System.out.println("2 - Entrada en grupo/n");
				System.out.println("Probando");
				int eleccion = Integer.parseInt(sc.next());
				MenuBoletos(sc, cineMark, eleccion);
				break;
			}		
			case 2: {
				System.out.println(cineMark.getButacas());
				break;
			}
			case 3: { 
				System.out.println(cineMark.getLibres());
				break;
			}
			default:
				System.out.println("opcion no valida");
			}
		} while (opcion != 9);

	}

	private static void MenuBoletos(Scanner sc, Cine cineMark, int eleccion) {
		switch (eleccion) {
		case 1:
			System.out.println("Elegir columna deseada");
			int columnas = Integer.parseInt(sc.next());
			System.out.println("Elegir fila deseada");
			int filas = Integer.parseInt(sc.next());
			if (cineMark.ocuparButaca(columnas-1, filas-1) == true) {
				System.out.println("reservado con exito");
			} else {
				System.out.println("butaca no disponible");
			}
			break;
			
		case 2: 
			System.out.println("Elegir columna deseada");
			int columna = Integer.parseInt(sc.next());
			System.out.println("Indicar cantidad de entradas (menor a 5)");
			int cantidad = Integer.parseInt(sc.next());
			cineMark.hayEspacioPara(columna, cantidad);
			break;

		default:
			break;
		}
	}

	private static void MenuPrincipal() {
		System.out.println("------CineMark------\n");
		System.out.println("1 - Comprar entradas");
		System.out.println("2 - Ver estado de butacas");
		System.out.println("3 - Ver disponibilidad");
	}

}
