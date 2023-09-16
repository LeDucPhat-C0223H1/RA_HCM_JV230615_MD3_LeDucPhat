package session04_prepare;

public class Th5_GiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + "\t");
        }

        int result = minValueOfArr(arr);
        System.out.println("\nThe smallest element in the array is: " + result);
    }

    public static int minValueOfArr(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
