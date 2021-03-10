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
	
	/**
	 * Creates rectangle based on base and height
	 * @param base
	 * @param height
	 */
	public Rectangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 *Displays area of rectangle
	 */
	@Override
	public void display() {
		System.out.println(area);
	}

	/**
	 *Updates area of rectangle
	 */
	@Override
	public void calculateArea() {
		area = base*height;
	}

}
