package personnages;


public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village = null;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	@Override
	public String toString() {
		return this.nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom +" envoie un gros coup à la machoire de "+ romain.getNom());
		romain.recevoircoup((force*effetPotion) /3);
		if (effetPotion>1) {
			effetPotion --;
		}
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}

	public void boirepotion(Integer forcepotion) {
		effetPotion = forcepotion;		
	}
	
	public void sePresenter() {
		if (this == village.getChef()) {
			System.out.println("Bonjour, je m'appelle " + this.getNom() + ". Je suis le chef du village \"" + village.getNom() + "\"");
		}
		else if (this.village == null) 
			System.out.println("Le Gaulois " + this.getNom() + ": Bonjour, je m'appelle " + this.getNom() + ". Je voyage de villages en villages.");
		
		else 
			System.out.println("Le Gaulois " + this.getNom() + ": Bonjour, je m'appelle " + this.getNom() + ". J'habite le village \"" + village.getNom() + "\".");
	}
}


