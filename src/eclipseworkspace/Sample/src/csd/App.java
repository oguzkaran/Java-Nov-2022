/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ ve -- operatörleri ve operandları aynı ifadede kullanılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = a-- + a++;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

