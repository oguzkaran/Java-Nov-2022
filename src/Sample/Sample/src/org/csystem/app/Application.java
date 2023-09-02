package org.csystem.app;

import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.*;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

public class Application {
    public static void run(String[] args)
    {
        checkLengthEquals(args.length, 2, "Wrong number of arguments!...");

        try {
            Files.move(Path.of(args[0]), Path.of(args[1]));
            Console.writeLine("'%s' moved successfully", args[0]);
        }
        catch (DirectoryNotEmptyException ignore) {
            Console.writeErrLine("'%s' directory not empty", args[1]);
        }
        catch (FileAlreadyExistsException ignore) {
            Console.writeErrLine("'%s' already exists", args[1]);
        }
        catch (NoSuchFileException ignore) {
            Console.writeErrLine("'%s' not exist", args[0]);
        }
        catch (IOException ignore) {
            Console.writeErrLine("I/O problem occurs!...");
        }
        catch (InvalidPathException ex) {
            Console.writeErrLine("'%s' is invalid path", ex.getInput());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
