package exercice3;

public class account {
	private String name;
	private String adress;
	private double solde;
	
	account(String name, String adress, double solde) {
		this.name = name;
		this.adress = adress;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "name: " + this.name + ", adress: " + this.adress + ", solde: " + this.solde + ", compteInfo: " + this.name + " " + this.adress + " " + this.solde  ;
	}	
}
