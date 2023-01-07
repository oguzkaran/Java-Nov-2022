/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren counDigits isimli metodu
	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		CountDigitsTest.run();
	}
}

class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int a;
		
		while ((a = Integer.parseInt(kb.nextLine())) != 0) {
			System.out.printf("%d sayısının basamak sayısı:%d%n", a, NumberUtil.countDigits(a));
			System.out.print("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int countDigits(int a)
	{
		if (a == 0)
			return 1;
		
		int count = 0;
		
		while (a != 0) {
			++count;
			a /= 10;
		}
		
		return count;
	}
}