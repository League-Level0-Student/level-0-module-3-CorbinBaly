package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String Sign = JOptionPane.showInputDialog("What is your star sign?");
		if (Sign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "You're a Lion");
		} else if (Sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You're a Bull");
		} else if (Sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You're a Twin Thingy");
		} else if (Sign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You're a Lobster");
		} else if (Sign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You're a Lion");
		} else if (Sign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You're a Balance thingy");
		} else if (Sign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You're a person holding leaves");
		} else if (Sign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You're a Scorpion");
		} else if (Sign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You're a Person holding a bow");
		} else if (Sign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You're a Ram");
		} else if (Sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You're a Person holding something that I can't tell");
		} else if (Sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You're Two fish");

		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
