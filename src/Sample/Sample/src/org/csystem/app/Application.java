package org.csystem.app;

import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

public class Application {
    public static void run(String[] args)
    {
        checkLengthEquals(args.length, 1, "Wrong number of arguments!...");

        try {
            Path path = Path.of(args[0]);

            if (Files.exists(path))
                if (Files.isDirectory(path))
                    Console.writeLine("%s %s", path.getFileName(), Files.deleteIfExists(path) ? "deleted" : "not deleted");
                else
                    Console.writeLine("'%s' is not a directory!...", path.getFileName());
            else
                Console.writeErrLine("'%s' not exists!...", path.getFileName());
        }
        catch (DirectoryNotEmptyException ignore) {
            Console.writeErrLine("Directory not empty!...");
        }
        catch (IOException ignore) {
            Console.writeErrLine("I/O problem occurs!...");
        }
        catch (InvalidPathException ex) {
            Console.writeErrLine("'%s' is invalid", ex.getInput());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
