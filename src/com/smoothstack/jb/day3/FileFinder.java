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
		// TODO Auto-generated method stub
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
		File temp;
		for (int i=0; i<level; i++) {
			System.out.print("\t");
		}
		System.out.println(file.getName());
		level++;
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			for (File item:list) {
				temp = new File (file.getPath()+"/"+item);
				printFolderContent(item, level);
			}
		}
	}

}
