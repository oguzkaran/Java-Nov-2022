/*----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.wrapper.IntValue;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		DemoApp.run();
	}
}

class DemoApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();

		if (val < 1 || val > 3) {
			System.out.println("Geçersiz değer girdiniz!...");
			System.exit(1);
		}

		IntValue value = null;

		switch (val) {
			case 1 -> value = IntValue.of(-128);
			case 2 -> value = IntValue.of(0);
			case 3 -> value = IntValue.of(127);
		}

		System.out.printf("Value:%d%n", value.intValue());
	}
}