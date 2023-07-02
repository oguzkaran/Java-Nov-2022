/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının toString metodu ile ArrayList'in elemanları [] içeerisinde virgülle ayrılacak şekilde bir String
	elde edilebilir. Bu String'in elde edilme detayları ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.ArrayList;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		ArrayList names = new ArrayList();

		while (true) {
			System.out.print("İsim giriniz:");
			String name = kb.nextLine();

			if ("elma".equals(name))
				break;

			names.add(name);
		}

		System.out.println(names.isEmpty() ? "Hiç isim girmediniz!..." : names.toString());
	}
}
