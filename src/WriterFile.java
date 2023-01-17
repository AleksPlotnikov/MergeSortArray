import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Paths.get;

public class WriterFile {

    public void writer() {
        MergeSort mergeSort = new MergeSort();
        try {
            FileWriter fileWriter = new FileWriter("src/file3.txt");
            int[] a3 = MergeSort.sort();
                for(int n : a3) {
                    fileWriter.write(String.valueOf(n + "\n"));

                }

                fileWriter.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
