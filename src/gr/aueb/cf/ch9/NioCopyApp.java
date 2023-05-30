package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        long start, end;
        byte[] imageBytes;

        start = System.currentTimeMillis();
        Path sourcePath = Paths.get("c:/tmp/v1.jpg");
        Path targetPath = Paths.get("c:/tmp/v1out.jpg");

        try {
            imageBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }
}
