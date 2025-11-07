package personnages;


public class Village {
	private String nom;
	private int nbVillageois;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		this.chef = chef;
		this.nom = nom;
		this.nbVillageois = 0;
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return this.chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (0 < numVillageois && numVillageois <= nbVillageois) {
			return villageois[numVillageois-1];
		}
		else { 
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
			}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + this.getNom() + "\" du chef " + this.getChef() + " vivent les légendaires gaulois : ");
		for (int i = 1; i <= nbVillageois; i++) {
			System.out.println("- " + this.trouverVillageois(i));
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",25);
		Gaulois doublepolemix = new Gaulois("DoublePolémix",4);
		
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		asterix.sePresenter();
		abraracourcix.sePresenter();
		doublepolemix.sePresenter();
	}
	
}
