/*----------------------------------------------------------------------------------------------------------------------
	Tür (type): Bir değişken için bellekte ne kadar yer ayrılacağını ve içerisindeki değerin hangi yöntemle tutulacağını
	belirten kavramdır
	
	Java'da türler genel olarak iki gruba ayrılabilir:
	Temel türler (primitive/built-in/predefined types), programcının tanımladığı türler (user defined types)
	
	Java'da türler birer anahtar sözcük ile temsil edilir:
	
	Temel türler:
	
	Tür ismi				Uzunluğu (byte)
	short						2
 	*int						4
	long						8
	byte						1
	
	float						4
	*double						8
	
	char						2
	boolean						-	
	
	
	Açıklamalar:
	- Tüm tamsayı türleri (integer/integral type) işaretlidir (signed). İkiye tümleme yöntemi kullanır. Java'da işaretsiz
	tamsayı türü yoktur. Ancak Java 8 ile birlikte belirli koşullar altında işaretsiz tamsayı işlemleri yapılabilmektedir
	
	- long türü en uzun tamsayı türüdür
	
	- Gerçek sayı türleri (real/floating point types) için "IEEE 754 standardı" kullanılır. float ve double türleri
	sırasıyla tek hassasiyetli (single precision) ve çift hassasiyetli (double precision) olarak değerleri tutmaktadır.
	Bu türlerde bazı sayılar tam olarak ifade edilemezler. O sayıya en yakın bir sayı ile ifade edilebilirler. Bir noktalı
	sayının ifade edilemeyip en yakın sayı olarak alınmasına "yuvarlama hatası (rounding error)" denir. Yuvarlama hataları
	değer ilk kez yerleştirilirken de oluşabilir, bir işlemin sonucunda da oluşabilir. 
	
	- Gerçek sayı türleri işaretli türlerdir.
	
	- float türünün yuvarlama hatalarına karşı direnci zayıftır. Yani yuvarlama hatası daha çok olmaktadır
	
	- Yuvarlama hataları parasal ve finansal uygulamalarda hatalı değerlerin oluşmasına sebep olabilir. Sırf parasal ve
	finansal uygulamalar tasarlanmış özel türler (sınıflar) bulunur. Programcı böylesi uygulamalar için bu özel türleri
	tercih eder. Ancak bu sınıflar yuvarlama hatası oluşmaması için yüzlerce makine komutu kullanarak işlem yaparlar. Bu
	durumda programcı için parasal ve finansal uygulamalar gibi yuvarlama hatalarının olmaması gereken durumlar dışında 
	double veya duruma göre float türü tercih edilmelidir.	
	
	- boolean türünün alabileceği iki tane değer vardır: true, false. boolean türünün "Java Language Specification"'da 
	belirtilmemiştir. Sistemden sisteme değişebilir. Ancak bu değişim programcı açısından problem oluşturmaz.	
	
	Anahtar Notlar: Java'da en çok kullanılan tamsayı türü int'tir, en çok kullanılan gerçek sayı türü de double'dır.
	Programcı öncelikle bu türleri tercih etmelidir. Eğer geçerli bir nedeni varsa diğer türleri kullanmalıdır
	
	Anahtar Notlar: int türüne "integer" demek yanlış bir terim kullanmak demektir. integer terimi tamsayılar için kullanılan
	genel bir terimdir. Ayrıca "Integer" isimli ileride göreceğimiz bir sınıf da bulunmaktadır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
				
	}
}

