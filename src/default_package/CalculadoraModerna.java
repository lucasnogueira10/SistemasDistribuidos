package default_package;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class CalculadoraModerna {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		long resultado = 0;
		
		Calculator c = (Calculator) Naming
				.lookup("//localhost:1020/CalculatorService");

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));

		String opcao[] = { "+", "-", "*", "/" };

		int operacao =

				JOptionPane.showOptionDialog(null, "Escolha uma das operacoes", "Tipo de operacao", 0,
						JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

		if (operacao == 0) {
			resultado = c.add(a , b);
		}
		if (operacao == 1) {
			resultado = c.sub(a , b);
		}
		if (operacao == 2) {
			resultado = c.mul(a , b);
		}
		if (operacao == 3) {
			resultado = c.div(a , b);
		}

		JOptionPane.showMessageDialog(null, "Resultado: " + (resultado));

	}
}
