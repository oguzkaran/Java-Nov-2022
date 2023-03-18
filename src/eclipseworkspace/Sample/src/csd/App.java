/*----------------------------------------------------------------------------------------------------------------------
  	Sınıf Çalışması: Parametresi ile aldığı bir yazının ilk harfi büyük geri kalan harfleri küçük olacak şekilde
  	ve harf dışı karakter de aynı kalacak şekilde bir yazı döndüren capitalize isimli metodu StringUtil metodu 
  	içerisinde yazınız ve aşağıdaki kod ile test ediniz.
  	Örnek jAVA Programcısı çok çalışmalıdır -> Java programcısı çok çalışmalıdır
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String str = kb.nextLine();
		
		int len = str.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(i);
			
			ch = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
			
			System.out.printf("%s", ch);
		}
		
		System.out.println();
	}
}

class CapitalizeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			System.out.printf("[%s]%n", StringUtil.capitalize(s));
			
			if ("elma".equals(s))
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static String capitalize(String s)
	{
		//TODO:
	}
}
