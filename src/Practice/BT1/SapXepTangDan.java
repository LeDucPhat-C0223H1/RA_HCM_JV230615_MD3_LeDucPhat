package Practice.BT1;

import DemoSortingAlgorithms.BubbleSort;
import DemoSortingAlgorithms.InsertionSort;
import DemoSortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class SapXepTangDan {
    public static void main(String[] args) {
        //Sắp xếp tăng dần kiểu nổi bọt
        System.out.println("Mảng thứ 1 ban đầu:");
        Integer[] array1 = getArr();
        System.out.println(Arrays.toString(array1));
        System.out.println("Sắp xếp tăng dần kiểu nổi bọt");
        BubbleSort.bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println();
        /*
        *
        * */
        //Sắp xếp tăng dần kiểu chọn
        System.out.println("Mảng thứ 2 ban đầu:");
        Integer[] array2 = getArr();
        System.out.println(Arrays.toString(array2));
        System.out.println("Sắp xếp tăng dần kiểu chọn");
        SelectionSort.selectionSort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println();
        /*
         *
         * */
        //Sắp xếp tăng dần kiểu chọn
        System.out.println("Mảng thứ 3 ban đầu:");
        Integer[] array3 = getArr();
        System.out.println(Arrays.toString(array3));
        System.out.println("Sắp xếp tăng dần kiểu chèn");
        InsertionSort.intertionSort(array3);
        System.out.println(Arrays.toString(array3));
        System.out.println();
    }

    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
