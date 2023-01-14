/*----------------------------------------------------------------------------------------------------------------------
	Demo menü uygulaması
	(İleride daha iyisi yazılacaktır) 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		MenuApp.run();
	}
}


class MenuApp {
	public static void run()
	{
		Menu.run();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Menu {
	public static void printMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doInsert()
	{
		System.out.println("---------------------------------");
		System.out.println("Ekle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doDelete()
	{
		System.out.println("---------------------------------");
		System.out.println("Sil seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doUpdate()
	{
		System.out.println("---------------------------------");
		System.out.println("Güncelle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doList()
	{
		System.out.println("---------------------------------");
		System.out.println("Listele seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doOption(int option)
	{
		switch (option) {
		case 1:
			doInsert();
			break;
		case 2:
			doDelete();
			break;
		case 3:
			doUpdate();
			break;
		default:
			doList();
			
		}
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			printMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			if (1 <= option && option <= 5) {
				if (option == 5)
					break;
				
				doOption(option);
			}
			else
				System.out.println("Geçersiz Seçenek!...");
		}
		
		System.out.println("Teşekkürler");
		System.out.println("C ve Sistem Programcıları Derneği");	
	}
}

