package com.xworkz.shape.target;

public class Circle extends Shape{

	@Override
	public void CircleArea() {
		int r = 5;
		double area = r*r*3.14;
		System.out.println(area);
	}

}
