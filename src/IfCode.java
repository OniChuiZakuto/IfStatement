import javax.swing.JOptionPane;
import java.util.Scanner;

public class IfCode {

	public static void main(String[] args) {
		
		int age = 100;
		
		if(age==100) {
			System.out.println("Happy Century ");
		}
		else if(age<18) {
			System.out.println("You are a minor");
		}
		else if(age>=18) {
			System.out.println("You are an adult");
		} 
		else {
			System.out.println("What are you?!");
		}
		
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
			}
			
		}

	}
}