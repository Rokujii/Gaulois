package objets;


public class Chaudron {

	private int quantitepotion ;
	private int forcepotion ; 

	public Chaudron() {
		
	}

	public void remplirchaudron(int quantite , int forcepotion) {
		quantitepotion = quantite;
		this.forcepotion = forcepotion;
	}

	public boolean resterpotion() {
		if (quantitepotion ==0) {
			return true;		
		}
		else {
			return false;
		}
	}

	public int prendreLouche() {
		if (quantitepotion == 0) {
			return forcepotion = 0 ;
		}
		else {
			quantitepotion --;
			return forcepotion;
		}
	}
}