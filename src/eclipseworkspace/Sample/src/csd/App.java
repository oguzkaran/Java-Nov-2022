/*----------------------------------------------------------------------------------------------------------------------
	continue deyimi döngüyü değil, döngünün o anki adımını sonlandırmak için kullanılır. continu deyiminin de etiketli
	biçimi vardır. Ancak yapısal programlama ve nesne yönelimli porogramlama tekniği açısından kullanımı tavsiye edilmez.
	continue deyiminin etiketsiz biçimi break deyimi kadar sık kullanılmaz. Ancak bazı durumlarda okunabililiği artırabilir.
	continue deyimi yalnızca döngü içerisinde kullanılabilir. 
	
	Aşağıdkai örnekte 1 ile klavyeden girilen sayı arasındaki çift sayılar ekrana bastırılmıştır. Şüphesiz daha kolay
	yazılabilir. Sadece continue deyiminin çalışma prensibinin anlaşılması için bu şekilde yazılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 1; i <= n; ++i) {
			if (i % 2 != 0)
				continue;
			
			System.out.printf("%d ", i);
		}
		
		System.out.println("\nTekrar yapıyor musunuz?");
	}
}

