package default_package;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

	public class ChatAula extends UnicastRemoteObject implements IChatAula {
			public ChatAula() throws RemoteException {
						super();
	}
	
	private static final long serialVersionUID = 499838522163321014L;
	@Override
		public void sendMessage(Message msg) throws RemoteException {
		Message.setLstMessage(msg);
	}
	@Override
		public List<Message> retrieveMessage() throws RemoteException {
		return Message.getLstMessage();
	}
}