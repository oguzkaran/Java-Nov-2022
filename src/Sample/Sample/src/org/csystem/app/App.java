/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir matrisin tüm elemanlarını ikinci parametresi ile aldığı intü
	türden sayı ile toplayan addMatrixWithValue metodunu yazınız ve aşağıdaki kod ile test ediniz
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