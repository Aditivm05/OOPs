class Student{
    int id;
    int rollno;
    String name;
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id=100;
        s1.rollno=01;
        s1.name="Aditi";
        System.out.println(s1.id + " " + s1.rollno + " " + s1.name) ;
    }

}
