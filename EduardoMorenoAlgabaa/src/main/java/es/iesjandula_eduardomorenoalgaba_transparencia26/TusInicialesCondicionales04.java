package es.iesjandula_eduardomorenoalgaba_transparencia26;
import java.util.Scanner;
public class TusInicialesCondicionales04 {

	public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int asignatura, dia;
        System.out.println("dime un dia del 1 al 7");
        dia=sc.nextInt();
        switch (dia){
            case 1: System.out.println("a primera tienes base de datos");
            break;
            case 2: System.out.println("a primera tienes programacion");
            break;
            case 3: System.out.println("a primera tienes sistemas informaticos");
            break;
            case 4: System.out.println("a primera tienes FOL");
            break;
            case 5: System.out.println("a primera tienes programacion");
            break;
            case 6: System.out.println("a primera tienes casita");
            break;
            case 7: System.out.println("a primera tienes programacion del sueño");
            break;
            
                    
                    }
    
        sc.close();
	}

}
