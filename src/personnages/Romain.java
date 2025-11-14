package personnages;

import objets.Equipement;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
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
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat "
			+ this.getNom() 
			+ " est déjà bien protégé !");
			break;
		}
		case 1: {
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " 
				+ this.getNom() 
				+ " possède déjà un "
				+ equipement.toString());
			}
			else {
				nbEquipement++;
				equipements[1] = equipement;
				System.out.println("Le soldat "
				+ this.getNom()
				+ " s'équipe avec un "
				+ equipement.toString());
			}
			break;
		}
		case 0: {
			nbEquipement++;
			equipements[0] = equipement;
			System.out.println("Le soldat "
			+ this.getNom()
			+ " s'équipe avec un "
			+ equipement.toString());
			break;
		}
	}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);

	}
}