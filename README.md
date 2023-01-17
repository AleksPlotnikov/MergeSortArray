# MergeSortArray
Тестовая задача.
Программа принимает на вход два файла с целочисленными значениями, выполняет сортировку слиянием и записывает их в результирующий файл.

Описание реализации:

Класс ReaderFile принимает на вход два файла "file1" и "file2". Происходит это в двух разных методах: readFile1() и readFile2().
Считывание происходит по средствам Stream Api.
После создается два массива, в которых мы сохраняем информацию из считанных файлов. (Для удобства они названы file1 и file2).

Класс MergeSort принимает на вход два массива, путем передачи через методы readFile1() и readFile2().
В классе создается результирующий массив arrayResult. Созданный таким образом, чтобы в него можно было положить массивы
любой длинны, и они не вышли за его пределы.
В классе MergeSort реализован алгоритм сортировки слияния, результат которого кладется в массив arrayResult.

Класс WriterFile принимает на вход результирующий массив через метод sort(), что был в классе MergeSort.
Дальше создается массив array3, которому мы присваиваем значение полученного arrayResult.
Итерируемся и указываем путь, куда записываем результирующий файл "file3".

В классе Main вызываем метод writer() из класса WriterFile. И при компиляции программы происходит запись в "file3".






Версия Java 17.2
Сборка Intellij IDEA.