public class TestEmploye {

	public static void main(String[] args) {
	 

		
		
		
		Employe EH = new EmployeHoraire("Mehdi",50,8);
		System.out.println(EH.toString());
		//l'instanciation de la classe abstract Employe ne fonctionne pas ici
		// Employe Emp = new Employe("Mehdi",0);
		Employe E = new EmployeCommission("Rachid",50,50,3);
		
		System.out.println(E.toString());
	}

}