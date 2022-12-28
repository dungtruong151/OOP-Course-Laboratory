package Lab3.Question2;

public class Test {
    public static void main(String[] args) {
        MyTriangle[] triangles = new MyTriangle[3];
        MyPoint p1 = new MyPoint(2, 0);
        MyPoint p2 = new MyPoint(2, 4);
        MyPoint p3 = new MyPoint(6, 4);

        triangles[0] = new MyTriangle(0, 0, 2, 4, 4, 4);
        triangles[1] = new MyTriangle(p1, p2, p3);

        triangles[2] = new MyTriangle(-4, 0, 0, 4, 6, 4);

        for (int i=0;i<3;i++) {
            System.out.println(triangles[i].toString());
            System.out.println("Triangle "+(i+1)+" has perimeter "+triangles[i].getPerimeter());
            System.out.println("Triangle "+(i+1)+" is "+triangles[i].getType());
            System.out.println();
        }
    }
}
