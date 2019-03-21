
<<<<<<< HEAD
public class Main {
	public static void main(String[] args) {
		try {
			Rectangle r1 = new Rectangle(2, 3);
			Square s1 = new Square(5);
			doPrint(r1, s1);
 
			r1.setLength(10);
			r1.setWidth(15);
			doPrint(r1, s1);

			s1.setLength(10);
			s1.setWidth(20); 
			doPrint(r1, s1);
			 
		} catch (Throwable e) {
=======
public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			Rectangle r1 = new Rectangle(2,3);
			Square s1 = new Square(5);

			doPrint(r1, s1);

			r1.setLength(10);
			r1.setWidth(15);
			s1.setSide(8);

			doPrint(r1, s1);

//			s1.setLength(10);
//			s1.setWidth(20);
            s1.setSide(20);
			doPrint(r1, s1);
		}
		catch (Throwable e)
		{
>>>>>>> f076d828d0df3a9ace9d9f2bec194df67bff07d0
			System.out.println("\nERROR\n");
			e.printStackTrace();
		}

	}

	public static void doPrint(Rectangle r, Square s) {
		printDetails(r);
		printDetails(s);
	}
	
	public static void printDetails(Rectangle rect) {
		System.out.println("Area of " + rect.getClass().getName() + " is " + rect.getArea());
		System.out.println("Perimeter of " + rect.getClass().getName() + " is " + rect.getPerimeter());
	}

}
