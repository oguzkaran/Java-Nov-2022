/*-----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		System.out.println(Sample.foo("foo")); //footry
	}
}

class Sample {
	public static String foo(String str)
	{
		String result = str;

		try {
			return result += "try";
		}
		finally {
			result += "finally";
		}
	}
}

