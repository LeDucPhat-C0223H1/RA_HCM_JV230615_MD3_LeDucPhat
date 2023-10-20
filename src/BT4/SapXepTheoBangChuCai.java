package BT4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXepTheoBangChuCai {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Ben's Laptop\\Desktop\\RA_HCM_JV230615_MD3_LeDucPhat\\src\\BT4\\data_Bt4.txt";
        System.out.println(sortWords(filePath));
    }

    public  static List<String> sortWords(String filePath) {
        List<String> words = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s");

                Collections.addAll(words, lineWords);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(words);

        return words;
    }
}
