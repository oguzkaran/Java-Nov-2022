/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün ay ve yıl bilgisine ilişkin tarihin yılın kaçıncı günü 
	olduğunu döndüren getDayOfYear metodunu yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
	  - Metot geçersiz bir tarih için -1 değerine geri dönecektir
	  - Yılın kaçıncı günü olduğuna ilişkin algoritma için aşağıdaki örnekleri inceleyiniz:
	  	01.03.2020 -> 1 + 29 + 31 = 61
	  	01.03.2023 -> 1 + 28 + 31 = 60
	  	31.12.2020 -> 31 + 30 + ... + 29 + 31 = 366
	  	31.12.2023 -> 31 + 30 + ... + 28 + 31 = 365
	  	 
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		GetDayOfYearTest.run();
	}
}

class GetDayOfYearTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			int dayOfYear = DateUtil.getDayOfYear(day, month, year);
			
			if (dayOfYear != -1)
				System.out.printf("%02d/%02d/%04d tarihi yılın %d. günüdür%n", day, month, year, dayOfYear);
			else
				System.out.println("Geçersiz tarih!...");
			
		}
	}
}

class DateUtil {
	public static int getDayOfYear(int day, int month, int year)
	{
		//TODO:
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}