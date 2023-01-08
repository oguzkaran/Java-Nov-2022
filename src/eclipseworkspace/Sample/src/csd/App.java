/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren pow isimli
	metodu NumberUtil sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz:
	
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot negatif b değerleri için 1 değerine dönecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		PowTest.run();
	}
}

class PowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		for (;;) {
			System.out.print("Tabanı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Üssü giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a, b));
			
			if (a == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}		
		}
	}
}

class NumberUtil {
	public static int pow(int a, int b)
	{
		//TODO:
	}
}