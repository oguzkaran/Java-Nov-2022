/*-----------------------------------------------------------------------------------------------------------------------
	Arayüzler de generic olarak bildirilebilirler
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{

	}
}

interface IX<T> {
	void foo(T t);
}

interface IY<T, K, R> {
	R bar(T t, K k);
}