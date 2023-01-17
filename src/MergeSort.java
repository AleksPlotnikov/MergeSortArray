public class MergeSort {

    public int[] a1;
    public int[] a2;
    public int[] writeFile;

    public static int[] sort() {
        Reader reader = new Reader();

        int[] a1 = Reader.readFile1();
        int[] a2 = Reader.readFile2();
        int[] writeFile = new int[reader.readFile2().length + reader.readFile2().length];

        int i = 0, j = 0;
        for (int k = 0; k < writeFile.length; k++) {
            if (i > a1.length - 1) {
                int a = a2[j];
                writeFile[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                writeFile[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                writeFile[k] = a;
                i++;
            } else {
                int b = a2[j];
                writeFile[k] = b;
                j++;
            }
            System.out.println(writeFile[k]);
        }


        return null;
    }
}

