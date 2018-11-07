
public class Person 
{
	public Person()
	{
		setName(null);
	}
	
	public void setName(Name name)
	{
		mName = name;
	}
	
	public String getName()
	{
		if(mName != null) 
		{
			return getTitle() + " " + getFirstName() + " " + getMiddleName() + " " + getLastName();
		}
		else
		{
			return "This person has no name";
		}
	}
	
	public String getFirstName()
	{
		if(mName != null) return mName.getFirst();
		else return "This person has no first name";
	}
	
	public String getMiddleName()
	{
		if(mName != null) return mName.getMiddle();
		else return "This person has no middle name";
	}
	
	public String getLastName()
	{
		if(mName != null) return mName.getLast();
		else return "This person has no last name";
	}
	
	public String getTitle()
	{
		if(mName != null) return mName.getTitle();
		else return "This person has no title";
	}
	
	private Name mName;

}
