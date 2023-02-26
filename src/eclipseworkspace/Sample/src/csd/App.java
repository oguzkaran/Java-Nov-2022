/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: İki zar atıldığında zarların çift gelmesi (ikisinin de aynı) olasılığını yaklaşık olarak 
	hesaplayan simülasyon programını yazınız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		CoinTailProbabilitySimulationApp.run();
	}
}

class CoinTailProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Para kaç kez atılsın:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			CoinTailProbabilitySimulation simulation = new CoinTailProbabilitySimulation();
			
			simulation.run(n);
			System.out.printf("Yazı gelme olasılığı:%f%n", simulation.p);
		}
	}
}

class CoinTailProbabilitySimulation {
	public double p;
	
	public static int calculateTailCount(int n)
	{
		java.util.Random r = new java.util.Random();
		int count = 0;
		
		for (int i = 0; i < n; ++i)
			if (r.nextBoolean())
				++count;
		
		return count;
	}
	
	
	public void run(int n)
	{
		p = calculateTailCount(n) / (double)n;
	}
}

