/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi ile n-kez dönen döngü 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		for (int i = n - 1; i >= 0; --i)
			System.out.printf("%d ", i);
	
	}
}
