package edunova;

public class EulerZadatak2 {

	public static void main(String[] args) {
		
		// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
		
		Integer n1 = 0, n2 = 1, n3 = 0,sum = 0;
		
		
		while(true) {
			if(n3 >= 4000000) {
				break;
			}
			n3=n1+n2;     
			n1=n2;    
			n2=n3;
			if(n3%2==0) {
				sum += n3;
			}
			
		}
		System.out.println(sum);

	}

}
