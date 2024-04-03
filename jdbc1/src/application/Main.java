package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DB;

public class Main {

	public static Connection conn = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;

	public static void main(String[] args) {
		visualizarDados();
	}
	
	
	
	
	
	

	public static void visualizarDados() {
		try {
			conn = DB.getConnection();
			statement = conn.createStatement();
			resultSet = statement.executeQuery("select * from departamento");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Nome"));

			}

		} catch (Exception e) {
			e.getStackTrace();

		} finally {
			DB.closeResultSet(resultSet);
			DB.closeStatament(statement);
			DB.closeConnection();

		}

	}

}
