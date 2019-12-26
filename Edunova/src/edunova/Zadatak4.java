package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		
		// Keirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj
		
		int[][] prvaMatrica = new int[4][4];
		int[][] drugaMatrica = new int[4][4];
		int[][] zbrojMatrica = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				prvaMatrica[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj u prvu matricu"));
				drugaMatrica[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj u drugu matricu"));
				zbrojMatrica[i][j] = prvaMatrica[i][j] + drugaMatrica[i][j];
				System.out.print(zbrojMatrica[i][j] + " ");
			}
			System.out.println();
		}

	}

}
