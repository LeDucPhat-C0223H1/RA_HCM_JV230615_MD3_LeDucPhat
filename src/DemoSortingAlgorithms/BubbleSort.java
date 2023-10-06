package DemoSortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] list = {1,2,4,5,8,10,9};
        String[] list2 = {"Phúc", "Lộc", "À"};

        Person[] person = {
                new Person("Hoàng", 18),
                new Person("Anh", 20),
                new Person("Gia", 22),
                new Person("Lai", 24)
        };

        bubbleSort(person);
        System.out.println(Arrays.toString(person));
    }

    public static <T extends Comparable<T>> void bubbleSort (T[] array){
        boolean check = true;
        for (int i = 0; i < array.length-1 && check; i++) {
            check = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    check = true;
                }
            }
        }

    }
}
