import java.util.Scanner;
import java.lang.*;

public class JavaM3Fase4 {
	// invertir el nombre de las ciudades

	public static void main(String[] args) {
		
 
		  
		String [] Nombres = new String [6];  
		
		for (int i=0; i<6;i++) {	
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce nombre de la ciudad: ");
			
			Nombres [i]  = sc.nextLine();
		}
		
		for (int i = 0; i < Nombres.length; i++) {
			String NouNom;
			NouNom = Nombres[i];
			StringBuilder sb= new StringBuilder(NouNom);
			
			System.out.println(sb.reverse());
		}   
	 }
	 }

	 
	 
