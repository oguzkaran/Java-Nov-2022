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
		return a >= 0 && calculateDigitsPowSum(a) == a;
	}
	
	public static int calculateDigitsPowSum(int a)
	{
		int n = countDigits(a);
		int total = 0;
		
		while (a != 0) {
			total += Math.pow(a % 10, n);
			a /= 10;
		}
		
		return total;
	}
	
	public static int countDigits(int a)
	{
		if (a == 0)
			return 1;
		
		return (int)Math.log10(Math.abs(a)) + 1;
	}	
}

