package objets;


public class Chaudron {

	private int quantitePotion ;
	private int forcePotion ; 

	public Chaudron() {
		
	}

	public void remplirChaudron(int quantite , int forcepotion) {
		quantitePotion = quantite;
		this.forcePotion = forcepotion;
	}

	public boolean resterPotion() {
		if (quantitePotion ==0) {
			return true;		
		}
		else {
			return false;
		}
	}

	public int prendreLouche() {
		if (quantitePotion == 0) {
			return forcePotion = 0 ;
		}
		else {
			quantitePotion --;
			return forcePotion;
		}
	}
}