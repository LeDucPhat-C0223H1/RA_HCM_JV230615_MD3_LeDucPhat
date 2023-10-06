package Practice.BT1;

import DemoSortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class SapXepTangDan {
    public static void main(String[] args) {
        System.out.println("Mảng gốc ban đầu:");
        Integer[] array1 = getArr();
        System.out.println(Arrays.toString(array1));
        System.out.println();

        //Sắp xếp tăng dần kiểu nổi bọt
        System.out.println("Sắp xếp tăng dần kiểu nổi bọt");
        BubbleSort.bubbleSort(array1);
        System.out.printf(Arrays.toString(array1));
    }

    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
