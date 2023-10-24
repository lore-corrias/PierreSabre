package personnages;

public class Ronin extends Humaine {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavourite, int argent) {
		super(nom, boissonFavourite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + argent + " sous");
		perdreArgent(argent);
		beneficiaire.recevoir(argent);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur--;
		}
	}
}
