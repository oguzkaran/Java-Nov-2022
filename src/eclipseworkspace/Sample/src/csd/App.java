/*----------------------------------------------------------------------------------------------------------------------
	ctor aşağıdaki özelliklere sahp bir metottur:
	- Sınıfı yazan programcı, sınıfa hiç bir ctor yazmazsa, derleyici parametresiz ctor'u (default ctor) public ve
	içi boş olarak otomatik olarak yazar
	
	- Sınıfı yazan programcı en az bir tane ctor yazarsa, default ctor derleyici tarafından yazılmaz. Artık default 
	ctor'un yazılmayacağına programcı karar verecektir
	
	- ctor overload edilebilir (constructor overloading)
	
	- Sınıfın ctor'u sınıf ismi ile aynı olan ve geri dönüş değeri kavramı olmayan bir metottur. Geri dönüş değeri
	bilgisi yazılmaz. void da yazılmaz. Sınıf ismi ile aynı isimde bir metot yazılıp geri dönüş değeri bilgisi yazılırsa
	artık bu metot ctor olmaz. Şüphesiz böyle bir metot yazılmamalıdır
	
	- ctor non-static bir metottur
	
	- ctor new operatörüğ ile nesne yaratılmasın sırasında çağrılır. Hangi ctor'un çağrılacağı derleme zamanında 
	new operatörü ile kullanımda geçilen argümanlara göre "method overload resolution" kuralları ile belirlenir
	
	- 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		
	}
}

class Sample {
	public Sample(int a)
	{
		
	}
	
	public Sample(double a)
	{
		
	}
	
	public void foo()
	{
		
	}
}