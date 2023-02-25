/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Katsayıları klavyeden alınan ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınz.
	
	Sınıfın aşağıdaki kullanım şekli sınıfların yararı 100 birim düşünülürse %1 civarındadır. Şüphesiz örnek farklı 
	yaklaşımlarla da yapılabili. Sınıfın kullanımını göstermek için bu şekilde yazılmıştır. İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		QuadraticEquationSolverApp.run();
	}
}

class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Katsayıları giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();

		QuadraticEquation equation = new QuadraticEquation();
		
		equation.a = a;
		equation.b = b;
		equation.c = c;
		
		equation.solve();
		
		if (equation.rootsExists)
			System.out.printf("x1 = %f, x2 = %f%n", equation.x1, equation.x2);
		else
			System.out.println("Gerçek kök yok");
	}
}

class QuadraticEquation {
	public double a, b, c;
	public double x1, x2;
	public boolean rootsExists;
	
	public double getDelta()
	{
		return b * b - 4 * a * c;
	}
	
	public void solve()
	{
		double delta = getDelta();
		
		if (delta >= 0) {
			double sqrtDelta = Math.sqrt(delta);
			
			x1 = (-b + sqrtDelta) / (2 * a);
			x2 = (-b - sqrtDelta) / (2 * a);
			rootsExists = true;
		}
	}
	
}

