/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Doğal bir dilde kurulan bir cüm içerisinde özel isimler dışında kalan her kavram soyuttur. Örneğin
	"Bir araba alacağım" cümlesinde araba soyut bir kavramı temsil eder. Kişi araba aldığında örneğin "ben  ... marka,
	.. model, ... plakalı ... araba aldım" dediğinde artık bu araba somutlaşmıştır. İşte burada soyut olan araba 
	nesne yönelimli programlama da bir sınıf, somutlaşmış olan araba ise bir nesnedir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{
		Device d; //d bir referans (değişken)
		Student s; //s bir referans (değişken)
		Alien a; //a bir referans (değişken)
	
		d = new Device(); //*
		s = new Student(); //**
		a = new Alien(); //***
		
		//...
	}
}


class Device {
	//...
}


class Student {
	//...
}

class Alien {
	//...
}