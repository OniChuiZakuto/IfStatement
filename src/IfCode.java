import javax.swing.JOptionPane;
import java.util.Scanner;
public class IfCode {
	public static void main(String[] args) {		
		String[] options = {"yes", "no", "I don't know"};
		int T = JOptionPane.showOptionDialog(null, "Are you a person", "Confirmation", 0, 3, null, options, options[0]);
		switch (T) {
			case 0: 
			String M = JOptionPane.showInputDialog("Name");
				switch (M) {
					case "Mikoto": int m = 9;
						if (m==9) {
								System.out.println("Mikoto");
								JOptionPane.showMessageDialog(null, "HELLO MIKOTO!");
						} break;
					case "Jansen": int j = 1;	
						if (j==1) {
							System.out.println("Jansen");
							JOptionPane.showMessageDialog(null, "Hello senny!");
						} break;
					default: JOptionPane.showMessageDialog(null, "Hello user " + M);} break;
			case 1:
				String A = JOptionPane.showInputDialog("Name");
				switch  (A) {
					case "Mikoto": JOptionPane.showMessageDialog(null, "Hello " + A + " sadly fictional :("); break;
					default:JOptionPane.showMessageDialog(null, "Hello " + A + ",fellow non-human");
				} break;
			case 2: JOptionPane.showMessageDialog(null, "Program Terminated"); break;}
			int State = T;
				if (State==0 || State==1) {
					int Age = Integer.parseInt(JOptionPane.showInputDialog("Age"));
				if (Age<=18) {
					JOptionPane.showMessageDialog("You are a Minor, Program will be terminated");
				}
				else {
					
				}
				}
				else{}
		}
	}
