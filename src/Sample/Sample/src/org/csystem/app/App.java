/*-----------------------------------------------------------------------------------------------------------------------
	JavaSE'de bulunan önemli bazı exception sınıfları:
	IllegalArgumentException: Genel olarak bir metodun parametresine geçilen argümanın geçersiz olması durumunda fırlatılan
	exception sınıfıdır. Konuya özgü olarak bu sınıftan türetilmiş exception sınıfları da bulunmaktadır

	ClassCastException: Downcasting işleminde haksız dönüşüm olduğunda JVM tarafondan fırlatılır. Haksız dönüşümün kontrolü için
	handle edilebilir. Ancak bunun yerine instanceof operatörü ile kullanım tavsiye edilir. Bu exception programcı
	tarafından bir metot içerisinde fırlatılmaz

	NumberFormatException: IllegalArgumentException sınıfından türetilmiştir. Sarmalayan sınıfların parseXXX metotları
	(Boolean sınıfının parseBoolean metodu hariç) yazıyı ilgili temel türe çeviremezlerse bu exception'ı fırlatırlar

	NoSuchElementException: Tipik olarak bir elemanın yokluğu durumunda kullanılır

	InputMismatchException: Bu sınıf tipik olarak bir girdinin geçersizliği durumunda kullanılır. Örneğin Scanner sınıfının
	çeşitli metotları (nextInt, nextDouble, nextLong gibi) bu exception'ı fırlatırlar. Bu sınıf NoSuchElementException
	sınıfından türetilmiştir.

	ArrayIndexOutOfBoundsException: Bu exception özel olarak dizinin indeks numarasının geçersiz olduğu durumlarda JVM
	tarafından fırlatılır

	IndexOutOfBoundsException: Bu exception sınıfı indeksn taşmalarında kullanılır. Örneğin ArrayList sınıfının bazı
	metotları bu exception'ı fırlatırlar

	NullPointerException: Bir referansın null değeri tutması durumunda o referans ile non-static bir elemana erişilmeye
	çalışıldığında fırlatılır. Bu exception sınıfının programlamada handle edilmesi tavsiye edilmez. Genel olarak bu duruma
	yol açabilecek kod parçaları yazılmamalıdır ya da yazılmışsa da düzeltilmelidir.

	UmSupportedOperationException: Tipik o metodun o tür için desteklenmediği ancak bulunması gerektiği durumda kullanılır.

	IOException: Input ve/veya output durumlarında kullanılan checked nbir exception sınıfıdır. Bu exception sınıfından da
	önemli bazı exception sınıfları türetilmiştir

	Yukarıdaki exception sınıfları dışında da pek çok exception sınıfı bulunmaktadır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{

	}
}

class Sample {
	public static void bar() throws OurException
	{
		//...
	}
}

class D implements IX {
	public void foo() throws OurException
	{
		//...
		Sample.bar();
		//...
	}
}
class C implements IX {
	public void foo() throws TheirException
	{
		//...
	}
}

class B implements IX {
	public void foo() throws MyException
	{
		//...
	}
}
class A implements IX {
	public void foo()
	{
		//...
	}
}

interface IX {
	void foo() throws Exception;
}

class WrapperException extends RuntimeException {
	public WrapperException(String message, Throwable cause)
	{
		super(message, cause);
	}
	public String getMessage()
	{
		Throwable cause = getCause();

		return String.format("Message:%s%s", super.getMessage(), cause != null ? ", Cause Exception Message:" + cause.getMessage() : "");
	}
}
class MyException extends Exception {
	//...
}

class YourException extends Exception {
	//...
}

class TheirException extends MyException {
	//...
}

class OurException extends Exception {
	//...
}