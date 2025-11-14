package personnages;


public class Romain {
	
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified() : "Invariant rompu : force négative après construction !";
	}

	public String getNom() {
		return nom;
	}	

	public void parler(String texte) {	
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {			
		return "Le romain " + nom + " : ";
	} 

	public void recevoircoup(int force) {
		assert force >= 0 : "Invariant rompu : force négative après construction !";
		int forceTemp = this.force;
		this.force = this.force - force ;
		if (this.force <1) {
			parler("J'abandonne !");			
		}
		else {
			parler("Aïe !");
		}
		assert isInvariantVerified() : "Invariant rompu : force négative après construction !";
		assert forceTemp > this.force;
	}
	
	private Boolean isInvariantVerified() {
		return this.force >= 0;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	}
}