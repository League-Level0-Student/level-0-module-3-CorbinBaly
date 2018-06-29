package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Emotion = JOptionPane.showInputDialog("Are you happy?");
		if (Emotion.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		if (Emotion.equalsIgnoreCase("No")) {
			String Happiness = JOptionPane.showInputDialog("Do you want to be happy?");
			if (Happiness.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
			if (Happiness.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}
	}
}
