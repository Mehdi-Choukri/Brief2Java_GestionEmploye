
public class EmployeCommission extends Employe{
	
	 
	public double salaireC;

	public EmployeCommission(String N,double S,int V, double C) {
		super(N,S);
		 setSalaire(getSalaire() + V * C);
		 salaireC = getSalaire() + V * C;

	}
	public double getSalaireC()
	{
		return this.salaireC;
	}
	 
	public String toString()
	{
		return "Nom : "+getNom()+" son salaire est : "+getSalaireC()+" DHS.";
	}
	
	 

}
