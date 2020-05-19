package lab2;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window2 {
	 //pop up
	
		public void msg(JPanel jPanel) {
			JOptionPane.showMessageDialog(null, jPanel); //sends a message to the user
		}
		
		public String in(String msg) {
			return JOptionPane.showInputDialog(msg);
		}
		
		public void println(String msg) {
			System.out.println(msg);
		}
		
		public int option(String[] options) {
			return JOptionPane.showOptionDialog(null, "Choose what you'd like to practice.", "Artithmetic Practice", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		}

		public void msg1(String string) {
			JOptionPane.showMessageDialog(null, string);
			
		}

		public int option(String[] replay, String string) {
			// TODO Auto-generated method stub
			return JOptionPane.showOptionDialog(null, string, "Replay", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, replay, replay[0]);
		}

		
}
