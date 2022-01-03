import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		
		int secret = random.nextInt(100)+1;
		
		int guess = 0;
		int tries = 0;
		
		while (guess!=secret) {
			guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number (1~100)"));
			tries++;
			
			if (guess>secret) {
				JOptionPane.showMessageDialog(null,"Too big! Try again");
			}
			else if (guess<secret) {
				JOptionPane.showMessageDialog(null,"Too small! Try again");
			}
		}
		
		System.out.printf("You guessed it correct! The number is %d. (You took %d tries)",secret,tries);
		
		

	}

}
