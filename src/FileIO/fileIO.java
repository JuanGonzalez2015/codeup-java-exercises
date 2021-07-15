package FileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class fileIO {
    public static void main(String[] args) {
        System.out.println(getFilePath("test.txt").toAbsolutePath());

    }

    public static Path getFilePath(String filename){
        return Paths.get(filename);
    }
}
