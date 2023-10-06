package DemoSortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] list = {3,10,6,5,9,2};
        Person[] person = {
                new Person("Cao", 32),
                new Person("Huyền", 20),
                new Person("Bảo", 22),
                new Person("Anh", 18)
        };
        selectionSort(person);
        System.out.println(Arrays.toString(person));
    }

    public static<T extends Comparable<T>> void selectionSort (T[] array){
        for (int i = 0; i < array.length ; i++) {
            T currentMin = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if(currentMin.compareTo(array[j]) > 0) {
                    currentMin = array[j];
                    indexMin = j;
                }
            }
            if(indexMin != i) {
                array[indexMin] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
