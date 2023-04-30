/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden iki matrisin toplamından oluşan matrise geri dönen addMatrices
	metodunu MatrixUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
		- Metot matris kontrolü ve matrislerin toplanıp toplanmayacağı kontrolünü yapmayacaktır
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