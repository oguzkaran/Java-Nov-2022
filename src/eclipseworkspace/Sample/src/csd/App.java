/*----------------------------------------------------------------------------------------------------------------------
	 İşlem Öncesi Otomatik Tür Dönüşümü:
	 İki operandlı bir operqtör için derleyici önce operandların türüne bakar. Operandlar farklı türdensa bve işlem 
	 geçerliyse, ortak bir türe dönüştürerek işlem yapılır. Hatta bazı durumlarda iki tür aynı olsa bile ikisini de 
	 farklı bir türe dönüştürür. Yani derleyici buna yönelik kodlar üretir. Bu dönüştürmeye "işlem önce öncesi otomatik
	 tür dönüşümü" denir
	 
	 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		short a = 10;
		short b = 20;
		short c;
		
		c = a + b;
	}
}
