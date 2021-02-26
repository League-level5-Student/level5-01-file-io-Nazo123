package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message.
	 * Use any key you want (1 - 25) to shift each letter in the users input and save the final result to a file.
	 *
	 */
	
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("src/_02_File_Encrypt_Decrypt/Encrypted.txt");
			String words = JOptionPane.showInputDialog("Send the message you want to be encrypted");
			char[] test = words.toCharArray();
			for(int i = 0; i < test.length; i++) {
				System.out.println(test[i]);
				if(Character.isAlphabetic(test[i])) {
					if(Character.isUpperCase(test[i])) {
						if(('A'+(test[i]-'Z'+29))>'Z'){
							test[i] = (char) ('A'+(3-('Z'-test[i])));
						}
						else {
						test[i] = (char)('A'+(test[i]-'Z'+29));
						}
					}
					if(Character.isLowerCase(test[i])) {
						if(('a'+(test[i]-'z'+29))>'z'){
							test[i] = (char) ('a'+(3-('z'-test[i])));
						}
						else {
							test[i] = (char)('a'+(test[i]-'z'+29));
						}
			
					}
					
				}
			}
			
			
			f.write(test);
			f.close();
			
		} catch (IOException e) {
			
		}
		FileDecryptor test = new FileDecryptor();
		test.decrypt();
	}
}
