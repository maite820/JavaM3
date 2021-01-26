import java.util.*;



public class JavaM3Fase3 {
	


	public static void main(String[] args) {
		// definir array
				
	ArrayList<String> Ciudades = new ArrayList<String>(); 
	ArrayList<String> Ciudades2 = new ArrayList<String>();
	
	
	
	for (int i=0; i<6;i++) {	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre de la ciudad: ");
		
		Ciudades.add(sc.nextLine());
		
	}
	
	for(String el: Ciudades) {
		String NouNom;
		NouNom = el.replace("a","4");
		
		System.out.println(NouNom);
		Ciudades2.add(NouNom);
		}   
	


	
	Collections.sort(Ciudades2);
	System.out.print(Ciudades2);
	

	
}  
}
