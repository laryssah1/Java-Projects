package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://end:porta","user", "passw");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

