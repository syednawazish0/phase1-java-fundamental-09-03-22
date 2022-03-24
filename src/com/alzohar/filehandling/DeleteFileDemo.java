package com.alzohar.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	public static void main(String[] args) {
		deleteFile("data.txt", "F:/Alzohar/Phase-1-Java-Fundamental/phase1-java-fundamental-09-03-22/");

	}

	private static void deleteFile(String filename, String path) {
		// delete file
		try {
			Files.delete(Paths.get(path + filename));
			System.out.println("File is delete !");
		} catch (Exception e) {
			System.out.println("File Not Found Exception !");
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
