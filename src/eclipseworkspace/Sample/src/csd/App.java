/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime isimli
	metodu NumberUtil sınıfı içerisinde yazınız ve test ediniz
	
	Açıklamalar:
	- iPrime metodunun hızlı versiyonunu kullanınız
	- n değerinin poziitf olmaması durumu metot içerisinde kontrol edilmeyecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsPrimeTest.run();
	}
}

class IsPrimeTest {
	public static void run()
	{	
		for (int n = 0; n < 13; ++n)
			System.out.printf("%d! = %d%n", n, NumberUtil.factorial(n));
	}
}


class NumberUtil {
	public static int getPrime(int n)
	{
		//TODO:
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
		
	}
}




