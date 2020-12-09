
public class TestEmploye {

	public static void main(String[] args) {
	 
		Employe E = new EmployeCommission("Nom",50,50,0.5);
		
		
		Employe EH = new EmployeHoraire("Mehdi",50,80);
		//l'instanciation de la classe normal Employe 
		//Employe Emp = new Employe("Mehdi",10);
		
		Employe EF = new Employe("ALAA",3300);
		
		
		System.out.println(EF.toString());
	}

}
