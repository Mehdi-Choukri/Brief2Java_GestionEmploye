
public class EmployeCommission extends Employe{
	
	
	 

	public EmployeCommission(String N,double S,int V, double C) {
		super(N,S);
		 setSalaire(getSalaire() + V * C);

	}

	 
	
	 

}
