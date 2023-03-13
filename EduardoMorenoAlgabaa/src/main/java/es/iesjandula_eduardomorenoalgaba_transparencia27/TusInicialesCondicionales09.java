package es.iesjandula_eduardomorenoalgaba_transparencia27;
import java.util.Scanner;
public class TusInicialesCondicionales09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, primer=0;
		System.out.println("dime un numero");
		n=sc.nextInt();
		
			if ( n < 10 ) {
			      primer = n;
			    }
			    
			    if (( n >= 10 ) && ( n < 100 )) {
			      primer = n / 10;
			    }
			    
			    if (( n >= 100 ) && ( n < 1000 )) {
			      primer = n / 100;
			    }
			    
			    if (( n >= 1000 ) && ( n < 10000 )) {
			      primer = n / 1000;
			    }
			    
			    if ( n >= 10000 ) {
			      primer = n / 10000;
			 
			    }
		System.out.println(primer);
		}

	}


