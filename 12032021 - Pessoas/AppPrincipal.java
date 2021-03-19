package servidor;

import java.net.MalformedURLException;

public class AppPrincipal {

    public static void main(String[] args) {

        try {
            IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");

            Professor p1 = new Professor();

            p1.setId(1);
            p1.setNome("Pedro");
            p1.setTelefone("(12) 1234-5678");
            p1.setCidade("Araraquara");

            Professor p2 = new Professor();

            p1.setId(2);
            p1.setNome("Bruno");
            p1.setTelefone("(11) 4321-7656");
            p1.setCidade("Araraquara");

            // Inserir Pessoa
            objPessoa.inserir(p1);
            objPessoa.inserir(p2);

            // Listar
            for (Pessoa professor : objPessoa.listarPessoa()) {
                System.out.println("ID" + professor.getId());
                System.out.println("Nome" + professor.getNome());
                System.out.println("Telefone" + professor.getTelefone());
                System.out.println("Cidade" + professor.getCidade());
            }

        } catch (MalformedURLException e) {
            e.pritnStackTrace();
        } catch (RemoteException e) {
            e.pritnStackTrace();
        } catch (NotBoundException) {
            e.pritnStackTrace();
        }
    }
}
