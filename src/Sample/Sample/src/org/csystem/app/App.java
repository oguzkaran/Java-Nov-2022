/*----------------------------------------------------------------------------------------------------------------------
	Programlamada genelleştirme açısından türden bağımsız (type independent) yazılır. Aslında programlamda temel amaçlardan
	biri yapılacak eklentiler durumunda eski kodlara dokunmamaktır. Aslında şöyle bir genel durum söylenebilir: Bir programın
	ilerleyen bir versiyonunda önceden yazılmış kodlara yönelik senaryo değişmedikten sonra, eski kodlara ne kadar az
	müdahale edilmesi gerekirse, kod o kadar kaliteli (iyi) yazılmıştır". İşte bu sebeple türden bağımsız kod yazmak programa
	eklenecek örneğin sınıfların bir lego'nun parçası gibi diğer parçalara dokunmadan eklenebilmesini sağlar.

	Aşağıdaki örnekte VehicleOperation sınıfının payTax metodu vehicle parametresi aldığından, tüm Vehicle sınıfından doğrudan
	ya da dolaylı olarak türetilmiş referans ile çağrılabilir. Bu durumda bu hiyararşiye yeni bir "vehicle" eklendiğinde
	payTax metodunun değiştirilmesi ya da yeni bir metot eklenmesi gerekmez.

	Not: Aşağıdaki örnek durumu göstermek için yazılmıştır. Şüphesiz konuya ilişkin bir çok detay da bulunmaktasır. Detayla
	dışında senaryonun bu kısmının türden bağımsızlığına odaklanınız
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B x = new B();
		A y;

		x.a = 10;
		x.b = 20;

		System.out.printf("x.a = %d%n", x.a);
		System.out.printf("x.b = %d%n", x.b);
		System.out.println("---------------------------------------");

		y = x; //upcasting

		++y.a;
		System.out.printf("x.a = %d%n", x.a);
		System.out.printf("y.a = %d%n", y.a);
		System.out.printf("x.b = %d%n", x.b);
		System.out.println("---------------------------------------");

		++x.a;

		System.out.printf("x.a = %d%n", x.a);
		System.out.printf("y.a = %d%n", y.a);
		System.out.printf("x.b = %d%n", x.b);
		System.out.println("---------------------------------------");
	}
}

class B extends A {
	//...
	public int b;
	//...
}

class A {
	//...
	public int a;
	//...
}