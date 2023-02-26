/*----------------------------------------------------------------------------------------------------------------------
	Rassal Sayı Üretimi: Bilgisayar ortamında rassal sayılar gerçek hayattaki gibi üretilemez. Çünkü gerçek hayatta
	bir sayının örneğin bir torbadan çekilmesi durumunda çok çok fazla etken çıkacak sayıyı etkiler. Bu sebeple
	bilgisayarda üretilen rassal sayılara "pseudo random numbers" denilmektedir. Bu sebeple rassal sayı üretiminin
	kalitesi değişebilir. Rsaal sayı üretimi her durumda aynı yöntemle yapıldığından yani kabaca static bir yöntem
	kullanıldığıundan kalitesi yönteme göre değişebilir. Bu anlamda genel olarak aşırı kalite istenirse matematiksel
	işlemlerden dolayı yavaşlama olabilir, benzer şekilde hızlandırılmak istenirse de kalite düşebilir. Bu anlamda
	Java'da kullanılan üretim algoritması orta kalite kabul edilebilir. Bilgisayar ortamında rassal sayı üretiminin
	kalitesine yönelik bilimsel çalışmalar hala devam etmektedir   
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		Point p1, p2;
		
		p1 = new Point();
		p2 = new Point();
		
		p1.x = 100;
		p1.y = 200;
		p2.x = 97;
		p2.y = 204;
		
		
		p1.print();
		p2.print();
		
		System.out.printf("Distance:%f%n", p1.distance(p2));
		System.out.printf("Distance:%f%n", p1.distance(97, 204));
		System.out.printf("Distance:%f%n", p1.distance());
	}
}

class Point {
	public double x, y; 
	
	//...
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(double a, double b)
	{
		Point other = new Point();
		
		other.x = a;
		other.y = b;
		
		return distance(other);
	}
	
	public double distance(Point other)
	{
		return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
	}
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public void print()
	{
		System.out.printf("(%.2f, %.2f)%n", x, y);
	}
}

