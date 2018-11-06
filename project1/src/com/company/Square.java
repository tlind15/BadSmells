package com.company;

// Every Square "is-a" Rectangle so use Inheritance

public class Square implements Shape
{
    private Rectangle r;

	public Square(int side)
	{
		r = new Rectangle(side, side);
	}
	
	public void setSide(int side) throws Throwable
	{
		r.setLength(side);
		r.setWidth(side);
	}

	@Override
    public int getPerimeter() {
	    return r.getPerimeter();
    }

    @Override
    public int getArea() {
	    return r.getArea();
    }
}
