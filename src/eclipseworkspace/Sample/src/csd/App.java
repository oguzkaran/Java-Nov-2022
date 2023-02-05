/*----------------------------------------------------------------------------------------------------------------------
	Homework-003-7. sorunun bir çözmü
	(Not: Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır) 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsDecimalHarshadTest.run();
	}
}

class IsDecimalHarshadTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		while (n-- > 0)
			if (NumberUtil.isDecimalHarshad(n + 1))
				System.out.println(n + 1);	
	}
}

class NumberUtil {
	public static boolean isDecimalHarshad(int val)
	{
		return val > 0 && val % sumDigits(val) == 0; 
	}
	
	public static int sumDigits(long a)
	{
		int sum = 0;
		
		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}
		
		return Math.abs(sum);
	}
}

