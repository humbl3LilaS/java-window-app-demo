package com.edelweiss.windowapp.service;

import com.edelweiss.windowapp.dao.TodoDao;
import com.edelweiss.windowapp.dao.model.Todo;

import java.util.List;

public class TodoService
{
	TodoDao todoDao = new TodoDao();

	public List<Todo> getAllTodo()
	{
		return todoDao.getAll();
	}

	public static void main(String[] args)
	{
		var todoService = new TodoService();
		List<Todo> todos =  todoService.getAllTodo();
		System.out.println(todos);
	}
}
