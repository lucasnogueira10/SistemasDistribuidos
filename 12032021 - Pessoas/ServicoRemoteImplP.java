package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemoteImplP  extends UnicastRemoteObject implements IServicoPessoa {
    private static List<Pessoa> lstPessoa = new ArrayList<>();
    public ServicoRemoteImpl() throws RemoteException{

    }
    private static final long serialVersionUID = 7334161650385748588L;

    public void inserir(Pessoa p) throws RemoteException{
        lstPessoa.add(p);
    }

    public List<Pessoa> listarPessoa() throws RemoteException{
        return lstPessoa;
    }
