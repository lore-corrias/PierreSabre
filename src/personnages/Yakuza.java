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
}
