/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	
	Açıklamalar:
		- Bir sayının her basamağının basamak sayıncı kuvvetleri toplandığında sayının kendisine eşitse bu sayıya 
		Armstrong sayısı denir. Örneğin:
			153 -> 1  * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
			
		- Kuvvet alma işlemi için yazılmış pow metodunu kullanınız
		
		- Sayı negatif ise Armstrong sayıaı kabul etmeyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsArmstrongTest.run();
	}
}

class IsArmstrongTest {
	public static void run()
	{
		for (int a = -10; a <= 99999; ++a)
			if (NumberUtil.isArmstrong(a))
				System.out.println(a);
	}
}

class NumberUtil {
	public static boolean isArmstrong(int a)
	{
		//TODO:
	}
	
	public static int countDigits(int a)
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0); 
		
		return count;
	}
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;
	}
}