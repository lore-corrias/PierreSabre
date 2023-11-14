package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	private final int nbType = 6;
	
	private enum TypeHumain {
		HUMAIN("habitant"),
		COMMERCANT("commercant"),
		RONIN("ronin"),
		SAMOURAI("samourai"),
		GRANDMERE("grand-mere"),
		YAKUZA("yakuza");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom = nom;
		}
		
		public String getNom() {
			return nom;
		}
	}

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	public void ragoter() {
		String message = "";
		for(int i = 0; i < getNbConnaissance(); i++) {
			Humain connaissance = memoire[i];
			if(connaissance instanceof Traitre) {
				message = "Je sais que " + connaissance.getNom() + " est un traître. Petit chenapan !";
			} else {
				message = "Je crois que " + connaissance.getNom() + " est un " + humainHasard();
			}
			parler(message);
		}
	}
	
	@Override
	protected void memoriser(Humain homme) {
		if(getNbConnaissance() >= 5) {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une "
					+ "personne supplémentaire !");
		} else {
			super.memoriser(homme);
		}
	}

	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		Random rand = new Random();
		return types[rand.nextInt(nbType)].getNom();
	}
}
