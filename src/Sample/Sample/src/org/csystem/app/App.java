/*----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

class A {
	private B m_b;

	public A(/*...*/)
	{
		//...
		m_b = new B(/*...*/);
	}

	public void doWork1()
	{
		//...
		m_b.doSomething();
		//...
	}

	public void doWork2()
	{
		//...
		m_b.doSomething();
		//...
	}
}

class B {
	//...
	public void doSomething()
	{
		//...
	}
	//...
}
