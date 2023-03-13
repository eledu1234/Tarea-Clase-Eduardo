package es.iesjandula_eduardomorenoalgaba_transparencia27;
import java.util.Scanner;
public class TusInicialesCondicionales10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador=0, n,r=0;
		System.out.println("dime un numero");
		n=sc.nextInt();
		if ( n < 10 ) {
		     r=  contador + 1;
		    }
		    
		    if (( n >= 10 ) && ( n < 100 )) {
		    	 r=  contador + 1;
		    }
		    
		    if (( n >= 100 ) && ( n < 1000 )) {
		    	 r=  contador + 1;
		    }
		    
		    if (( n >= 1000 ) && ( n < 10000 )) {
		    	 r=  contador + 1;
		    }
		    
		    if ( n >= 10000 ) {
		    	 r=  contador + 1;
		 
		    }
	System.out.println(r);
	}

}
