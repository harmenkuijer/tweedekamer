package data;

import java.util.Random;


public class Dienst {
	private static String[] antwoorden = {
		"Pleur op.",
		"Haal lekker zelf.",
		"Hoe drinkt u uw koffie?"		
	};
	
	private static Random rnd = new Random();
	
	public static String getAntwoord() {
		int foo = rnd.nextInt(antwoorden.length);
		return antwoorden[foo];
	}
}
