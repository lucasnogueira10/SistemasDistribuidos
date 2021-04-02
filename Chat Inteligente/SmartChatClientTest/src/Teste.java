import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		String nome = "";
		String msgp = "";
		String resp = "";
		String respBot = "";

		Produto produto = new Produto();
		produto.setId(1);
		produto.setDescricao("Iphone 12 Preto 128GB");
		produto.setTipo("Smartphone");

		Pedido pedido = new Pedido();
		pedido.setNumPedido(1);
		pedido.setDescricao("Compra online no site https://www.magazineluiza.com.br");
		pedido.setDtCompra("31/03/2021");
		pedido.setStatus("Enviado");
		pedido.setProduto(produto);

		try {
			new CadastroDB().inserirProduto(produto);
			new CadastroDB().inserirPedido(pedido);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		System.out.println("Entering chat...");

		nome = JOptionPane.showInputDialog("Bem vindo ao chat de acompanhamento do pedido! Qual é o seu nome?");

		try {

			while (msgp != "0") {
				msgp = JOptionPane.showInputDialog(nome + ", como podemos te ajudar?"
						+ "\nVocê pode perguntar o número do seu pedido, o número da nota fiscal, o status do pedido etc"
						+ "\nCaso queira sair do chat, digite 0");

				ISmartChat objChat = (ISmartChat) Naming.lookup("rmi://localhost:8282/smartchat");
				Message msg = new Message(nome, msgp);
				objChat.sendMessage(msg);
				System.out.print(returnMessage(objChat.retrieveMessage()));
				new CadastroDB().inserirMensagem(msg);

				if (msgp.equals("0")) {
					System.out.println(("Exiting chat..."));
					break;
				} else if (msgp.toUpperCase().contains("NUMERO") || msgp.toUpperCase().contains("NÚMERO")) {
					resp = JOptionPane.showInputDialog(
							nome + ", você quer saber o número do seu pedido?" + "\nDigite SIM ou NAO");
					if (resp.toUpperCase().contains("SIM"))
						respBot = "Número do pedido: " + Integer.toString(pedido.getNumPedido());
					else
						respBot = "Me desculpe, não entendi.";
				} else if (msgp.toUpperCase().contains("NOTA") || msgp.toUpperCase().contains("FISCAL")
						|| msgp.toUpperCase().contains("NF")) {
					resp = JOptionPane.showInputDialog(
							nome + ", você quer saber o número da nota fiscal?" + "\nDigite SIM ou NAO");
					if (resp.toUpperCase().contains("SIM"))
						respBot = "Número da nota fiscal: 212654645645324253456541";
					else
						respBot = "Me desculpe, não entendi.";
				} else if (msgp.toUpperCase().contains("STATUS")) {
					resp = JOptionPane
							.showInputDialog(nome + ", você quer saber o status do pedido?" + "\nDigite SIM ou NAO");
					if (resp.toUpperCase().contains("SIM"))
						respBot = "Status do pedido: " + pedido.getStatus();
					else
						respBot = "Me desculpe, não entendi.";
				} else
					respBot = "Me desculpe, não entendi.";

				Message msgBot = new Message("BOT", respBot);
				objChat.sendMessage(msgBot);
				System.out.print(returnMessage(objChat.retrieveMessage()));
				new CadastroDB().inserirMensagem(msgBot);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String returnMessage(List<Message> lst) {

		String valor = "";
		for (Message message : lst) {
			valor = message.getUsuario() + ": " + message.getMensagem() + "\n";
		}
		return valor;
	}
}
