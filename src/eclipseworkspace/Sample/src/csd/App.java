/*----------------------------------------------------------------------------------------------------------------------
	Aynı türden iki referansın birbirine atanması durumunda iki referans da artık aynı nesneyi gösterir duruma gelir.
	Bu durumda hangi referans ile nesneye erişildiğinin bir önemi yoktur. Aşağıdaki örnekte ** ile belirtilen ifadede
	s referansı, gösterdiği nesneden kopartılmış ve k'nın içerisindeki adres atandığından artık k ve s aynı nesneyi
	gösterir duruma gelmiştir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{
		Sample s, k;
		
		s = new Sample();
		k = new Sample();
		
		s.x = 10;
		s.y = true;
		k.x = 30;
	
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("s.y = %b%n", s.y);
		System.out.printf("k.x = %d%n", k.x);
		System.out.printf("k.y = %b%n", k.y);
		System.out.println("----------------------------");
		
		s = k; //**
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("s.y = %b%n", s.y);
		System.out.printf("k.x = %d%n", k.x);
		System.out.printf("k.y = %b%n", k.y);
		System.out.println("----------------------------");
		
		++s.x;
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("s.y = %b%n", s.y);
		System.out.printf("k.x = %d%n", k.x);
		System.out.printf("k.y = %b%n", k.y);
		System.out.println("----------------------------");
		
	}
}


class Sample {
	public int x;
	public boolean y;
	//...
}

