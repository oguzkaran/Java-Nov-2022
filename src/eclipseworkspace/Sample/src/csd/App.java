/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek için Ingilizce alfabedeki karakterler karakter tablosundan standart olarak sıralı 
	olduğundan isPangramEN metodu aşağıdaki gibi de yazılabilir. Şüphesiz yukarıdaki yaklaşım daha geneldir
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
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a Pangram");
		}
	}
}


class StringUtil {
	public static boolean isPangramEN(String s)
	{
		s = s.toLowerCase();
		
		for (int i = 0; i < 26; ++i)
			if (!s.contains((char)('a' + i) + ""))
				return false;
		
		return true;
	}	
}


