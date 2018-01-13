import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Part2 {
	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("give my a shape");
		String color = JOptionPane.showInputDialog("give my a color");
		Robot bob = new Robot();
		if (color.equals("blue")) {
			bob.setPenColor(0,0,255);
			bob.penDown();
		}
		 if (color.equals("green")) {
			bob.setPenColor(45, 255, 89);
			bob.penDown();

		}
		 if (color.equals("red")) {
				bob.setPenColor(255,0,0);
				bob.penDown();
		 }

		if (shape.equals("triangle")) {
			bob.setSpeed(10);
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.turn(130);
			bob.move(170);
		}
		
		 	if (shape.equals("square")) {
			bob.setSpeed(10);
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.turn(90);
			bob.move(100);

		}
			

		}
			
		}
	
