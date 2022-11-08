package Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Đức Anh");
        student1.setClasses("C09");
        System.out.println(student1.getName()+", " + student1.getClasses());
    }
}
