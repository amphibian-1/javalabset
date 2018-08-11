class Shape
{
	double length,breadth,area;

	Shape(double l)
	{
		length=l;
		breadth=l;
	}

	Shape(double l,double b)
	{
		length=l;
		breadth=b;
	}
	
	void comparearea(double l)
	{
		area=l*l;
		System.out.println("Area ="+area+" units");

	}

	void comparearea(double l,double b)
	{
		area=l*b;
		System.out.println("Area ="+area+" units");
	}
}

class java2
{
	public static void main(String args[])
	{
		Shape s1=new Shape(5.000);
		Shape s2=new Shape(5.000,6.000);
		s1.comparearea(8.0);
		s2.comparearea(s1.length,s2.breadth);
		s2.comparearea(s1.length);
	}
}


