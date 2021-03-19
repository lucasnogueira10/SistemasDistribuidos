package comum;

import java.rmi.Remote;

public interface IServicoRemoto extends Remote{
    void inserir(Pessoa p) throws RemoteException;
    List<Pessoa> listarPessoa() throws RemoteException;
}
