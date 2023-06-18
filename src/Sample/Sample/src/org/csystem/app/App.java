/*----------------------------------------------------------------------------------------------------------------------
	instanceof operatörü birinci operandına ilişkin referansın dinamik türünün ikinci operandına ilişkin türü kapsayıp
	kapsamadığına bakar. Aşağıdaki programı çalıştırıp sonucu gözlemleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Application.run();
	}
}

class Application {
	public static void run()
	{
		AFactory factory = new AFactory();
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		while (count-- > 0) {
			A a = factory.create();
			B b;

			System.out.println("------------------------------------------------");
			System.out.println(a.getClass().getName());

			if (a instanceof B) {
				b = (B)a;
				System.out.println("Haklı dönüşüm");
			}
			else
				System.out.println("Haksız dönüşüm");

			System.out.println("------------------------------------------------");
		}
	}
}

class AFactory {
	private final Random m_random = new Random();

	public A create()
	{
		return switch (m_random.nextInt(5)) {
			case 0 -> new B();
			case 1 -> new C();
			case 2 -> new D();
			case 4 -> new E();
			default -> new A();
		};
	}
}

class E extends A {
	//...
}

class D extends B {
	//...
}

class C extends B {
	//..
}

class B extends A {
	//...
}

class A {
	//...
}
