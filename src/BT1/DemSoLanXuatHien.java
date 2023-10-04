package BT1;

import java.util.HashMap;
import java.util.Map;

public class DemSoLanXuatHien {
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
        System.out.println(frequencyMap);

//        System.out.println("Số lần xuất hiện của mỗi phần tử:");
//        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
//            String element = entry.getKey();
//            int count = entry.getValue();
//            System.out.println(element + ": " + count);
//        }


    }
}
