//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		for (int i = 0; i < 10; i++) {
			// 3. Ask the user what color they would like the robot to draw
			String Idk = JOptionPane.showInputDialog(null, "What color would you like the robot to draw?");
			r2d2.penDown();
			// 5. Use an if/else statement to set the pen color that the user requested
			if (Idk.equalsIgnoreCase("Blue")) {
				r2d2.setPenColor(0, 0, 255);
			}
			if (Idk.equalsIgnoreCase("Green")) {
				r2d2.setPenColor(0, 255, 0);
			}
			if (Idk.equalsIgnoreCase("Red")) {
				r2d2.setPenColor(255, 0, 0);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			if (Idk.isEmpty()) {
				r2d2.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them
			// 4. Set the pen width to 10
			r2d2.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			r2d2.move(250);
			r2d2.turn(90);
			r2d2.move(250);
			r2d2.turn(90);
			r2d2.move(250);
			r2d2.turn(90);
			r2d2.move(250);
		}
	}
}
