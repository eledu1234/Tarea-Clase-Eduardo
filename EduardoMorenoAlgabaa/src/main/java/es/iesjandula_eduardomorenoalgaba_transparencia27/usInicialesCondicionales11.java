package es.iesjandula_eduardomorenoalgaba_transparencia27;
import java.util.Scanner;
public class usInicialesCondicionales11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean capicua=false;
		System.out.println("dime un numero");
		n=sc.nextInt();
		if (n < 10) {
		      capicua = true;
		      
		}
		    
		    // número de dos cifras
		    if ((n >= 10) && (n < 100)) {
		      if ((n / 10) == (n % 10)) {
		        capicua = true;
		      }
		    }

		    // número de tres cifras
		    if ((n >= 100) && (n < 1000)) {
		      if ((n / 100) == (n % 10)) {
		        capicua = true;
		      }
		    }

		    // número de cuatro cifras
		    if ((n >= 1000) && (n < 10000)) {
		      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
		        capicua = true;
		      }
		    }
		    
		    // número de cinco cifras
		    if (n >= 10000) {
		      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
		        capicua = true;
		      }
		    }
		    
		    if (capicua) {
		      System.out.println("El número introducido es capicúa.");
		    } else {
		      System.out.println("El número introducido no es capicúa.");
		    }
		  }
		

	}


