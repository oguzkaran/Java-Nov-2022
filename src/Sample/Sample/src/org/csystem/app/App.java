/*-----------------------------------------------------------------------------------------------------------------------
	Generic parametre türünden bir dizi de new operatörü ile aşağıdaki gibi yaratılabilir. Bu işlemler için başka
	yöntemler de vardır. Kodda verilen uyarıları dikkate almayınız
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{

	}
}

class A<T> {
	private T [] m_t;

	public A(int size)
	{
		m_t = (T []) new Object[size];
	}
}

class B<T> {
	private T m_t;

	public B()
	{
		m_t = (T)new Object();
	}
}

