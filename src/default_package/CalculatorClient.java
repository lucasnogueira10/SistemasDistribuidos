package default_package;

import java.rmi.Naming;



public class CalculatorClient {
	public static void main (String[] args) {
		try {
			Calculator c = (Calculator) Naming
					.lookup("//localhost:1020/CalculatorService");
			
			System.out.println(c.sub(4, 3));
			System.out.println(c.add(4, 5));
			System.out.println(c.mul(3, 6));
			System.out.println(c.sub(9, 3));
			
			} catch (Exception e) {
				System.out.println(e);
			}


			
		}
	

	
	
}


