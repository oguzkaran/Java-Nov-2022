/*----------------------------------------------------------
	FILE			: Console.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 15.07.2023

	Utility class for standard input and standard output operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB = new Scanner(System.in);

    private Console()
    {
    }

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String message)
    {
        return readInt(message, "");
    }

    public static int readInt(String message, String errorMessage)
    {
        while (true) {
            try {
                System.out.print(message);

                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorMessage);
            }
        }
    }

    public static double readDouble()
    {
        return readDouble("");
    }

    public static double readDouble(String message)
    {
        return readDouble(message, "");
    }

    public static double readDouble(String message, String errorMessage)
    {
        while (true) {
            try {
                System.out.print(message);

                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorMessage);
            }
        }
    }

    public static void write(Object arg)
    {
        write("%s", arg);
    }

    public static void write(String format, Object...args)
    {
        System.out.printf(format, args);
    }

    public static void writeLine()
    {
        System.out.println();
    }

    public static void writeLine(String format, Object...args)
    {
        write(format + "\n", args);
    }
    //...
}
