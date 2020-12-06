package exercice2;

public class Animal {

	public String name;
	public String aboyer;
	public String manger;
	public String message;

	Animal(String name) {
		this.name = name;
	}
	
	public void aboyer(String aboyer) {
		this.aboyer = aboyer;
	}
	public void manger(String manger) {
		this.manger = manger;
	}

	@Override
	public String toString() {
		if(this.name == "Rex") {
			this.message = "Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande";
		}
		if(this.name == "Max") {
			this.message = "Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson";
		}
		return "name: " + this.name + "\n aboyer: " + this.aboyer + "\n manger: " + this.manger + "\n message: " + this.message;
	}
}
