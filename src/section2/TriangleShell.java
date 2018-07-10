package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot r2d2 = new Robot();

	void go() {
		r2d2.setX(800);
		r2d2.setY(550);
		// 3. delete this line (used only for testing)
r2d2.penDown();
		// 6. Make the robot go as fast as possible
		r2d2.setSpeed(2000);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int j = 0; j < 500; j++) {
			// 9. Change the color of the pen to a random color
			r2d2.setRandomPenColor();
			// 8. Increase the length variable by 10
			length = length + 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
			r2d2.turn(6);
		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			r2d2.move(length);
			r2d2.turn(120);
		}
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
