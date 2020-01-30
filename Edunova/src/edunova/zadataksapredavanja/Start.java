package edunova.zadataksapredavanja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	private List<Opcina> opcine;
	Scanner sc;
	
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
		String provjera = "";
		while(true) {
			opcina = new Opcina();
			opcina.setNaziv(unesiNaziv());
			opcina.setZupanija(unesiZupanija());
			opcina.setZupan(unesiZupan());
			
			opcine.add(opcina);
			
			
			
			System.out.println("Upisite x kako bi zavrsili s programom");
			
			if(sc.hasNextLine()){
				provjera = sc.nextLine();
	        }
			
			if(provjera.contains("x")) {
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
		
		
		return ime;
		
		
	}

	private Zupanija unesiZupanija() {
		return new Zupanija();
	}

	private String unesiNaziv() {
		
		String naziv = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv opcine");
		
		if(sc.hasNextLine()){
			naziv = sc.nextLine();
         }
		
		return naziv;

	}

	public static void main(String[] args) {
		
		new Start();

	}

}
