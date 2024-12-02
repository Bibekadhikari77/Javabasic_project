public class  MainClass {
    public static void main(String[] args) {
        TheStudent student = new TheStudent("john",
        18, "male", "asdfgh",8765432, "asdfguihl@gmail","fdsa", "fdsa");
        System.out.println(student.name +" "+ student.age +" "+ student.gender +" "+ student.address +" "+ student.phone);

    }
}
class TheStudent {
    String name;
    int age;
    String gender;
    String address;
    int phone;
    String email;
    String FatherName;
    String MotherName;

    public TheStudent(String name, int age, String gender, String address, int phone, String email, String FatherName, String MotherName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.FatherName = FatherName;
        this.MotherName = MotherName;

    }
}
