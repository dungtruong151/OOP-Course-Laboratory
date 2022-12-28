package Lab3.Question3;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("John", "123 Main St");
        System.out.println(p1);
        Student s1 = new Student("Mary", "456 Main St", "Computer Science", 2019, 10000);
        System.out.println(s1);
        Staff st1 = new Staff("Bob", "789 Main St", "Computer Science", 10000);
        System.out.println(st1);
    }
}
