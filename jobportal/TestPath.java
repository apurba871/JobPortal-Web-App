import java.nio.file.*;
import java.io.*;

public class TestPath {
    public static void main(String[] args) {
        try {
            String uploadDir = "photos/candidate/1";
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }
            String filename = "Art Abyss - An Art Community.png";
            Path path = uploadPath.resolve(filename);
            System.out.println(path.toAbsolutePath());
            Files.createFile(path);
            System.out.println("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
