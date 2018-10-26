package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"type name = new type();
	// 3. Print out this variable
	int i=new Random().nextInt(1);
	// 4. Get the user to enter something that they think is awesome
	String answer=JOptionPane.showInputDialog("what do you think is awesome?");
	// 5. If the random number is 0
	if (i==0) {
	
	JOptionPane.showMessageDialog(null, answer+" is awesome");	
	}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
	if (i==1) {}
	// -- tell the user whatever they entered is ok.
	JOptionPane.showMessageDialog(null, answer+" is ok");
	// 7. If the random number is 2
	if (i==2) {}
	// -- tell the user whatever they entered is boring.
	JOptionPane.showMessageDialog(null, answer+" is boring");
	// 8. If the random number is 3
	if (i==3) {}
	// -- write your own answer
	JOptionPane.showMessageDialog(null, answer+" is so stupid he killed himself with a balloon");
}


}