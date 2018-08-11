import java.util.Scanner;
class Rectangle
{
	double length,width,area;
	String color;
	Scanner s=new Scanner(System.in);

	void setlength()
	{
		System.out.println("Enter the length of the rectangle");
		length=s.nextDouble();
	}

	void setwidth()
	{
		System.out.println("Enter the width of the rectangle");
		width=s.nextDouble();
	}

	void setcolor()
	{
		System.out.println("ENter the color of the recatangle");
		color = s.next();
	}

	void findarea()
	{
		area=length*width;
	}

	boolean compare(Rectangle a)
	{
		if(color.equals(a.color) && area==(a.area))
			return true;
		else
			return false;
	}
}

class RectDemo
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		boolean matches=false;

		System.out.println("Rectangle 1:");
		r1.setlength();
		r1.setwidth();
		r1.setcolor();

		System.out.println("Rectangle 2:");
		r2.setlength();
		r2.setwidth();
		r2.setcolor();

		r1.findarea();
		r2.findarea();
		matches = r1.compare(r2);

		if(matches==true)
			System.out.println("\nMatching Rectangle");
		else
			System.out.println("\nNot matching rectangle");
	}
}


