package com.edelweiss.windowapp.dao;

import java.util.List;

public interface CrudOperation<T>
{
	public List<T> getAll();
}
