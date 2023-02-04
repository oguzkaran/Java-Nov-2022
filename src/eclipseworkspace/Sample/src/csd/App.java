/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Bir sınıf içerisinde AYNI metottan birden fazla olamaz. 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		Sample.foo();
		Mample.foo();
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("Sample.foo");
	}
}

class Mample {
	public static void foo()
	{
		System.out.println("Mample.foo");
	}
}