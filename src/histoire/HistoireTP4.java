package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		/*
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
		
		Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuza.direBonjour();
		yakuza.extorquer(commercant);
		
		Ronin ronin = new Ronin("Roro", "shochu", 60);
		ronin.donner(commercant);
		
		ronin.provoquer(yakuza);
		*/
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		akimoto.faireConnaissanceAvec(marco);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		chonin.listerConnaissance();
		akimoto.listerConnaissance();
		
		akimoto.boire("thé");
	}
}
