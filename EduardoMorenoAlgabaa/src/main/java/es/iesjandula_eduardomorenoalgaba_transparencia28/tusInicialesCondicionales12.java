package es.iesjandula_eduardomorenoalgaba_transparencia28;
import java.util.Scanner;
public class tusInicialesCondicionales12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pc1,pc2,rec=0,media;
		System.out.println("dime nta del primer control");
		pc1=sc.nextInt();
		System.out.println("dime la nota del segundo control");
		pc2=sc.nextInt();
		media=(pc1+pc2)/2;
		System.out.println("tu media es de "+media);
		if(media<5) {
			System.out.println("ha superado la recuperacion (pulsa 1 si pulsa 2 no)");
			rec=sc.nextInt();
			
		}
		if (rec == 1) {
			System.out.println("tu media es de 5");
		}
		else {
			System.out.println("tu media es de" +media);
		}
		
	
	
	
	}
}
