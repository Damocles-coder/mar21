/**
 * 
 */
package com.smoothstack.jb.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author dyltr
 * Chose buffered readers as I read it is more efficient by appending to the file all at once.
 */
public class BufferedAppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter("resources/day3/test.txt", true));
			b.append(scanner.nextLine());
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
