/*----------------------------------------------------------------------------------------------------------------------
	Nitelikli isim arama genel kuralları (else if biçiminde değerlendiriniz):
	1. Aranacak ismin solunda bir UDT ismi varsa, ilgili UDT içerisinde aranır. 
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{	
		Sample.x = 10;
		Sample.foo();
		
		System.out.printf("Sample.x = %d%n", Sample.x);
	}
}

class Sample {
	public static int x;
	public static void foo()
	{
		System.out.println("Sample.foo");
	}
}



