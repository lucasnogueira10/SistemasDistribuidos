import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ISmartChat extends Remote {

	void sendMessage(Message msg) throws RemoteException;
	List<Message> retrieveMessage() throws RemoteException;
	void inserirProduto(Produto p) throws RemoteException;
	void inserirPedido(Pedido p) throws RemoteException;
}
