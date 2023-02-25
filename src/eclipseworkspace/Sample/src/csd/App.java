/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın non-static bir metodu içerisinde o sınıfın non-static metodu doğrudan çağrılabilir. Doğrudan çağrılan metot,
	çağıran metodun çağrılmasında kullanılan referans ile çağrılmış olur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{
		Sample s1, s2;
		
		s1 = new Sample();
		s2 = new Sample();
		
		s1.foo(20);
		s2.foo(30);
		
		System.out.printf("s1.x = %d%n", s1.x);
		System.out.printf("s2.x = %d%n", s2.x);
	}
}


class Sample {
	public int x;
	
	public void foo(int a)
	{
		bar(a);
	}
	
	public void bar(int a)
	{
		x = a;
	}
	
	//...
}



