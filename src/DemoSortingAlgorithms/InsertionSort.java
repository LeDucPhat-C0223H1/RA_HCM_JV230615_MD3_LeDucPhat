package DemoSortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] list = {1,2,4,5,8,10,9};

        intertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static<T extends Comparable<T>>  void intertionSort (T[] array){
//        for (int i = 1; i < array.length ; i++) {
//            T valueApproval = array[i];
//            int indexApproval = i;
//
//            for(int j = i-1; j >=0; j--){
//                if(valueApproval.compareTo(array[j]) > 0) {
//                    array[j+1] = array[j];
//                    indexApproval = j;
//                }
//            }
//            array[indexApproval] = valueApproval;
//        }

        // Tối ưu code
        for (int i = 1; i < array.length ; i++) {
            T valueApproval = array[i];
            int j ;

            for(j = i-1; j >=0 && (valueApproval.compareTo(array[j]) < 0); j--){
                array[j+1] = array[j];
            }
            array[j+1] = valueApproval;
        }
    }
}
