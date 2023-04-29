package org.csystem.util.numeric.test;

import org.csystem.util.numeric.NumberUtil;

import java.util.Random;
import java.util.Scanner;

public class NumToTextTRTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        while (count-- > 0) {
            int val = random.nextInt(-999, 1000);

            System.out.printf("%d: %s%n", val, NumberUtil.numToText3DigitsTR(val));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
