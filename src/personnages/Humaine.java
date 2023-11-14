package personnages;

public class Humaine {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private final int maxConnaissance = 30;
	protected int nbConnaissance = 0;
	protected Humaine[] memoire = new Humaine[maxConnaissance];
	
	public Humaine(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	protected void parler(String message) {
		System.out.println("(" + nom + ") - " + message);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom  + " et j’aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(argent < prix) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " 50 sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int pertre) {
		argent -= pertre;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void faireConnaissanceAvec(Humaine homme) {
		direBonjour();
		homme.repondre(this);
		memoriser(homme);
	}
	
	private void repondre(Humaine homme) {
		direBonjour();
		memoriser(homme);
	}
	
	private void memoriser(Humaine homme) {
		if(nbConnaissance == maxConnaissance) {
			for(int i = 1; i < nbConnaissance; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nbConnaissance - 1] = homme;
		} else {
			memoire[nbConnaissance++] = homme;
		}
	}
	
	public void listerConnaissance() {
		StringBuilder sb = new StringBuilder();
		sb.append("Je connais beacoup de monde dont : ");
		for(int i = 0; i < nbConnaissance; i++) {
			sb.append(memoire[i].getNom());
			if(i != nbConnaissance - 1)
				sb.append(", ");
		}
		parler(sb.toString());
	}
}
