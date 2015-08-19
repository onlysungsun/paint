package com.bit2015.paint.point;

import com.bit2015.paint.i.Drawble;

public class Point implements Drawble {

	private int x;
	private int y;
	
	public Point(){
		System.out.println("Point()»£√‚");
	}
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw(){
		System.out.println("[x="+x+",y="+y+"]");
	}
}
