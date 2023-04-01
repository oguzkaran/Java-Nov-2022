/*----------------------------------------------------------
	FILE			: ArrayUtil.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 01.04.2023

	Utility class for array operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package org.csystem.util.array;

public class ArrayUtil {
    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }
}
