package SampleGame;


public class Piquier extends Troupes {
	
	Piquier(String owner) {
		this.name = "Piquier";
		this.Owner = owner;
		this.vitesse = 3;
		this.vie = 1;
		this.degat = 1;
	}

	
	// toString

	@Override
	public String toString() {
		return super.toString() + name;
	}

}
