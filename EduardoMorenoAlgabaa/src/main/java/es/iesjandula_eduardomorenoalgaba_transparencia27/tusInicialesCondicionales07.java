package es.iesjandula_eduardomorenoalgaba_transparencia27;
import java.util.Scanner;
public class tusInicialesCondicionales07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, par,div;
		System.out.println("dime un numero");
		num=sc.nextInt();
		if(num%5 == 0 ) {
			System.out.println("el numero es divisible de 5");
			}
		else {
			System.out.println("no es divisible por 5");
				}
		if(num%2 == 0) {
			System.out.println("es par");
		}
		else {
			System.out.println("no es par");
		}
	}
}
