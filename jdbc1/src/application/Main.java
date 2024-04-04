package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
//import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DB;

public class Main {
//	public static Statement statement = null;
	public static Scanner sc = new Scanner(System.in);
	public static Connection conn = null;
	public static ResultSet resultSet = null;
	public static PreparedStatement preparedStatement = null;
	public static ResultSetMetaData metaData = null;

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
//		inserirDados();

		visualizarDados(menuOpcaoVisualizacao());
	}

	public static String menuOpcaoVisualizacao() {

		System.out.println("Escolha uma opção\n1 - Vizualizar Funcionarios\n2 - Vizualizar Departamentos");
		Integer opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			String consultaFuncionario = "select * from funcionario";
			return consultaFuncionario;

		}

		case 2: {
			String consultaDepartamento = "select * from departamento";
			return consultaDepartamento;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}

	}

	public static void visualizarDados(String consulta) {

		try {

			conn = DB.getConnection();
			preparedStatement = conn.prepareStatement(consulta);
			resultSet = preparedStatement.executeQuery();

			metaData = resultSet.getMetaData();
			Integer numeroDeColunas = metaData.getColumnCount();

			while (resultSet.next()) {
				for (int i = 1; i <= numeroDeColunas; i++) {
					String nomeColuna = metaData.getColumnName(i);
					Object valorColuna = null;

					if (metaData.getColumnType(i) == java.sql.Types.DATE) {
						valorColuna = resultSet.getDate(i);

					} else if (metaData.getColumnType(i) == java.sql.Types.DOUBLE) {
						valorColuna = resultSet.getDouble(i);

					} else if (metaData.getColumnType(i) == java.sql.Types.INTEGER) {
						valorColuna = resultSet.getInt(i);
					} else {
						valorColuna = resultSet.getString(i);
					}

					System.out.println(nomeColuna + ": " + valorColuna);

				}

				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(resultSet);
			DB.closeStatament(preparedStatement);
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

	}

}
