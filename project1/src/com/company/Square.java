package com.company;

// Every Square "is-a" Rectangle so use Inheritance

public class Square implements Shape
{
	private Rectangle rectangle = new Rectangle();

	public Square(int side) throws Throwable{
		rectangle.setLength(side);
		rectangle.setWidth(side);
	}


	public void setSide(int side) throws Throwable
	{
		rectangle.setLength(side);
		rectangle.setWidth(side);
	}
	

	@Override
	public int getArea() {
		return rectangle.getArea();
	}

	@Override
	public  int getPerimeter() {
		return rectangle.getPerimeter();
	}

}
