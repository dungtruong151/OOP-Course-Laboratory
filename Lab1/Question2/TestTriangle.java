public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        System.out.print(t1.verify());
        Triangle t2 = new Triangle(3, 3, 3);
        System.out.print(t2.verify());
        Triangle t3 = new Triangle(3, 3, 4);
        System.out.print(t3.verify());
        Triangle t4 = new Triangle(3, 4, 6);
        System.out.print(t4.verify());
    }
}
