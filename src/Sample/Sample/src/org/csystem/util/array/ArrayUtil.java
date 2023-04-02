/*----------------------------------------------------------
	FILE			: ArrayUtil.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 02.04.2023

	Utility class for array operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {

    public static void fillRandomArray(Random random, int [] a, int min, int bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(min, bound);
    }

    public static int [] getRandomArray(Random random, int count, int min, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }

    public static void reverse(int [] a)
    {
        int left = 0;
        int right = a.length - 1;

        while (left < right)
            swap(a, left++, right--);
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static long sumLong(int [] a)
    {
        long total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(char [] a, int i, int k)
    {
        char temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }
}
