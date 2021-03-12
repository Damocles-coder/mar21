/**
 * 
 */
package com.smoothstack.jb.day3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author dyltr
 * Chose buffered readers as I read it is more efficient by appending to the file all at once.
 * Though I guess it doesn't matter much as we are only adding one string.
 */
public class BufferedAppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file;
		
		System.out.println("Please enter a valid file path");
		file = new File(scanner.nextLine());
		while(!file.isFile()) {
			System.out.println("Not a valid file. Please enter a valid path.");
			file = new File(scanner.nextLine());
		}
		
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(file, true));
			System.out.println("What do you want to append to the file?");
			b.append(scanner.nextLine());
			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
