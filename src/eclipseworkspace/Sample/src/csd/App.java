/*----------------------------------------------------------------------------------------------------------------------
 	Yalnızca sabitlerden ve operatörlerden oluşan yani içerisinde değişken olmayan ifadelere "sabit ifadesi (constant expression)"
 	denir. Bu anlamda tek başına bir sabit de sabit ifadesidir.
 	
 	Anahtar Notlar: İleride aslında sabit ifadesi olarak kullanılabilen değişkenler de göreceğiz. Bu tarz değişkenler de 
 	bir ifade içerisinde sabit olarak ele alınırlar
 	
 	Derleyiciler sabit ifadelerinin değerlerini hesaplayarak sonucu "byte code"'a yazarlar. Bu optimizasyona 
 	"constant folding optimization" denir. Bu sebeple aşağıdaki örnekteki çarpma sonucu arakoda yazılır. Örnekteki
 	bazı detaylar ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		long divider = 1000L * 60 * 60 * 24 * 365; //byte code -> 31536000000
		
		System.out.println(divider);
	}
}

