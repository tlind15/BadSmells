package com.company;

public class Person
{
	public Person()
	{
		setName(NullName.getInstance());
	}
	
	public void setName(Name name)
	{
		mName = name;
	}
	
	public String getName()
	{
		return mName.getName();
	}
	
	public String getFirstName()
	{
		return mName.getFirst();
	}
	
	public String getMiddleName()
	{
		return mName.getMiddle();
	}
	
	public String getLastName()
	{
		return mName.getLast();
	}
	
	public String getTitle()
	{
		return mName.getTitle();
	}
	
	private Name mName;

}
