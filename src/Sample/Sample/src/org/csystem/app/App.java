/*----------------------------------------------------------------------------------------------------------------------
	Nitelikli ve niteliksiz isim arama genel kurallarına göre bir isim bulunamazsa taban sınıfa ve dolaylı taban sınıflara
	da bulununcaya veya bulunamayaıncaya kadar sırasıyla bakılır. Bulunursa ilk bulunan sınıftaki isim alınır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		C c = new C();

		c.bar(10);
		System.out.printf("c.x = %d%n", c.x);
		System.out.printf("c.y = %d%n", c.y);
	}
}

class C extends B {
	//...
	public void bar(int val)
	{
		foo();
		y = -val;
		x += val;
	}
}

class B extends A {
	public int y;

	public void foo()
	{
		System.out.println("B.foo");
	}
}
class A {
	public int x;
	//...
}
