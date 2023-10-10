package Practice.BT3;

import DemoSortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class SapXepStringTheoThuTu {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
