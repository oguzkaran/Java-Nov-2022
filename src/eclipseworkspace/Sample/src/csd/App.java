/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyel değerine geri dönen factorial isimli metodu
	yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
	 0! = 1 ve 1! = 1 olmak üzere
	 n! = 1 * 2 * ... * n - 1 * n
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
	public static int factorial(int n)
	{
		//TODO:
	}
}



