/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının Türkçe pangram olup olmadığını test eden isPangramTR
	ve İngilizce pangram olup olmadığını test eden isPangramEN metotlarını StringUtil sınıfı içerisinde yazınız
	ve aşağıdaki kod ile test ediniz.
	
	Pangram: İçerisinde özel isim olmayan ve ilgili dilin alfabesindeki tüm karakterleri içeren anlamlı cümlelere denir
	
	Parogramda özel isim ve anlamlı olması kontrolü yapılmayacaktır
	
	İngilizce: The quick brown fox jumps over the lazy dog
	Türkçe: Pijamalı hasta yağız şoföre çabucak güvendi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsPangramTest.run();
	}
}

class IsPangramTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		IsPangramTRTest.run(kb);
		IsPangramENTest.run(kb);
	}
}

class IsPangramENTest {
	public static void run(java.util.Scanner kb)
	{
		for (;;) {
			System.out.print("Input a text:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "No a Pangram");
		}
	}
}

class IsPangramTRTest {
	public static void run(java.util.Scanner kb)
	{
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");
		}
	}
}


class StringUtil {
	public static boolean isPangramTR(String s)
	{
		//TODO:
	}
	
	public static boolean isPangramEN(String s)
	{
		//TODO:
	}
}


