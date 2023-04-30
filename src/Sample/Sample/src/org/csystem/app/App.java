/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir dizi dizisi referansının bir matris olup olmadığını test eden
	isMatrix metodunu MatrixUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

class App {
	public static void main(String [] args)
	{
		int [][] a = {{1, 3, 4}, {3, 5, 8}};

		ArrayUtil.print(2, a);
	}
}