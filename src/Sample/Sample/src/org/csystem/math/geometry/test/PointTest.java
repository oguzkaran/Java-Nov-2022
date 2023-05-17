package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Point;

public class PointTest {
    private static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Tohum değerini giriniz:");
        long seed = Long.parseLong(kb.nextLine());

        java.util.Random r = new java.util.Random(seed);

        System.out.print("Minimum değeri giriniz:");
        double min = Double.parseDouble(kb.nextLine());

        System.out.print("Sınır değeri giriniz:");
        double bound = Double.parseDouble(kb.nextLine());


        for (; ; ) {
            System.out.print("Kaç tane nokta üretmek istersiniz?");
            int count = Integer.parseInt(kb.nextLine());
            if (count <= 0)
                break;

            System.out.println("-------------------------------");
            while (count-- > 0) {
                Point p = RandomPointGenerator.createRandomPoint(r, min, bound);

                System.out.printf("(%f, %f)%n", p.getX(), p.getY());
            }

            System.out.println("-------------------------------");
        }

    }

    public static void main(String[] args)
    {
        run();
    }
}