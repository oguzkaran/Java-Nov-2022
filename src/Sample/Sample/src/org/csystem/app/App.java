/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıfın metotlarının aynı referans (adres) üzerinde yani aynı nesne için, zincir biçiminde aşağıdaki gibi
	çağrılabilmesi için implementasyonda this referansına geri dönülmelidir. Bu biçimdeki çağrılara "fluent", bu
	biçimde yazılmıiş sınıflara ilişkin tasarım kalıbına ise "fluent pattern" denir. Bir sınıfın bu şekilde yazılıp
	yazılmayacağı şüphesiz senaryoya bağlıdır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.wrapper.MutableIntValue;

class App {
	public static void main(String [] args)
	{
		MutableIntValue value = MutableIntValue.of(20);

		int val = value.multiply(2).add(4).mod(3).subtract(1).getValue();

		System.out.printf("value = %d", val);
	}
}

