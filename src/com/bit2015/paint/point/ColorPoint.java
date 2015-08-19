package com.bit2015.paint.point;

import com.bit2015.paint.i.Drawble;



public class ColorPoint extends Point implements Drawble {
	private String color;

	public ColorPoint(int x, int y, String color){
		super(x, y);
//		setX(x);
//		setY(y);
		this.color = color;
		System.out.println("ColorPoint ������ ȣ��");
		System.out.println("ddddddd");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
//		super.show();
		System.out.println("[x="+getX()+",y="+getY()+",color="+color+"]");
	}
	
	private void testPoint(){
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		
		point1.draw();
		
		Point point2 = new Point(100,200);
		point2.draw();
		
		
		System.out.println(point1.getClass());
		System.out.println(point1.hashCode());
		System.out.println(point1.toString());
		System.out.println(point1);	
	}
	private void testColorPoint(){
//		super.show();
		System.out.println("[x="+getX()+",y="+getY()+",color="+color+"]");
	}	
	
}
