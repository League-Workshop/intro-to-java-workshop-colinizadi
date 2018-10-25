
package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("robux");
		JOptionPane.showMessageDialog(null, "robux");
		String name=JOptionPane.showInputDialog("User name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		
	}
}
