/*----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

class App {
	public static void main(String [] args)
	{
		int [] a = {1, 2, 3, 4, 5};

		ArrayUtil.print(a);
		ArrayUtil.swap(a, 1, 3);
		ArrayUtil.print(a);
	}
}




