package com.company;

// Every Square "is-a" Rectangle so use Inheritance

public class Square extends Rectangle 
{
	public Square(int side)
	{
		super(side, side);
	}
	
	public void setSide(int side) throws Throwable
	{
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setLength(int length) throws Throwable
	{
		throw new Throwable("Squares do not have a length independent from width");
	}
	
	@Override
	public void setWidth(int width) throws Throwable
	{
		throw new Throwable("Squares do not have a width independent from length");
	}
	

}
