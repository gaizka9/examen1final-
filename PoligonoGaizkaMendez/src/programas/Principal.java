package programas;

import java.util.Scanner;

import figuras.Poligono;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String seguir = "n";// No seguir por defecto

		do {
			mostrarMenu();

			int opcion = teclado.nextInt();
			switch (opcion){
			case 1:
				obtenerPerimetroConLadosAltura();
				break;
			case 2:
				obtenerPerimetroConLadosLongitud();
				break;
			default:
				mostrarMensajeOpcionInvalida();
			}

			System.out.println("�Crear nuevo pol�gono? (S/N) ");
			seguir = teclado.next();
		} while (seguir.equalsIgnoreCase("s"));

	}

	private static void mostrarMensajeOpcionInvalida() {
		System.out.println("Introduce una opci�n v�lida.");
	}

	private static void obtenerPerimetroConLadosLongitud() {
		Poligono poligono;
		double longitudLado;
		int lados;
		System.out.println("Introduce el n�mero de lados:");
		lados = teclado.nextInt();
		System.out.println("Introduce la longitud de cada lado:");
		longitudLado = teclado.nextDouble();
		poligono = new Poligono("NUEVO POLIGONO");
		poligono.setLados(lados);
		poligono.setLongitudLado(longitudLado);
		System.out.println("Per�metro: " + poligono.getPerimetro());
	}

	private static void obtenerPerimetroConLadosAltura() {
		Poligono poligono;
		double altura;
		int lados;
		System.out.println("Introduce el n�mero de lados:");
		lados = teclado.nextInt();
		System.out.println("Introduce la altura al centro:");
		altura = teclado.nextDouble();
		poligono = new Poligono("NUEVO POLIGONO");
		poligono.setLados(lados);
		poligono.setAltura(altura);
		System.out.println("Per�metro: " + poligono.getPerimetro());
	}

	private static void mostrarMenu() {
		System.out.println("");
		System.out.println("Este programa crea un pol�gono con los datos introducidos por el usuario y calcula el per�metro.");
		System.out.println("Selecciona los datos de los que dispones:");
		System.out.println("1. N�mero de lados y Altura.");
		System.out.println("2. N�mero de lados y Longitud de un lado.");
	}

}
