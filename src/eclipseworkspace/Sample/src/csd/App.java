/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıda açıklanan metotları StringUtil içerisinde yazınız ve aşağıdaki kod ile test ediniz.
		public static String padLeading(String s, int len, char ch);
		public static String padLeading(String s, int len);
		public static String padTrailing(String s, int len, char ch);
		public static String padTrailing(String s, int len);
		
	Açıklamalar:
		- padLeading metodunun 3 parametreli overload'u ikinci parametresi ile aldığı len, birinci parametresi ile 
		aldığı yazının uzunluğundan büyükse yazıyı soldan (baştan) üçüncü parametresi ile aldığı karakter ile
		doldurulmuş yeni bir String referansına geri dönecektir.
		Örneğin:
			padLeading("ankara", 12, 'x'); çağrısı
				xxxxxxankara
			yazısını döndürecektir
			
		- len uzunluğu yazının uzunluğundan kçük veya eşitse aynı referanda geri dönecektir
		
		- padLeading metodunun 2 parametreli overload'u yazıyı duruma göre soldan (baştan) space karakteri ile
		dolduracaktır
		
		- padTrailing metotları benzer şekilde ancak sağdan (sondan) dolduracak şekilde yazılacaktır
		
		- Metotları Java 11+ ve Java 11 öncesi için ayrı ayrı yazınız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		PadLeadingTrailingTest.run();
	}
}

class PadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String str = "";
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
		
			if ("elma".equals(s))
				break;
			
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(str, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(str, count));
			System.out.printf("(%s)%n", StringUtil.padTrailing(str, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(str, count));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String padLeading(String s, int len, char ch)
	{
		//TODO:
	}
	
	public static String padLeading(String s, int len)
	{
		//TODO:
	}
	
	public static String padTrailing(String s, int len, char ch)
	{
		//TODO:
	}
	
	public static String padTrailing(String s, int len)
	{
		//TODO:
	}
}
