
<<<<<<< HEAD
public class Rectangle implements RectInterface{
	public Rectangle() {
		this(1, 1);
	}

	public Rectangle(int length, int width) {
=======
public class Rectangle implements Shape
{
	public Rectangle()
	{
		this(1,1);
	}


	public Rectangle(int length, int width)
	{
>>>>>>> f076d828d0df3a9ace9d9f2bec194df67bff07d0
		mLength = length;
		mWidth = width;
	}

	public void setLength(int length) throws Throwable {
		if (length <= 0)
			throw new Throwable("Invalid length");
		mLength = length;
	}

	public void setWidth(int width) throws Throwable {
		if (width <= 0)
			throw new Throwable("Invalid width");
		mWidth = width;
	}
	
	public void setSide(int side) throws Throwable {
		mWidth = side;
		mLength = side;
	}
	
	public int getPerimeter() {
		return 2 * mWidth + 2 * mLength;
	}

	public int getArea() {
		return mLength * mWidth;
	}

	private int mLength;
	private int mWidth;
}
