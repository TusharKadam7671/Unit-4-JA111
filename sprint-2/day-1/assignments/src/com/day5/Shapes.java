package com.day5;

public class Shapes {
	
	public void area(Circle circle)
	{
		if(circle!=null)
		{
			circle.radius=50;
			System.out.println(circle.radius);
		}else
		{
			
			System.out.println("Value of circle is null");
		}
	}
	
	public void area(Rectangle rectangle)
	{
		if(rectangle!=null)
		{
			rectangle.length=30;
			rectangle.breadth=20;
			System.out.println(rectangle.length);
			System.out.println(rectangle.breadth);
		}else
		{
			
			System.out.println("Value of rectangle is null");
		}
	}
	
	public void area(Square square)
	{
		if(square!=null)
		{
			square.side=15;
			System.out.println(square.side);
		}else
		{
			
			System.out.println("Value of square is null");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s=new Shapes();
		s.area(new Circle());
		s.area(new Rectangle());
		s.area(new Square());

	}

}
