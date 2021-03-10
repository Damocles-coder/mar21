/**
 * 
 */
package com.smoothstack.jb.day2;

/**
 * @author dyltr
 *
 */
public class Circle implements Shape {
	private Double radius;
	private Double area = null;
	
	/**
	 * Creates a cicle object with radius
	 * @param radius
	 */
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	/**
	 *Displays area of a circle
	 */
	@Override
	public void display() {
		System.out.println(area);
	}

	/**
	 *Updates area of the circle
	 */
	@Override
	public void calculateArea() {
		area = Math.PI*Math.pow(radius, 2);
	}

}
