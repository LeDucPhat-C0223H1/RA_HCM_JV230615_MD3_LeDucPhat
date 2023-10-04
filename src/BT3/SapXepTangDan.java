package BT3;

import java.util.*;

public class SapXepTangDan {
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
        Set<Map.Entry<String, Integer>> entrySet = frequencyMap.entrySet();
        List<Map.Entry<String, Integer>> arrResult = new ArrayList<>(entrySet);
        Collections.sort(arrResult,Comparator.comparingInt(Map.Entry::getValue));
        System.out.println(arrResult);
    }
}
