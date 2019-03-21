package com.company;

public abstract class Person
{
<<<<<<< HEAD
    protected Name mName;

    public abstract void setName(Name name);
    public abstract String getName();
    public abstract String getFirstName();
    public abstract String getMiddleName();
    public abstract String getLastName();
    public abstract String getTitle();
=======
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
>>>>>>> f076d828d0df3a9ace9d9f2bec194df67bff07d0

}
