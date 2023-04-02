/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının basamalarından oluşan diziyi döndüren getDigits
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve test ediniz:
	Açıklamalar:
		- Metot negatif sayılar için basamakları pozitif olarak diziye yerleştirecektir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		ReverseTest.run();
	}
}

class ReverseTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		while (count-- > 0) {
			System.out.println("--------------------------------------------------------------");
			int [] a = getRandomArray(random, random.nextInt(3, 10), 0, 99);

			print(2, a);
			reverse(a);
			print(2, a);
			System.out.println("--------------------------------------------------------------");
		}
	}
}


class Util {
	public static void reverse(int [] a)
	{
		for (int i = 0; i < a.length / 2; ++i)
			swap(a, i, a.length - 1 - i);
	}

	public static void swap(int [] a, int i, int k)
	{
		int temp = a[i];

		a[i] = a[k];
		a[k] = temp;
	}
}


