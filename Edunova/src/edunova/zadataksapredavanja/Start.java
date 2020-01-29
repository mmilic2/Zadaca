package edunova.zadataksapredavanja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	private List<Opcina> opcine;
	
	public Start() {
		
		opcine = new ArrayList<>();
		unos();
		for(Opcina o : opcine) {
			System.out.println("Opcinom " + o.getNaziv() + " vlada " + o.getZupan());
		}
		
	}
	
	private void unos() {
		Opcina opcina;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			opcina = new Opcina();
			opcina.setNaziv(unesiNaziv());
			opcina.setZupanija(unesiZupanija());
			opcina.setZupan(unesiZupan());
			
			opcine.add(opcina);
			
			String provjera = "";
			
			System.out.println("Upisite x kako bi zavrsili s programom");
			
			if(sc.hasNextLine()){
				provjera = sc.nextLine();
	        }
			
			if(provjera.trim().toLowerCase().equals("x")) {
				sc.close();
				return;
			}
		}
		
	}

	private String unesiZupan() {
		String ime = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime zupana");
		if(sc.hasNextLine()){
			ime = sc.next();
         }
		
		sc.close();
		return ime;
		
		
	}

	private Zupanija unesiZupanija() {
		Zupanija zupanija;
		zupanija = new Zupanija();
		return zupanija;
	}

	private String unesiNaziv() {
		
		String naziv = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv opcine");
		
		if(sc.hasNextLine()){
			naziv = sc.nextLine();
         }
		
		sc.close();
		return naziv;

	}

	public static void main(String[] args) {
		
		new Start();

	}

}
