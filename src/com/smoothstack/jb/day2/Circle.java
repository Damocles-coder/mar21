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
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public void display() {
		System.out.println(area);
	}

	@Override
	public void calculateArea() {
		area = Math.PI*Math.pow(radius, 2);
	}

}
