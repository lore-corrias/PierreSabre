package histoire;

import personnages.Commercant;
import personnages.Humaine;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humaine humaine = new Humaine("Prof", "kombucha", 54);
		humaine.direBonjour();
		humaine.acheter("boisson", 12);
		humaine.boire();
		humaine.acheter("jeu", 2);
		humaine.acheter("kimono", 50);
		
		Commercant commercant = new Commercant("Marco", 40);
		commercant.direBonjour();
		commercant.seFaireExtorter();
		commercant.recevoir(15);
		commercant.boire();
		
		Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Yakuza");
		yakuza.direBonjour();
		yakuza.extorquer(commercant);
		
		Ronin ronin = new Ronin("Roro", "shochu", 60);
		ronin.donner(commercant);
	}
}
