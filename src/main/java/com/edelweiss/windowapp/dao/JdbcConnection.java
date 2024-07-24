package com.edelweiss.windowapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnection
{
	private Connection connection;

	private JdbcConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306" +
																  "/turing_jdbc", "root",
														  "sanlinn1892001");
			System.out.println("Connection OK!");
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: " + e);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException: " + e);
		}
	}

	private static class SingletonHelper
	{
		private static final JdbcConnection INSTANCE = new JdbcConnection();
	}

	public static Connection getConnection()
	{
		return SingletonHelper.INSTANCE.connection;
	}

	public static void main(String[] args)
	{
		Connection connection = getConnection();
	}
}
