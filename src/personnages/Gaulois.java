package personnages;


public class Gaulois {
	
	private String nom;
	private int force;
	private  Integer effetPotion = 1;

	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom +" envoie un gros coup à la machoire de "+ romain.getNom());
		romain.recevoircoup((force*effetPotion) /3);
		if (effetPotion>1) {
			effetPotion --;
		}
	}

	public void boirepotion(Integer forcepotion) {
		effetPotion = forcepotion;		
	}

}


