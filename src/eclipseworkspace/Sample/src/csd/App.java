/*----------------------------------------------------------------------------------------------------------------------
	Homework-007-1.sorunun bir çözmü	
	(Not: Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır)  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		LotteriesSimulationApp.run();
	}
}

class LotteriesSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {
			System.out.print("Kaç kaz oynatmak istersiniz?");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)
				break;
			
			System.out.println("------------------------------------------------");
			LotteriesSimulation simulation = new LotteriesSimulation(r);
			
			simulation.run(count);
			System.out.printf("1.oyun için kazanma olasılığı:%f%n", simulation.p1);
			System.out.printf("2.oyun için kazanma olasılığı:%f%n", simulation.p2);
			System.out.printf("3.oyun için kazanma olasılığı:%f%n", simulation.p3);
			System.out.println("------------------------------------------------");
		}
	}
}

class LotteriesSimulation {
	public double p1, p2, p3;
	public java.util.Random random;
	
	public LotteriesSimulation()
	{
		random = new java.util.Random();
	}
	
	public LotteriesSimulation(java.util.Random r)
	{
		random = r;
	}
	
	public void run(int count)
	{
		int winCount1 = 0, winCount2 = 0, winCount3 = 0;
		
		for (int i = 0; i < count; ++i) {
			Lottery1 lottery1 = new Lottery1(random, new ThreeBalls(random, 1, 99));
			Lottery2 lottery2 = new Lottery2(random, new ThreeBalls(random, 1, 99));
			Lottery3 lottery3 = new Lottery3(random, new ThreeBalls(random, 1, 99));
			
			lottery1.play();
			lottery2.play();
			lottery3.play();
			
			if (lottery1.win)
				++winCount1;
			
			if (lottery2.win)
				++winCount2;
			
			if (lottery3.win)
				++winCount3;
		}
		
		p1 = (double)winCount1 / count;
		p2 = (double)winCount2 / count;
		p3 = (double)winCount3 / count;
	}
}


class Lottery1 {
	public boolean win;
	public java.util.Random random;
	public ThreeBalls threeBalls;

	public Lottery1(java.util.Random r, ThreeBalls balls)
	{
		random = r;
		threeBalls = balls;
		threeBalls.pull();
	}
	
	public void play()
	{
		win = threeBalls.first + threeBalls.second + threeBalls.third > 150;
	}
}

class Lottery2 {
	public boolean win;
	public java.util.Random random;
	public ThreeBalls threeBalls;

	public Lottery2(java.util.Random r, ThreeBalls balls)
	{
		random = r;
		threeBalls = balls;
		threeBalls.pull();
	}
	
	public void play()
	{
		win = NumberUtil.isPrime(threeBalls.first + threeBalls.second + threeBalls.third);
	}
}


class Lottery3 {
	public boolean win;
	public java.util.Random random;
	public ThreeBalls threeBalls;

	public Lottery3(java.util.Random r, ThreeBalls balls)
	{
		random = r;
		threeBalls = balls;
		threeBalls.pull();
	}
	
	public void play()
	{
		int min = Math.min(Math.min(threeBalls.first, threeBalls.second), threeBalls.third);
		int max = Math.max(Math.max(threeBalls.first, threeBalls.second), threeBalls.third);
		int mid = threeBalls.first + threeBalls.second + threeBalls.third - max - min;
		
		win = max - min > mid;
	}
}

class ThreeBalls {
	public int minVal;
	public int maxVal;
	public int first, second, third;
	public java.util.Random random;
	
	public int getFirst()
	{
		return random.nextInt(minVal, maxVal + 1);
	}
	
	public int getSecond()
	{
		int second;
		
		while ((second = random.nextInt(minVal, maxVal + 1)) == first)
			;
		
		return second;
	}
	
	public int getThird()
	{
		int third;
		
		while ((third = random.nextInt(minVal, maxVal + 1)) == first || third == second)
			;
		
		return third;
	}
	
	public ThreeBalls()
	{
		maxVal = 99;
		random = new java.util.Random();
	}
	
	public ThreeBalls(java.util.Random r, int min, int max)
	{
		minVal = min;
		maxVal = max;
		random = r;
	}
	
	public void pull()
	{
		first = getFirst();
		second = getSecond();
		third = getThird();
	}	
}

class NumberUtil {	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;	
	}
}

