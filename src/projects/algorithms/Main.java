package projects.algorithms;

public class Main {
    public static void main(String[] args) {
        int maxSize = 1000; // Размер массива
        QuickSort arr = new QuickSort(maxSize); // Создание массива
        for(int j=0; j<maxSize; j++) // Заполнение массива
        { // случайными числами
            int n = (int)(java.lang.Math.random()*199);
            arr.insert(n);
        }
        arr.printArray(); // Вывод несортированного массива
        arr.quickSort();
        arr.printArray();
    }
}
