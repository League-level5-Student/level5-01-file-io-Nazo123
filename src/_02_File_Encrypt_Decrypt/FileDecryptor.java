package _02_File_Encrypt_Decrypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	public void decrypt() {
		try {
			FileReader f = new FileReader("src/_02_File_Encrypt_Decrypt/Encrypted.txt");
			String test = "";
			int c = f.read();
			test = test+(char)c;
			String output = "";
			while(c != -1) {
				c = f.read();
				test = test+(char)c;
			}
			char[] a = test.toCharArray();
			for(int i = 0; i < a.length;i++) {
				System.out.println(a[i]);
				if(Character.isAlphabetic(a[i])) {
					if(Character.isUpperCase(a[i])) {
						if('A'+(a[i]-'Z'+21)<'A'){
							a[i] = (char)('A'+(('Z'-a[i])-3));
							}
							else {
							a[i] = (char)('A'+(a[i]-'Z'+21));
							}
					}
					if(Character.isLowerCase(a[i])) {
						if('a'+(a[i]-'z'+21)<'a'){
						a[i] = (char)('a'+(('z'-a[i])-3));
						}
						else {
						a[i] = (char)('a'+(a[i]-'z'+21));
						}
						}
					
				}
		System.out.println(a[i]);
			output = output+a[i];
			}
		
			System.out.println(output);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			}
}
//Copyright © 2019 Ozan Bayraktaroglu