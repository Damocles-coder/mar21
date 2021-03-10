/**
 * 
 */
package com.smoothstack.jb.day2;

/**
 * @author dyltr
 *
 */
public class ShapeCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creating a circle of radius 5");
		Shape circle = new Circle (5.0);
		circle.display();
		circle.calculateArea();
		circle.display();
		System.out.println("Creating a triangle of sides 5, 3, 4");
		Shape triangle = new Triangle (5.0,3.0,4.0);
		triangle.display();
		triangle.calculateArea();
		triangle.display();
		System.out.println("Creating a rectangle of base 2 and length 4");
		Shape rectangle = new Rectangle (2.0,4.0);
		rectangle.display();
		rectangle.calculateArea();
		rectangle.display();
	}

}
