package org.csystem.app;

import org.csystem.util.console.Console;

public class Application {
    public static void run(String[] args)
    {
        Console.writeLine(System.getProperty("user.dir"));
        Console.writeLine(System.getProperty("user.home"));
        Console.writeLine(System.getProperty("user.name"));
        Console.writeLine(System.getProperty("os.arch"));
        Console.writeLine(System.getProperty("os.name"));
        Console.writeLine(System.getProperty("os.version"));
        Console.writeLine(System.getProperty("java.version"));
        Console.writeLine(System.getProperty("java.vendor"));
        Console.writeLine(System.getProperty("java.vendor.url"));
        Console.writeLine(System.getProperty("line.separator").equals("\r\n") ? "Windows" : "Not windows");
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
