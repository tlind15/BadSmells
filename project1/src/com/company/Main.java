
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
