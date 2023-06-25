/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Bir nesnenin kullanılamaz durumda olup yok edilememesi durumuna "bellek sınıtısı (memory leak)"
	denir. Bazı programlama dillerinde dinamik tahsis edilen bellek alanlarının "free/delete" edilmesi programcının
	sorumluluğundadır. Bu tarz programlama dillerinde, programcı dinamik tahsis ediklen alanı geri bırakmazsa, bu alanlar
	programın sonuna kadar yaşarlar. Memory leak oluşumunda zaman içerisinde bellekte yer kalmaması durumu oluşabilir, ya da
	çok fazla bnesne yaratılması da yavaşlığa sebep olabilir. Java'da garbage collector olduğuna göre memroy leak oluşur mu?
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;

		s = new Sample(); //rc1:1

		{
			Sample k = s; //rc1:2

			Mample.foo(k); //rc1:3 -> rc1:4
			//rc1:3 -> rc1:2
		} //rc:1

		Mample.foo(s); //rc1:2 -> rc1:3
		//rc1:2 -> rc1:1

		s = new Sample(); //rc2:1, rc1:0 (garbage collected)

		System.gc(); //Runtime.getRuntime().gc();
		//... (Programın sonlanmadığını varsayınız
	}
}

class Mample {
	public static void foo(Sample s)
	{
		Sample k;

		//... (Burada k veya s referansı başka bir referansa atanmıyor varsayınız)

		k = s;

		//... (Burada k veya s referansı başka bir referansa atanmıyor varsayınız)
	}
}
class Sample {
	//...
}
