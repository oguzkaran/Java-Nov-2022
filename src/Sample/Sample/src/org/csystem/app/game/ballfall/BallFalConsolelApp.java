package org.csystem.app.game.ballfall;

import org.csystem.game.ballfall.BallFall;

import java.util.Scanner;

class BallFalConsolelApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		BallFall ballFall = new BallFall();
		
		for (;;) {
			System.out.print("Input width and height:");
			int width = kb.nextInt();
			int height = kb.nextInt();
			
			if (width == 0)
				break;

			ballFall.play(width, height);
			System.out.println(ballFall.getShape());
		}
	}

	public static void main(String[] args)
	{
		run();
	}
}
