public class Intro {
    public static void main (String[] args ) {
        Student s1 = new Student();
        Bike bike = new Bike();
        bike.name = "FZ";
        bike.model = "Abc";
        bike.makeyear = 2009;
        System.out.println ("Bike: " + bike.name);
        System.out.println ("Model: " + bike.model);
        System.out.println ("Makeyear: " + bike.makeyear);
    }

}
class Bike {
    String name;
    String model;
    int makeyear;
}
class Student {
    String name;
    String address;
    int age;
}
