package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import java.nio.file.Paths;
public class DirectoryIterator {
	public static void main(String[] args) {
		/* 
		 * The following is an example of how to list all of the files in a directory.
		 * Once the program is running, the directory is chosen using the JFileChooser.
		 */
			File directory = new File(Paths.get(".").toAbsolutePath().normalize().toString());
			File[] files = directory.listFiles();
			if(files != null) {
				for(File f1 : files) {
					if(f1.getAbsolutePath().contains("src")) {
						File[] ae = f1.listFiles();
						for(File a : ae) {
						
							  File[] taeta = a.listFiles();
								for(File g : taeta) {
									if(g.getAbsolutePath().contains(".java")) {
										try {
											FileWriter f = new FileWriter(g.getAbsoluteFile(), true);
											
											f.write("//Copyright © 2019 Ozan Bayraktaroglu");
											f.close();
										} catch (IOException e) {
										
											e.printStackTrace();
										}
										
										
										System.out.println(g.getAbsolutePath());
										
									}
									 
								}
						}
					}
				}
			
		}
		
		/*
		 * Your task is to write a program that iterates through the src folder of this current Java Project. 
		 * For every .java file it finds, the program will add a (non-legally binding) copyright statement at the bottom.
		 * Be aware of possible directories inside of directories.
		 * (e.g //Copyright © 2019 FirstName LastName)
		 */
	}
}
//Copyright © 2019 Ozan Bayraktaroglu