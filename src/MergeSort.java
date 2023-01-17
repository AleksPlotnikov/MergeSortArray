public class MergeSort {
    public static int[] sort() {

        ReaderFile readerFile = new ReaderFile();

        int[] array1 = readerFile.readFile1();
        int[] array2 = readerFile.readFile2();
        int[] arrayResult = new int[array1.length + array2.length];

        int i = 0, j = 0;
        int k;
        for (k = 0; k < arrayResult.length; k++) {
                    if (i > array1.length - 1) {
                    int a = array2[j];
                    arrayResult[k] = a;
                    j++;
                }
                    else {
                    if (j > array2.length - 1) {
                    int a = array1[i];
                    arrayResult[k] = a;
                    i++;
                }
                    else if (array1[i] < array2[j]) {
                    int a = array1[i];
                    arrayResult[k] = a;
                    i++;
                }
                    else {
                    int b = array2[j];
                    arrayResult[k] = b;
                    j++;

                }

            }
        }
        return arrayResult;
    }
}




