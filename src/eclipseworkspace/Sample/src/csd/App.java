/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		RandomPointGeneratorApp.run();		
	}
}

class RandomPointGeneratorApp {
	public static void run()
	{
		java.util.Random r = new java.util.Random();
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Tohum değerini giriniz:");
		long seed = Long.parseLong(kb.nextLine());
		
		r.setSeed(seed);
		
		System.out.print("Minimum değeri giriniz:");
		double min = Double.parseDouble(kb.nextLine());
		
		System.out.print("Sınır değeri giriniz:");
		double bound = Double.parseDouble(kb.nextLine());
		
	
		for (;;) {
			System.out.print("Kaç tane nokta üretmek istersiniz?");
			int count = Integer.parseInt(kb.nextLine());
			if (count <= 0)
				break;
			
			System.out.println("-------------------------------");
			while (count-- > 0) {
				Point p = RandomPointGenerator.createRandomPoint(r, min, bound);
				
				p.print();
			}
			
			System.out.println("-------------------------------");
		}
		
	}
}

class RandomPointGenerator {
	//...
	public static Point createRandomPoint(java.util.Random random, double min, double bound)
	{
		Point p = new Point();
		
		p.x = random.nextDouble(min, bound);
		p.y = random.nextDouble(min, bound);
		
		return p;
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
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
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


