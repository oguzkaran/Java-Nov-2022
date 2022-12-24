/*----------------------------------------------------------------------------------------------------------------------
	-- operatörünün postfix kullanımında ürettiği değer yani işleme giren değer azaltılMAmış değerdir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = a--;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}