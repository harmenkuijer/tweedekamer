package data;

import java.util.ArrayList;
import java.util.Random;

import personen.Interviewer;
import personen.Persoon;
import personen.TweedeKamerlid;
import personen.Bode;


/* TODO optimalisatie (memory-management) */

public class Data {
	private static Random rnd = new Random();
	private static ArrayList<ArrayList<? extends Persoon>> personen = new ArrayList<>();
	
	public static ArrayList<TweedeKamerlid> getKamerleden() { 
		ArrayList<TweedeKamerlid> rv = new ArrayList<>();
		personen.add(rv);
		
		TweedeKamerlid thieme = new TweedeKamerlid();
		thieme.setGeboortedatum("6 maart 1972");
		thieme.setGender('V');
		thieme.setNaam("Thieme");
		thieme.setPartij("PvdD");
		
		TweedeKamerlid rutte = new TweedeKamerlid();
		rutte.setGeboortedatum("14 februari 1967");
		rutte.setGender('M');
		rutte.setNaam("Rutte");
		rutte.setPartij("VVD");
		
		TweedeKamerlid baudet = new TweedeKamerlid(); 
		baudet.setGeboortedatum("28 januari 1983");
		baudet.setGender('M');
		baudet.setNaam("Baudet");
		baudet.setPartij("FvD");
		
		TweedeKamerlid agema = new TweedeKamerlid();
		agema.setGeboortedatum("16 september 1976");
		agema.setGender('V');
		agema.setNaam("Agema");
		agema.setPartij("PVV");
		
		rv.add(thieme);
		rv.add(rutte);
		rv.add(baudet);
		rv.add(agema);
		
		personen.add(rv);
		return rv;
	}
	
	
	public static ArrayList<Interviewer> getPersmuskieten() { 
		ArrayList<Interviewer> rv = new ArrayList<>();
		
		Interviewer castricum = new Interviewer();
		castricum.setNaam("Rutger van Castricum");
		castricum.setGender('M');
		castricum.setGeboortedatum("29 mei 1979)");
		castricum.setOmroep("PowNeds");
		
		Interviewer plag = new Interviewer();
		plag.setNaam("Ghislaine Plag");
		plag.setGender('V');
		plag.setGeboortedatum("4 juni 1975");
		plag.setOmroep("NCRV");
		
		Interviewer berg = new Interviewer();
		berg.setNaam("Jurgen van den Berg");
		berg.setGender('M');
		berg.setGeboortedatum("8 december 1964");
		berg.setOmroep("NCRV");
		
		Interviewer veenhoven = new Interviewer();
		veenhoven.setNaam("Willemijn Veenhoven");
		veenhoven.setGender('V');
		veenhoven.setGeboortedatum("19 november 1974");
		veenhoven.setOmroep("BNN");
		
		rv.add(castricum);
		rv.add(plag);
		rv.add(berg);
		rv.add(veenhoven);		
		
		personen.add(rv);
		return rv;
	}
	
	public static ArrayList<Bode> getBodes() { 
		ArrayList<Bode> rv = new ArrayList<>();
		personen.add(rv);		
		
		Bode post = new Bode();
		post.setGeboortedatum("8 juni 1987");
		post.setGender('M');
		post.setNaam("Post");
		post.setKantoor(2);
		
		Bode brief = new Bode();
		brief.setGeboortedatum("6 juni 1995");
		brief.setGender('M');
		brief.setNaam("Brief");
		brief.setKantoor(1);
		
		rv.add(post);
		rv.add(brief);
		 
		personen.add(rv);
		return rv;
	}
	
	public static Interviewer getRandomInterviewer() {
		int foo = getPersmuskieten().size()-1;
		return getPersmuskieten().get(foo);
	}
	
	public static TweedeKamerlid getRandomPoliticus() {
		int foo = rnd.nextInt(getKamerleden().size()-1);
		return getKamerleden().get(foo);
	}
	
	public static Bode getRandomBodes() {
		int foo = rnd.nextInt(getBodes().size()-1);
		return getBodes().get(foo);
	}
	
	public static ArrayList<ArrayList<? extends Persoon>> getPersonen() {
		return personen;
	}
}
