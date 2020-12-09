
abstract class Employe {
	
	private String nom ;
	private static double salaire;
	
	
	public Employe(String N, double S)
	{
		setNom(N);
		setSalaire(S);
		
	}
	public Employe(String N)
	{
		setNom(N);
		 
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		Employe.salaire = salaire;
	}
	
	public String toString()
	{
		return "Nom : "+getNom()+" son salaire est : "+getSalaire()+" DHS.";
	}

}
