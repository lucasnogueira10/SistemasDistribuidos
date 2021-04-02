
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDB {

	private Connection connection;

	public CadastroDB() {
		connection = Conexao.getConnection();
	}

	public boolean inserirMensagem(Message message) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO CHAT (usuario, mensagem) values (?, ?)");

			stmt.setString(1, message.getUsuario());
			stmt.setString(2, message.getMensagem());

			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}
	
	public boolean inserirProduto(Produto produto) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO PRODUTO (id, descricao, tipo) values (?, ?, ?)");

			stmt.setString(1, Integer.toString(produto.getId()));
			stmt.setString(2, produto.getDescricao());
			stmt.setString(3, produto.getTipo());

			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {
			connection.close();
		}
		return false;
	}
	
	public boolean inserirPedido(Pedido pedido) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO PEDIDO (numPedido, descricao, dtCompra, status, idProduto, descProduto) values (?, ?, ?, ?, ?, ?)");

			stmt.setString(1, Integer.toString(pedido.getNumPedido()));
			stmt.setString(2, pedido.getDescricao());
			stmt.setString(3, pedido.getDtCompra());
			stmt.setString(4, pedido.getStatus());
			stmt.setString(5, Integer.toString(pedido.getProduto().getId()));
			stmt.setString(6, pedido.getProduto().getDescricao());

			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {
			connection.close();
		}
		return false;
	}
}