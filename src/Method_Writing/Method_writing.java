package Method_Writing;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Method_writing {
	static Robot robot = new Robot();

	public static void main(String[] args) {

		robot.penDown();
		robot.setSpeed(5);
		String shape = JOptionPane.showInputDialog("Do you want a circle, triangle, or square?");
		String color = JOptionPane.showInputDialog("Do you want your shape to be blue, green, or red?");
		if (color.equalsIgnoreCase("blue")) {
			robot.setPenColor(Color.BLUE);
		}
		if (color.equalsIgnoreCase("green")) {
			robot.setPenColor(Color.green);
		}
		if (color.equalsIgnoreCase("red")) {
			robot.setPenColor(Color.red);
		}
		if (shape.equalsIgnoreCase("circle")) {
			drawcircle();
		} else if (shape.equalsIgnoreCase("square")) {
			drawsquare();
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawtriangle();
		}

	}

	static void drawsquare() {
		for (int i = 0; i < 4; i++) {
			robot.turn(90);
			robot.move(100);
		}
	}

	static void drawtriangle() {
		for (int i = 0; i < 3; i++) {
			robot.turn(120);
			robot.move(100);
		}
	}

	static void drawcircle() {
		for (int i = 0; i < 360; i++) {
			robot.move(1);
			robot.turn(1);
		}
	}
}
