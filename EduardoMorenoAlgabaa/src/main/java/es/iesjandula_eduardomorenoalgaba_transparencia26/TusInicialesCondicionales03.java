package es.iesjandula_eduardomorenoalgaba_transparencia26;
import java.util.Scanner;
public class TusInicialesCondicionales03 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
     int asignatura, dia;
     System.out.println("dime un dia del 1 al 7");
     dia=sc.nextInt();
     switch (dia){
         case 1: System.out.println("lunes");
         break;
         case 2: System.out.println("martes");
         break;
         case 3: System.out.println("miercoles");
         break;
         case 4: System.out.println("jueves");
         break;
         case 5: System.out.println("viernesa ");
         break;
         case 6: System.out.println("sabado");
         break;
         case 7: System.out.println("domingo");
         break;
         default: System.out.println("error");
         
                 
                 }
     sc.close();
 
 
 
 
 
 
 }
 
}


