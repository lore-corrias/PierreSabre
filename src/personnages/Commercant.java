package personnages;

public class Commercant extends Humaine {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorter() {
		int argent = super.getArgent();
		super.perdreArgent(argent);
		super.parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		super.parler(argent + " sous ! Je te remercie généreux donateur!");
		super.gagnerArgent(argent);
	}
}
