package personnages;


public class Village {
	private String nom;
	private int nbVillageois;
	Gaulois[] villageois;
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		
	}
	
	public void afficherVillage() {
		
	}
	
}
