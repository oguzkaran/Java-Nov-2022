/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıf nesnesi içerisinde taban sınıf nesnesi kadar alan da bulunur. Yani türemiş sınıf nesnesi içerisinde
	taban sınıfın non-static veri elemanlarında vardır. Bu durumda belleksel yani nesnesel bir kapsama vardır. Bu durumda
	türemiş sınıf nesnesinin uzunlupu "en az, taban sınıf nesnesinin uzunluğu + türemiş sınıfa eklenen non-static
	veri elemanlarının toplam uzunluğu kadardır"
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		C c = new C();

		c.x = 10;
		c.y = 3.4;
		c.z = true;

		System.out.printf("c.x = %d, c.y = %f, c.z = %b%n", c.x, c.y, c.z);
	}
}

class C extends B {
	//...
	public boolean z;
	//...
}

class B extends A {
	//...
	public double y;
	//...
}

class A {
	//...
	public int x;

	//...
}