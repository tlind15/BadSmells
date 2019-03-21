package com.company;

public class Name
{
	public Name()
	{
		mFirst = mMiddle = mLast = mTitle = null;
	}
	
	public Name(String title, String first, String middle, String last)
	{
		mFirst = first;
		mMiddle = middle;
		mLast = last;
		mTitle = title;
	}
	
	public String getFirst() { return mFirst; }
	public String getMiddle() { return mMiddle; }
	public String getLast() { return mLast; }
	public String getTitle() { return mTitle; }
	public String getName() {return getTitle() + " " + getFirst() + " " + getMiddle() + " " + getLast();}

	private String mFirst;
	private String mMiddle;
	private String mLast;
	private String mTitle;
}
