package es.iesjandula_eduardomorenoalgaba_transparencia26;

import java.util.Scanner;

public class TusInicialesCondicionales02 {
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int h = 0;
		System.out.println("dime una hora");
		h = sc.nextInt();

		switch (h) {
			case 6:
			case 7: 
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			 {
				System.out.println("buenos dias");
			}
			break;
			case 13, 14, 15, 16, 17, 18, 19, 20: {
				System.out.println("buenas tardes");
			}
			break;
			case 21, 22, 23, 24, 1, 2, 3, 4, 5: {
				System.out.println("buenas noches");
			}
			default: System.out.println("error");
		}
		sc.close();
	}
}
