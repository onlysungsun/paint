
package com.bit2015.paint.shape;

public abstract class Shape {
	private String fillColor;
	private String lineColor;
	

	
/*	public void draw(){
	System.out.println("��ü���� ������ �׸� �� �����ϴ�.");	
	}*/
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
