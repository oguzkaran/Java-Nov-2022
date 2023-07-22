/*-----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		try (Scanner kb = new Scanner(System.in)) {
			System.out.print("Bir sayı giriniz:");
			int val = kb.nextInt();

			System.out.printf("%d * %d = %d%n", val, val, val * val);
		}
	}
}

