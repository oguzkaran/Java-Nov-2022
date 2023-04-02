/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarını test yüz eden reverse isimli metodu
	başka bir dizi kullabnmadan yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.getRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Random random = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;
			int[] a = getRandomArray(random, count, 0, 99);

			System.out.println("--------------------------------------------------------------------------------------");
			print(3, a);
			System.out.println("--------------------------------------------------------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}




