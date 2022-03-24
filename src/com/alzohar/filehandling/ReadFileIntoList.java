package com.alzohar.filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoList {

	public static void main(String[] args) {

		List<String> lines = ReadFileIntoList("data.txt",
				"F:/Alzohar/Phase-1-Java-Fundamental/phase1-java-fundamental-09-03-22/");

		// print data on console by ready line byline text
		for (String line : lines) {
			System.out.println(line);
		}
	}

	private static List<String> ReadFileIntoList(String filename, String path) {

		List<String> lines = Collections.emptyList();

		try {
			lines = Files.readAllLines(Paths.get(path + filename), StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		return lines;
	}

}
