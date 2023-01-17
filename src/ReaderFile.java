import java.io.*;
import java.util.Scanner;
public class Reader {
    int[] file1;
    int[] file2;
    public int[] readFile1() {

        try {
            try {
                FileReader fileReader = new FileReader("src/file1.txt");
                



                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }





        return file1;
    }

        public int[] readFile2() {


            try {
                Scanner scanner2 = new Scanner(new File("src/file2.txt"));
                while (scanner2.hasNextInt()) {
                    file2 = new int[scanner2.nextInt()];

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return file2;


            }
        }










