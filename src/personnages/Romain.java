package personnages;


public class Romain {
	
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		this.force = this.force - force ;
		if (this.force <1) {
			parler("J'abandonne !");			
		}
		else {
			parler("Aïe !");
		}		
	}
}


