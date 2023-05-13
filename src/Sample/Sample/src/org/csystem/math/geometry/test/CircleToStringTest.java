package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Circle;

import java.util.Random;
import java.util.Scanner;

public class CircleToStringTest {
    private static void printCircle(Circle c)
    {
        System.out.println("Daire/çember bilgileri:");
        System.out.println(c.toString());
    }

    private static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        Circle c = new Circle();

        printCircle(c);

        while (count-- > 0) {
            double radius = random.nextDouble(-10, 10);

            System.out.println("--------------------------------------------------------------");
            System.out.printf("Üretilen yarıçap değeri:%f%n", radius);
            c.setRadius(radius);
            printCircle(c);
            System.out.println("--------------------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
