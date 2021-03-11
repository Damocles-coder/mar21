/**
 * 
 */
package com.smoothstack.jb.day3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author dyltr
 * Takes in a file and a character.
 * Will not proceed until given valid values.
 */
public class CharCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file;
		Character selection;
		
		System.out.print("What file do you want to search?: ");
		file = new File(scanner.nextLine());
		while(!file.isFile()) {
			System.out.println("Not a valid file. Please enter a valid path.");
			file = new File(scanner.nextLine());
		}
		
		System.out.print("What character would you like to count? (Will take "
				+ "the first character of the next entered line)");
		selection=scanner.next().charAt(0);
		//below code never gets through on entering a blank line
//		while(selection==null) {
//			System.out.println("Not a valid character. Try again.");
//			selection=scanner.next().charAt(0);
//		}
		
		int eCounter = 0;
		try {
			FileReader in = new FileReader(file);
			int c;
			while ((c=in.read())!=-1) {
				if ((char)c == selection) {
					eCounter++;
				}
			}
			in.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("\nYou have " + eCounter + " '" + selection + "'s");
		scanner.close();
	}

}
