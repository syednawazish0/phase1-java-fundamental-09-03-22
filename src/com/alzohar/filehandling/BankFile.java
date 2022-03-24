package com.alzohar.filehandling;

import java.io.File;

public class BankFile {

	public static void main(String[] args) {
		createDir("Bank");

	}

	private static void createDir(String direcname) {

		// Directory

		File direcName = new File(direcname);

		try {
			boolean response = direcName.mkdir();

			if (response) {
				System.out.println("Folder is created successfully");
			}

			else {
				System.out.println("Folder already exist");
			}

		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}

	}

	private static void createFile(String filename) {
		// file
		File file = new File(filename);

		try {
			// create file
			boolean response = file.createNewFile();

			if (response) {
				System.out.println("File is created successfully !");
			} else {
				System.out.println("File already exist !");
			}
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
