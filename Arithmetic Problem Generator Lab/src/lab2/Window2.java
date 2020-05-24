package lab2;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window2 {
	 //pop up
		
		public String in(String msg) {
			return JOptionPane.showInputDialog(msg); //asks the user to input a response in a jpane
		}
		
		public void println(String msg) {
			System.out.println(msg); //prints out a string message
		}
		
		//provides the user with the buttons to choose whether they would like to practice addition/subtraction or multiplication/division
		public int option(String[] options) {
			return JOptionPane.showOptionDialog(null, "Choose what you'd like to practice.", "Artithmetic Practice", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		}

		public void msg1(String string) {
			JOptionPane.showMessageDialog(null, string); //shows the user a string message in a jpane
			
		}

		
}
