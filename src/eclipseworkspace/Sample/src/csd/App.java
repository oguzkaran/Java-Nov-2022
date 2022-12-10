/*----------------------------------------------------------------------------------------------------------------------
	return deyiminin en temel görevi metot sonlandırmak olduğunda Aşağıdaki örnek return deyiminden sonra yazılan kod
	error oluşturur. Çünkü aklış hiç bir zaman return deyiminden sonra metot içerisinde kalmaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		int result;
		
		result = NumberUtil.add() * 2;
		
		System.out.println(result);
	}
}


class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return total;
		System.out.println("Merhaba"); //error
	}
}