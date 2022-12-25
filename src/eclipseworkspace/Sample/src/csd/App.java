/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Katsayıları klavyeden alınan ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınz.
	Not: İleride daha iyisi yazılacaktır
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

		QuadraticEquationSolver.printRoots(a, b, c);
	}
}

class QuadraticEquationSolver {
	public static void doWorkForRoots(double delta, double a, double b)
	{
		double x1, x2;
		double sqrtDelta;
		
		sqrtDelta = Math.sqrt(delta);
		
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
	}
	

	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void printRoots(double a, double b, double c)
	{
		double delta = getDelta(a, b, c);
		
		if (delta >= 0)
			doWorkForRoots(delta, a, b);
		else
			System.out.println("Gerçek kök yok");
		
	}
}

