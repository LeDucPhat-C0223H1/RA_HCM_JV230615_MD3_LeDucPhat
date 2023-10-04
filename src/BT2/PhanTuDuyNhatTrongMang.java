package BT2;

import java.util.*;

public class PhanTuDuyNhatTrongMang {
    public static void main(String[] args) {
        //Bước 1: Khai báo mảng phần từ
        String[] arr = {"A", "B", "A", "C", "B", "A"};

        //Bước 2: Tạo HasMap để lưu trữ số lần xuất hiện của từng phần tử
        Map<String, Integer> frequencyMap = new HashMap<>();


        //Bước 3: Duyệt qua từng phần tử trong mảng và cập nhật HasMap
        for (String element : arr) {
            // kiểm tra element đã tồn tại chưa
            if (frequencyMap.containsKey(element)){
                int count = frequencyMap.get(element);
                frequencyMap.put(element,count + 1);
            }else {
                frequencyMap.put(element, 1);
            }
        }

        // Bước 4: Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử
        List<String> arrResult = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: frequencyMap.entrySet()) {
            // kiểm tra entry có value = 1
            if(entry.getValue() == 1){
                arrResult.add(entry.getKey());
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arrResult);
    }
}
