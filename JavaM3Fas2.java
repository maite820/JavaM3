import java.util.*;

public class JavaM3Fas2 {

	public static void main(String[] args) {
		// definir array
				
	ArrayList<String> Ciudades = new ArrayList<String>(); 
	
	for (int i=0; i<6;i++) {	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre de la ciudad: ");
		
		Ciudades.add(sc.nextLine());
	}
	 Collections.sort(Ciudades);

	for(String el: Ciudades) {
					 
	  System.out.println(el);
	}   



	}

}    