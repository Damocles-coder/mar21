/**
 * 
 */
package com.smoothstack.jb.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author dyltr
 * Allows user to enter in a path to a directory.
 */
public class FileFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//using the path resources/day3
		System.out.print("Enter path you want to look up: ");
		String path = scanner.nextLine();
		System.out.println();
		
		File file = new File(path);
		if (file.isDirectory()) {
			String[] list = file.list();
			for (String item:list) {
				System.out.println(item);
			}
		}
		else {
			System.out.println("Not a valid directory");
		}
		scanner.close();
	}

}
