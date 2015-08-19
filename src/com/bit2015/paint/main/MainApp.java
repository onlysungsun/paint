package com.bit2015.paint.main;

import com.bit2015.paint.i.Drawble;
import com.bit2015.paint.shape.Circle;
import com.bit2015.paint.shape.Shape;
import com.bit2015.paint.shape.Triangle;

public class MainApp {

	public static void main(String[] args) {
		
		//Triangle test
		testTriangle();
		//Shape test
		testPaintShape();
	}

	private static void paint(Drawble d){
		d.draw();
	}
	
	private static void testPaintShape(){
		paint(new Triangle());
		paint(new Circle());
	}
	
/*	private static void paint(Triangle triangle){
		triangle.draw();
	}
	private static void paint(Circle circle){
		circle.draw();
	}	*/

	private static void testTriangle(){
		Shape s = new Triangle();
		Drawble d = (Drawble)s;
		d.draw();
		
	}
}
