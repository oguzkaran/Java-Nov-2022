/*----------------------------------------------------------------------------------------------------------------------
	 double türünden float türne yapılan explicit dönüşümde bilgi kaybı olabilir. Bu durumda IEEE 754 standardına göre 
	 yuvarlama hatalaı oluşabilir ve değer float türü ile temsil edilebilecek en yakın değer olarak elde edilir. Ayrıca sayı 
	 float türü sınırları dışındaysa da aynı şekilde yapılır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		double a = 3.77;
		float b;
		
		b = (float)a;
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
	}
}

