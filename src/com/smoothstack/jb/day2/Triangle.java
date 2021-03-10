/**
 * 
 */
package com.smoothstack.jb.day2;

/**
 * @author dyltr
 *
 */
public class Triangle implements Shape {
	private Double sideA;
	private Double sideB;
	private Double sideC;
	private Double area = null;
	
	public Triangle(Double sideA, Double sideB, Double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public void display() {
		System.out.println(area);		
	}

	@Override
	public void calculateArea() {
		// Calculating area of a triangle using Heron's formula
		Double p = (sideA + sideB +sideC) / 2.0;
		area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}

}
