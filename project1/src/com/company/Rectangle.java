package com.company;

public class Rectangle
{
	public Rectangle()
	{
		this(1,1);
	}
	
	public Rectangle(int length, int width)
	{
		mLength = length;
		mWidth = width;
	}
	
	public void setLength(int length) throws Throwable
	{
		if(length <= 0) throw new Throwable("Invalid length");
		mLength = length;
	}
	
	public void setWidth(int width) throws Throwable
	{
		if(width <= 0) throw new Throwable("Invalid width");
		mWidth = width;
	}
	
	public int getPerimeter()
	{
		return 2 * mWidth + 2 * mLength;
	}
	
	public int getArea()
	{
		return mLength * mWidth;
	}
	
	private int mLength;
	private int mWidth;
}
