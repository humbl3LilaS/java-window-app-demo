package com.edelweiss.windowapp.dao;

import com.edelweiss.windowapp.dao.model.Todo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TodoDao implements CrudOperation<Todo>
{

	private Connection connection = JdbcConnection.getConnection();

	@Override
	public List<Todo> getAll()
	{
		ArrayList<Todo> todos = new ArrayList<>();
		try (Statement statement = connection.createStatement())
		{
			ResultSet res = statement.executeQuery("SELECT * FROM  todo;");
			while (res.next())
			{
				Todo todo = new Todo();
				todo.setId(res.getLong("id"));
				todo.setContent(res.getString("content"));
				todo.setFinished(res.getBoolean("isFinished"));
				todos.add(todo);
			}
			res.close();
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: " + e);
		}
		return todos;
	}

	public static void main(String[] args)
	{
		var todoDao = new TodoDao();
		List<Todo> todos = todoDao.getAll();
		System.out.println(todos);
	}
}
