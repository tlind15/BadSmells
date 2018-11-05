
// Every Square "is-a" Rectangle so use Inheritance

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
	}

}
