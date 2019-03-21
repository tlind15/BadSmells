
// Every Square "is-a" Rectangle so use Inheritance

<<<<<<< HEAD
public class Square extends Rectangle {
	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setLength(int length) throws Throwable {
		super.setSide(length);
	}

	@Override
	public void setWidth(int width) throws Throwable {
		super.setSide(width);
=======
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
>>>>>>> f076d828d0df3a9ace9d9f2bec194df67bff07d0
	}

}
