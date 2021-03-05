package _01_File_Recorder;

import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("src/_01_File_Recorder/hello");
			f.write(JOptionPane.showInputDialog("TEST"));
			f.close();
		}
		catch(Exception e) {
			System.out.print("test");
		}
	}
}
//Copyright © 2019 Ozan Bayraktaroglu