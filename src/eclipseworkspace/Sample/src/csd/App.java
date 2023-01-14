/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı n sayısı için n-inci Fibonacci sayısını döndüren fibonacciNumber isimli
	metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklama:
		- Fibonacci serisi
			0 1 1 2 3 5 8 13 ...
		- Metot pozitif olmayan değerler için kontrol yapmayacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		FibaonnaciNumberTest.run();
	}
}


class FibaonnaciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n < 1)
				break;
			System.out.printf("%d.Fibonacci sayısı:%d%n", n, NumberUtil.fibonacciNumber(n));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int fibonacciNumber(int n)
	{
		//TODO:
	}
}