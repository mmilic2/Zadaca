package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		
		// Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između njih.
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		int max = 0, min = 0, counter = 0;
		if(a<b) {
			max = b;
			min = a;
		}else {
			min = b;
			max = a;
		}
		
		for(int i=min;i<max;i++) {
			for(int j=1;j<10;j++) {
				if(i%j==0) {
					counter++;
				}
			}
			if(counter < 2) {
				System.out.println(i);
			}
			counter = 0;
		}
	
	
	}
	
}
