/*----------------------------------------------------------------------------------------------------------------------
	Paketler (Packages) ve İsim Arama (Name Lookup):
	Aşağıdaki maddelerde "user defined type (UDT)" olarak bildirilen kavram için şu ana kadarki bilgilerimizle
	sınıf düşünülebilir. Anımsanacağı gibi ileride başka UDT'ler de göreceğiz.
	
	Java kodlarını içeren ve gennelikle ".java" uzantılı olan bir dosyaya (derlenen dosyaya)
	"derleme birimi (compilation/translation unit)" denir. Eğer .java uzantılı dosyada birden fazla UFT söz konusu
	ise her bir UDT bir derleme birimi olarak düşünülebilir
	
	Paketlere ilişkin detaylar:
	
	- javac her UDT için ayrı bir ".class" uzantılı dosya "byte code" üretir. Bu işlem UDT'ler aynı .java uzantılı
	dosyada olsa bile bu şekilde yapılır
	
	- Bir UDT herhangi bir pakette olabilir. Bir proje içerisinde kullanılan UDT'lerin aynı pakette olmnası 
	gerekmez
	
	- Bir ".class" uzantılı dosyanın, dosyaya ilişkin UDT'nin ait olduğu paketle aynı isimde bir dizinde (directory)
	olması gerekir. Aslında .java uzantılı dosyalar için böyle bir zorunluluk yoktur. Ancak bir çok IDE kendi
	içerisinde bunu zorunlu tutar
	
	- Bir UDT bulunduğu paket dışında yani bir paketin içerisinde, paket ismi ve nokta operatörü ile kullanılabilir.
	
	- Bir paket içerisinde bildirilen bir UDT'nin farklı paketlerden kullanılabilmesi için public olarak bildirilmesi
	gerekir. public olarak bildirilmeyen bir UDT ancak aynı paketteki diğer UDT'ler tarafıdan kullanılabilir. public
	olmayana UDT'leer için için genel olarak "friendly" ya da daha nadir de olsa "internal" terimi kullanılır
	
	- Farklı paketlerde UDT'ler için byte code'larıbnın da uygun yerde olması gerekir. Uygulamanın başlatıldığı dizin
	tüm paketlere ilişkin dizinlerin kök dizinidir. Bu durumun da bazı ayrıntıları ve istisnaları vardır.
	
	- 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		
	}
}

