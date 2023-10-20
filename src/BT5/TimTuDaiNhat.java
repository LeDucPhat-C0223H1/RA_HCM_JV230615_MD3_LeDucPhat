package BT5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TimTuDaiNhat {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Ben's Laptop\\Desktop\\RA_HCM_JV230615_MD3_LeDucPhat\\src\\BT5\\data_Bt5.txt";

        System.out.println(wordMaxLength(filePath));
    }

    static String wordMaxLength(String filePath) {
        String word = "";
        int maxLength = 0;
        List<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String w : words) {
                    if (maxLength < w.length()) {
                        maxLength = w.length();
                        word = w;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return word;
    }
}
