package es.iesjandula_eduardomorenoalgaba_transparencia37;

import java.util.Scanner;

public class TusInicialesBuclesMientras02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = (int) ((Math.random() * 100) + 1);
		int b, i;

		System.out.print(" Escribe un número entre 1 y 10: ");
		b = sc.nextInt();
		if (a == b) {
			System.out.println("¡Has acertado!");
			
		}
		else {
			System.out.println("incorrecto");
		}
		
}
}