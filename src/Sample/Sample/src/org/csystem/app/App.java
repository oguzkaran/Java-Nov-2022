/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir matrisin devriğini (transpose) döndüren transposed isimli metodu
	MatrixUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
		- Metot matris olup olmama kontrolü yapmayacaktır
		- Matrisin devriği satırların sütun, sütunların da satır olduğu matristir
			1 2 3
			4 5 6
		matrisinin devriği
			1 4
			2 5
			3 6
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