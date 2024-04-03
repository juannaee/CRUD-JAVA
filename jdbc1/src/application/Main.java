package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Main {

	public static Connection conn = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;
	public static PreparedStatement preparedStatement = null;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		inserirDados();
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

	public static void inserirDados() {

		String insert = "INSERT INTO funcionario " + "(Nome,Email,aniversario,SalarioBase,DepartamentoId) " + "VALUES "
				+ "(?, ?, ?, ?, ?)";
		try {

			conn = DB.getConnection();
			preparedStatement = conn.prepareStatement(insert);
			preparedStatement.setString(1, "Juan Guilherme");
			preparedStatement.setString(2, "juangsilvalemos@gmail.com");
			preparedStatement.setDate(3, new java.sql.Date(sdf.parse("27/11/2001").getTime()));
			preparedStatement.setDouble(4, 2500.00);
			preparedStatement.setInt(5, 4);

			Integer linhasAlteradas = preparedStatement.executeUpdate();
			System.out.println("Linhas afetadas: " + linhasAlteradas);

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		catch (ParseException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			DB.closeStatament(preparedStatement);
			DB.getConnection();
		}

	}

}
