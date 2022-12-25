/*----------------------------------------------------------------------------------------------------------------------
	if deyiminde bileşk deyim kullanımı
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val % 2 == 0) {
			System.out.println("Çift sayı girdiniz");
			val /= 2;
		}
		else {
			System.out.println("Tek sayı girdiniz");
			val *= 2;
		}	
		
		System.out.printf("val = %d%n", val);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


