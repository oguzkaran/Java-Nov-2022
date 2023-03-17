/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden elma girilene kadar alınan yazıların arasında - karakteri olacak şekilde birleştirilmiş
	bir String oluşturan programı yazınız
	Örneğin: ankara istanbul izmir girilirse -> ankara-istanbul-izmir
	Örneği: ankara girilirse -> ankara
	Açıklamalar:
	  - Tamamı whitespace karakterlerden oluşan string ve boş string yazıya eklenmeyecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		ReverseTest.run();
	}
}

class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String str = kb.nextLine();
			
			if ("elma".equals(str))
				break;
			
			System.out.printf("Yazının tersi:%s%n", StringUtil.reverse(str));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
}


class StringUtil {
	public static String reverse(String str)
	{
		//TODO:
	}
}