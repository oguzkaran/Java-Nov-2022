/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Paramatresi ile aldığı int türden bir n değeri için n tane rasgele üretilmiş Türkçe
	karakterden oluşan bir yazı döndüren getRandomtextTR ile n tane rasgele üretilmiş İngilizce karakterden oluşan
	bir yazı döndüren getRandomTextEN metotlarını yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		GetRandomTextTRENTest.run();
	}
}

class GetRandomTextTRENTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0))
				break;
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(r, n));
			System.out.printf("Password:%s%n", StringUtil.getRandomTextEN(r, n));
		}
	}
}


class StringUtil {
	public static String getRandomTextTR(java.util.Random r, int n)
	{
		
	}
	
	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new java.util.Random(), n);
	}
	
	 
	
	public static String getRandomTextEN(java.util.Random r, int n)
	{
		
	}
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new java.util.Random(), n);
	}
}


