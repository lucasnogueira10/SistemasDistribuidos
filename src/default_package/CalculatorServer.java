package default_package;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

//package default_package;

public class CalculatorServer implements Remote {
	public CalculatorServer() {
		
		try {
			Calculator c = new CalculatorImpl();
			LocateRegistry.createRegistry(1020);
			Naming.rebind("//localhost:1020/CalculatorService", c);
		} catch (Exception e) {
			
			System.out.println("Trouble: " + e);
		}
		
	}
	public static void main (String args[]) {
		new CalculatorServer();
	}

}
