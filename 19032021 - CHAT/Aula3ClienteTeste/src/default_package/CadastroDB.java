package default_package;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class CadastroDB {

	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public CadastroDB() {
		connection = Conexao.getConnection();
	}

	public boolean inserir(Message message) throws SQLException {

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
}