import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class SmartChat extends UnicastRemoteObject implements ISmartChat {

	private static List<Produto> lstProduto = new ArrayList<>();
	private static List<Pedido> lstPedido = new ArrayList<>();
	
	protected SmartChat() throws RemoteException {
	}

	private static final long serialVersionUID = 7743858315733901387L;
	
	@Override
	public void sendMessage(Message msg) throws RemoteException {
		Message.setLstMessage(msg);
	}

	@Override
	public List<Message> retrieveMessage() throws RemoteException {
		return Message.getLstMessage();
	}

	@Override
	public void inserirProduto(Produto p) throws RemoteException {
		lstProduto.add(p);
	}

	@Override
	public void inserirPedido(Pedido p) throws RemoteException {
		lstPedido.add(p);
	}
}
