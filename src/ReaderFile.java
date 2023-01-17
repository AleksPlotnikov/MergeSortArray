import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderFile {
    int[] file1;
    int[] file2;
    public int[] readFile1() {

        try {
            file1 = Files.lines(Paths.get("src/file1.txt"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

                catch (IOException e) {
                throw new RuntimeException(e);
        }
        return file1;
    }
    public int[] readFile2() {

        try {
            file2 = Files.lines(Paths.get("src/file2.txt"))
                    .mapToInt((Integer::parseInt))
                    .toArray();
        }

                catch (IOException e) {
                throw new RuntimeException(e);
        }
        return file2;
    }
}








