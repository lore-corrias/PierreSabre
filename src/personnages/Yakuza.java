package personnages;

public class Yakuza extends Humaine {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int gaigne = 0;
		
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() +  ", si tu tiens à la vie donne moi ta bourse !");
		gaigne = victime.seFaireExtorter();
		super.gagnerArgent(gaigne);
		super.parler("J’ai piqué les " + gaigne + " sous de " + victime.getNom() + ", ce qui me fait " + super.getArgent() + 
				" sous dans ma poche. Hi ! Hi !");
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public int perdre() {
		int argent = super.getArgent();
		super.parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan);
		super.perdreArgent(argent);
		reputation--;
		return argent;
	}
	
	public void gagner(int gain) {
		super.parler("Ce ronin pensait vraiment battre " + super.getNom() + " du clan de " + clan + " ?\n"
				+ "Je l'ai dépouillé de ses " + gain + " sous");
		super.gagnerArgent(gain);
		reputation++;
	}
}
