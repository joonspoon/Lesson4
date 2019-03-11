package examples;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Skyline {
	Robot builder = new Robot("mini");

	private void draw() {
		builder.penDown();
		builder.setSpeed(10);
		builder.setPos(100, 500);

		for (int i = 0; i < 8; i++) {
			int randomHeight = new Random().nextInt(300) + 100;
			boolean pointyOrNot = new Random().nextBoolean();
			drawBuilding(randomHeight, pointyOrNot);
		}

	}

	private void drawBuilding(int height, boolean pointy) {
		builder.setPenColor(Color.BLACK);
		builder.setPenWidth(2);

		builder.move(height);

		if (pointy) {
			drawPointyRoof();
		} else {
			drawSquareRoof();
		}

		builder.move(height);
		builder.setAngle(90);
		builder.setPenColor(Color.GREEN);
		builder.setPenWidth(6);
		builder.move(30);
		builder.setAngle(0);
	}

	private void drawSquareRoof() {
		builder.turn(90);
		builder.move(70);
		builder.turn(90);
	}

	private void drawPointyRoof() {
		builder.turn(45);
		builder.move(50);
		builder.turn(90);
		builder.move(50);
		builder.turn(45);
	}

	public static void main(String[] args) {
		new Skyline().draw();
	}
}
