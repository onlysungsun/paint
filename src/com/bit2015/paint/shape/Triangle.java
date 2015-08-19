package com.bit2015.paint.shape;

import com.bit2015.paint.i.Drawble;
import com.bit2015.paint.point.Point;

public class Triangle extends Shape implements Drawble {

	private Point[] points = new Point[3];

	@Override
	public void draw() {
		System.out.println("»ï°¢ÇüÀ» ±×·È½À´Ï´Ù.");
	}
	
	
	
	
}
