package StreanAPI.BT3;

import java.util.Arrays;
import java.util.List;

// StreanAPI
// Bài tập 3: Chuyển đổi một danh sách người thành danh sách tên (đối tượng Person có thuộc tính name).
public class ThayDoiDanhSach {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John"),
                new Person("Alcie"),
                new Person("Bob")
        );

        List<String> result = people.stream().map(Person::getName).toList();

        System.out.println(result);
    }
}
