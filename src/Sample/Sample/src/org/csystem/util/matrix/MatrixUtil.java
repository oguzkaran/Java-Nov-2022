/*----------------------------------------------------------
	FILE			: MatrixUtil.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 30.04.2023

	Utility class for matrix operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static void fillRandomMatrix(Random random, int [][] a, int min, int bound)
    {
        for (int i = 0; i < a.length; ++i)
            ArrayUtil.fillRandomArray(random, a[i], min, bound);
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }

    public static int [][] getRandomMatrix(Random random, int m, int n, int min, int bound)
    {
        int [][] a = new int[m][n];

        fillRandomMatrix(random, a, min, bound);

        return a;
    }

    public static int [][] getRandomSquareMatrix(Random random, int n, int min, int bound)
    {
        return getRandomMatrix(random, n, n, min, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[0].length != a[i].length)
                return false;

        return true;
    }


    public static int [] [] transposed(int [][] a)
    {
        //TODO:
    }

}
