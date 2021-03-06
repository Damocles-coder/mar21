/**
 * 
 */
package com.smoothstack.jb.day3;

import java.io.File;
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
		Scanner scanner = new Scanner(System.in);
		FileFinder f = new FileFinder();
		
		//using the path resources/day3
		System.out.print("Enter path you want to look up: ");
		String path = scanner.nextLine();
		System.out.println();
		
		File file = new File(path);
		if (file.isFile() || file.isDirectory()) {
			f.printFolderContent(file, 0);
		}
		else {
			System.out.println("Not a folder.");
		}
		scanner.close();
	}
	
	public void printFolderContent(File file, int level) {
		for (int i=0; i<level; i++) {
			System.out.print("  ");
		}
		System.out.println(file.getName());
		level++;
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			//generating an expensive especially for a large recursive solution
			if (list != null) {
				for (File item:list) {
					printFolderContent(item, level);
				}
			}
		}
	}

}
