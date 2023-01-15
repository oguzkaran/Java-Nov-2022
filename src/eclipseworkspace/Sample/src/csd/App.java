/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden yıl değerinin artık yıl olup olmadığını test edebn isLeapYeaar
	isimli metodu yazınız ve aşağıdaki kod ile test ediniz 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsLeapYearTest.run();
	}
}

class IsLeapYearTest {
	public static void run()
	{
		for (int y = 1996; y <= 2104; ++y)
			if (DateUtil.isLeapYear(y))
				System.out.println(y);
	}
}

class DateUtil {
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}