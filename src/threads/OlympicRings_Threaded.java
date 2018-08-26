package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {

		Robot kiki = new Robot(400, 550);
		Robot fefe = new Robot(600, 550);
		Robot kb = new Robot(800, 550);
		Robot tinashe = new Robot(500, 700);
		Robot tekashi = new Robot(700, 700);
		int move = 2;

		Thread r1 = new Thread(() -> {
			kiki.setPenColor(Color.BLUE);
			kiki.setPenWidth(3);
			kiki.penDown();
			kiki.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				kiki.move(move);
				kiki.turn(360 / 360);
			}
		});
		
		Thread r2 = new Thread(() -> {
			fefe.setPenColor(Color.BLACK);
			fefe.setPenWidth(3);
			fefe.penDown();
			fefe.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				fefe.move(move);
				fefe.turn(360 / 360);
			}
		});
		
		Thread r3 = new Thread(() -> {
			kb.setPenColor(Color.RED);
			kb.setPenWidth(3);
			kb.penDown();
			kb.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				kb.move(move);
				kb.turn(360 / 360);
			}
		});
		
		Thread r4 = new Thread(() -> {
			tinashe.setPenColor(Color.YELLOW);
			tinashe.setPenWidth(3);
			tinashe.penDown();
			tinashe.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				tinashe.move(move);
				tinashe.turn(360 / 360);
			}
		});
		
		Thread r5 = new Thread(() -> {
			tekashi.setPenColor(Color.GREEN);
			tekashi.setPenWidth(3);
			tekashi.penDown();
			tekashi.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				tekashi.move(move);
				tekashi.turn(360 / 360);
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	}
}
