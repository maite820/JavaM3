import java.util.*;



public class JavaM3Fase1 {

	public static void main(String[] args) {
		// array introduir ciutats
				
	String [] Ciudades = new String [6]; 
	for (int i=0; i<6;i++) {	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre de la ciudad: ");
		
		Ciudades [i]= sc.nextLine();
	}
	
	for(String el: Ciudades) {
					 
	  System.out.println(el);
	}   

	}

}    