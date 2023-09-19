package session06_prepare;

public class Student {
    private int studentID;
    private String studentName;
    private String gender;
    private String className;

    private int age;
    private String address;

    public Student(int studentID, String studentName, String gender, String className, int age, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String isGender() {
        return gender;
    }

    public void setSex(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("mã số sinh viên là: " + studentID);
        System.out.println("tên sinh viên là: " + studentName);
        System.out.println("giới tình sinh viên: " + gender);
        System.out.println("Lớp học: " + className);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }

    public static void main(String[] args) {
        Student student1 = new Student(113, "ben", "Nam", "JV230615", 23, "69TQD");
        student1.display();
    }
}
