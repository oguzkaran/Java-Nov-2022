/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden elma girilene kadar alınan yazıları bir ArrayList içerisinde tutunuz. Bu işlemden sonra
	klavyeden alınan bir yazının ArrayList'in tüm elemanlarının arasında olacak şekilde birleştirildiği bir String
	elde eden programı yazınız
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;
import java.util.Vector;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Vector names = new Vector();

		while (true) {
			System.out.print("İsim giriniz:");
			String name = kb.nextLine();

			if ("elma".equals(name))
				break;

			names.add(name);
		}

		System.out.printf("Capacity:%d%n", names.capacity());
		names.ensureCapacity((int)Math.floor(names.capacity() / 2.));
		System.out.printf("Capacity:%d%n", names.capacity());
		names.ensureCapacity((int)Math.floor(names.capacity() * 1.5));
		System.out.printf("Capacity:%d%n", names.capacity());
		names.ensureCapacity(names.capacity() * 2 + 1);
		System.out.printf("Capacity:%d%n", names.capacity());
	}
}
