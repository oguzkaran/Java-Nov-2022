/*----------------------------------------------------------------------------------------------------------------------
	Metot ne işe yarar? Ya da başka bvir deyişle bir problemin çözümünde neden metotlar yazalım? Bu sorular genel 
	olarak aşağıdaki durumlar ile özetlenebilir:
	
	- Bir işi çok fazla yerde yapmak kod tekrarına yol açar. Yazılım geliştirmede temel prensip "zorunlu olmadıkça 
	kod tekrarı yapılmamalıdır (do not repeat yourself)" şeklindedir. Bu durumda programcı önreğin bir metot yazar
	ve ilgili yerlerde çağırır.
	
	- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde gerçekleştirimişse (implementation),
	bu durumda programcı problemde algoritmasında bir değişiklik yapmak isterse veya bir hata olduğunu anlayıp düzeltmek
	isterse her yerde bu değişiklikleri yapmak zorunda kalır. Bu da çoğu zaman zor olabilir. Halbuki programcı bu problemin
	çözümü için bir metot yazarsa değişikliği daha kolay yapabilir
	
	- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde gerçekleştirimişse (implementation),
	bu durumda kodun okunalirliği/algılanabilirliği de azalabilir. Yani bu durumda metot çağırark kodun okunabilirliği/algılanabilirliği
	artırılmış olur
	
	- Metot yazıldığında başka projelere taşınarak da kullanılabilir (code re-usability)
	
	- Metodu yçağıran programcı metodun nasıl yazıldığına ilişkin detayları bilmek zorunda değildir. Çünkü metodun
	çağrıldığı noktada metodun nasıl yazıldığının önemi yoktur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result = NumberUtil.multiply(a, b);
		
		System.out.println(result);
		
		//... (Burada a veya b değişkenlerinin değişmiyor)
		
		System.out.println(result);
	}
}


class NumberUtil {
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}

	//..
}