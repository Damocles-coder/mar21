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
	
	/**
	 * Creates a triangle base on lengths
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 */
	public Triangle(Double sideA, Double sideB, Double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	/**
	 *Prints out area of triange
	 */
	@Override
	public void display() {
		System.out.println(area);		
	}

	/**
	 *Updates the area of the triangle
	 */
	@Override
	public void calculateArea() {
		// Calculating area of a triangle using Heron's formula
		Double p = (sideA + sideB +sideC) / 2.0;
		area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}

}
