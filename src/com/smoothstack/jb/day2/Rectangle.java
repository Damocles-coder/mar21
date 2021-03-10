/**
 * 
 */
package com.smoothstack.jb.day2;

/**
 * @author dyltr
 *
 */
public class Rectangle implements Shape {
	private Double base;
	private Double height;
	private Double area = null;
	
	public Rectangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void display() {
		System.out.println(area);
	}

	@Override
	public void calculateArea() {
		area = base*height;
	}

}
