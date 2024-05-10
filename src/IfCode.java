import javax.swing.JOptionPane;

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
	
		String or = JOptionPane.showInputDialog("Run Progam?");
		Object yes = null;
		if(or==yes) {
			JOptionPane.showMessageDialog(null,"Running");
		}
		
	}
}