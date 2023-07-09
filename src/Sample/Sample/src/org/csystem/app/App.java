/*----------------------------------------------------------------------------------------------------------------------
	abstract sınıflar ile arayüzler arasındaki farklar:
	-

	Soyut bir tür ne zaman abstract sınıf yapılmalıdır? Programcı buna nasıl karar verecektir?
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}
class A implements IX, IY, IZ {
	public void foo()
	{
		System.out.println("A.foo");
		super.foo(); //error
	}

	public void bar()
	{
		System.out.println("A.bar");
	}

	public void tar()
	{
		System.out.println("A.tar");
	}
}

interface IX {
	void foo();
}

interface IY {
	void bar();
}

interface IZ {
	void tar();
	default void foo()
	{
		System.out.println("IZ.foo");
	}
}