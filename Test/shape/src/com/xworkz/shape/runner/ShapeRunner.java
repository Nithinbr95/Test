package com.xworkz.shape.runner;

import com.xworkz.shape.target.Circle;
import com.xworkz.shape.target.Rectangle;
import com.xworkz.shape.target.Shape;

public class ShapeRunner {

	public static void main(String[] args) {
		Shape cir = new Circle();
		cir.CircleArea();
		Shape sha = new Rectangle();
		sha.CircleArea();
	}
}
