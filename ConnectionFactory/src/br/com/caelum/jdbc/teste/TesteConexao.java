package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.caelum.jdbc.ConnectionFactory;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		//System.out.println("Conexão aberta!");
	    PreparedStatement stmt = con.prepareStatement("SELECT * FROM x WHERE data NOT BETWEEN CURDATE()-INTERVAL 90 DAY AND CURDATE() ORDER BY data DESC");
	    ResultSet rs = stmt.executeQuery();
	    stmt.close();
	    con.close();
	}
}