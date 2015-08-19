package com.bit2015.paint.shape;

import com.bit2015.paint.i.Drawble;

public class Circle extends Shape implements Drawble {

	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}

}
