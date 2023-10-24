package personnages;

public class Ronin extends Humaine {
	public Ronin(String nom, String boissonFavourite, int argent) {
		super(nom, boissonFavourite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = super.getArgent() / 10;
		super.parler(beneficiaire.getNom() + " prend ces " + argent + " sous");
		super.perdreArgent(argent);
		beneficiaire.recevoir(argent);
	}
}
