package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		
		// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i  najveći uneseni broj.
		
			int broj = 0, min = 0, max = 0, zbroj = 0;
			
			for(int i=0;i<24;i++) {
				broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
				if(i==0) {
					max = broj;
					min = broj;
				}
				if(broj<min) {
					min = broj;
				}
				if(broj>max) {
					max = broj;
				}
				zbroj += broj;
			}
			System.out.println(zbroj);
			System.out.println(min);
			System.out.println(max);

	}

}
