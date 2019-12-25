package edunova;

public class Zadatak2 {

	public static void main(String[] args) {
		
		// Kreirati program koji ispisuje tablicu množenja 15x15
		
		for(int i=1;i<16;i++) {
			for(int j=1;j<16;j++) {
				System.out.print(i*j);
				if(i*j >= 0 && i*j < 10){
					System.out.print("   ");
				}
				if(i*j > 9 && i*j< 100){
					System.out.print("  ");
				}
				if(i*j > 99){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
