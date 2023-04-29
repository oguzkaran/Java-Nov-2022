/*----------------------------------------------------------------------------------------------------------------------
	Anımsanacağı gibi, T bir tür ismi olmak üzere T [] a ifadesi a'nın gösterdiği dizinin herbir elemanının T türden olduğu
	anlamına gelir. Örneğin int [][] a ifadesi a'nın gösterdiği dizinin her bir elemanının int türden bir dizi referansı
	olduğu anlamına gelir. Bu durumda mantıksal olarak bu referansın gösterdiği dizi bir "dizi dizisidir (array of arrays)".

	Dizi dizisi yaratılırken kullanılan new operatörüne ilişkin ifadede tür isminden sonra referans bildiriminmde
	kullanılan [] kadar [] kullanılmalıdır. Bu köşeli parantezlerden ilki ana dizinin uzunluğudur., boş bırakılamaz.
	int [][] türden bir dizinin herbir elemanı olan dizi referenslarının gösterdiği dizilerin herbiri eşit uzunluktaysa
	bu durumda bu dizi mantıksal olarak int türden değerler içeren matrisi temsil eder. Bu anlamda bu diziye kısaca
	matris de denebilir. Bu durumda ana dizinin uzunluğu satır sayısını, içerisinde tuttuğu dizi referanslarının
	gösterdiği dizilerin uzunluğu sütun sayısını temsil eder. Dizi içerisindeki dizi referanslarının göstediği dizilerin
	bir tanesinin bile eleman sayısı diğerlerden farklı ise bu durumda artık matris belirtmez.
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [][] a;

		a = new int[5][];
	}
}