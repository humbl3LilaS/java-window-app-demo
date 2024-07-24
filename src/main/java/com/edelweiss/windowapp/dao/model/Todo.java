package com.edelweiss.windowapp.dao.model;

public class Todo
{
	private long id;
	private String content;

	private boolean isFinished;


	public Todo(long id, String content, boolean isFinished)
	{
		this.id = id;
		this.content = content;
		this.isFinished = isFinished;
	}

	public Todo()
	{
	}


	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public boolean isFinished()
	{
		return isFinished;
	}

	public void setFinished(boolean finished)
	{
		isFinished = finished;
	}

	@Override
	public String toString()
	{
		return "Todo{" +
				"id=" + id +
				", content='" + content + '\'' +
				", isFinished=" + isFinished +
				'}';
	}
}
