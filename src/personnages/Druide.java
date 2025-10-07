package personnages;


import objets.Chaudron;


public class Druide {
	
	private String nom ;
	private int  force ;
	Chaudron chaudron = new Chaudron();

	public Druide(String nom,Integer force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreparole() + texte );		
	}

	private String prendreparole() {
		return "Le druide " + nom + " :";
	}

	public void fabriquerportion(Integer quantite , Integer forcepotion){
		chaudron.remplirchaudron(quantite, forcepotion);
		parler("J'ai concocté "+ quantite +" doses de potion magique. Elle a une force de "+ forcepotion);				
	}

	public void booster(Gaulois gaulois) {
		if ( chaudron.resterpotion() == false) {
			if (gaulois.getNom() == "Obelix") {
				parler("Non, "+ gaulois.getNom() + " Non !... Et tu le sais très bien !");		
			}
			else {
				gaulois.boirepotion(chaudron.prendreLouche());
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");	
			}
		}
		else {
			parler("Désolé "+ gaulois.getNom() + ", il n y a plus une seule goutte de potion.");			
		}		
	}

	public String getnom() {
		return nom;

	}

		

	

	


}