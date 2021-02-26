package _03_To_Do_List;

import java.awt.HeadlessException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList {
	ArrayList<String> toDo = new ArrayList<String>();
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	public void Start() {
	frame = new JFrame();
	frame.setTitle("To Do List");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel = new JPanel();
	frame.add(panel);
	b1 = new JButton();
	b1.addActionListener((s)->{
		toDo.add((toDo.size()+1)+". "+JOptionPane.showInputDialog("What would you like to add to your to do list?"));
	});
	panel.add(b1);
	b1.setText("Add Task");
	b2 = new JButton();
	b2.addActionListener((s)->{
		if(toDo.size()>0) {
		JOptionPane.showMessageDialog(null,"Here are all of your current items on your to do list:\n"+toDo);
		}
		else {
			JOptionPane.showMessageDialog(null, "There is no current entries. Click on the Add Task button to add entries to your to do list.");
		}
		});
	panel.add(b2);
	b2.setText("View Tasks");
	b3 = new JButton();
	b3.addActionListener((s)->{
		int holder = 0;
		try {
			holder = Integer.parseInt(JOptionPane.showInputDialog("Which number task would you like to remove from your list?"))-1;
			toDo.remove(holder);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "This is not a valid entry, please write numbers. Ex: 6");
		}
		
	});
	panel.add(b3);
	b3.setText("Remove Task");
	b4 = new JButton();
	b4.addActionListener((s)->{
		try {
			FileWriter f = new FileWriter(JOptionPane.showInputDialog("Where would you like to save the file and what should its name be.\n Ex: src/_03_To_Do_List/test"));
			f.write(toDo.toArray().toString().toCharArray());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "File failed to save please enter a valid location");
			//WORKING ON HERE NERD LOOK HERE OK STOP BEING BLIND
			//WORKING ON HERE NERD LOOK HERE OK STOP BEING BLIND
			//WORKING ON HERE NERD LOOK HERE OK STOP BEING BLIND
			//TEST THIS TEST THIS
			//TEST THIS TEST THIS
			//TEST THIS TEST THIS
			//TEST THIS TEST THIS
		}

	});
	panel.add(b4);
	b4.setText("Save List");
	b5 = new JButton();
	panel.add(b5);
	b5.setText("Load List");
	frame.pack();
	frame.setVisible(true);

	}
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
}
