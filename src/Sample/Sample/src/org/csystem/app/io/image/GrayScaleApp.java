package org.csystem.app.io.image;

import org.csystem.util.console.Console;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

public class GrayScaleApp {
    public static void run(String [] args)
    {
        checkLengthEquals(args.length, 1, "Wrong number of arguments!...");

        try {
            BufferedImage bufferedImage = ImageIO.read(new File(args[0]));

            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();

            Console.writeLine("%d * %d", width, height);

            for (int i = 0; i < width; ++i)
                for (int k = 0; k < height; ++k) {
                    Color c = new Color(bufferedImage.getRGB(i, k));
                    int avg = (int)Math.floor((c.getRed() + c.getGreen() + c.getBlue()) / 3.);

                    bufferedImage.setRGB(i, k, new Color(avg, avg, avg).getRGB());
                }

            ImageIO.write(bufferedImage, "png", new File("gs" + args[0]));
        }
        catch (Throwable ex) {
            Console.writeErrLine("Problem occurred:%s", ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
