package org.csystem.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lectureName;
    public int [][] grades;
    public double average;
    public double [] averages;
    public int [] minGrades;
    public int [] maxGrades;

    public Random random;

    public void fillGrades()
    {
        Scanner kb = new Scanner(System.in);
        System.out.printf("%s dersi için şube sayısını giriniz:", lectureName);
        grades = new int[Integer.parseInt(kb.nextLine())][];

        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d.şubenin öğrenci sayısını giriniz:", i + 1);
            grades[i] = ArrayUtil.getRandomArray(random, Integer.parseInt(kb.nextLine()), 0, 101);
        }

        averages = new double[grades.length];
        minGrades = new int[grades.length];
        maxGrades = new int[grades.length];
    }

    public void findAverages()
    {
        int numberOfAllStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < grades.length; ++i) {
            int total = ArrayUtil.sum(grades[i]);

            numberOfAllStudents += grades[i].length;
            totalGrades += total;
            averages[i] = (double)total / grades[i].length;
            minGrades[i] = ArrayUtil.min(grades[i]);
            maxGrades[i] = ArrayUtil.max(grades[i]);
        }

        average = (double)totalGrades / numberOfAllStudents;
    }

    public ExamSimulation(String name, Random r)
    {
        lectureName = name;
        random = r;
    }

    public void run()
    {
        fillGrades();
        findAverages();
    }

    public void displayGrades()
    {
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%s dersinin şubelere göre notları:%n", lectureName);
        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d.şube notları:", i + 1);
            ArrayUtil.print(grades[i]);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public void displayReport()
    {
        System.out.println("#########################################################################");
        displayGrades();
        int n = grades.length;

        for (int i = 0; i < n; ++i) {
            System.out.printf("%d.şube:%n", i + 1);
            System.out.printf("Not Ortalaması:%f%n", averages[i]);
            System.out.printf("En yüksek Not:%d%n", maxGrades[i]);
            System.out.printf("En düşük Not:%d%n", minGrades[i]);
        }
        System.out.printf("Okul Ortalaması:%f%n", average);
        System.out.println("#########################################################################");
    }
}

