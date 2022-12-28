package Lab3.Question1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyShape[] shapes = new MyShape[5];
        Scanner input = new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("Select a shape "+(i+1)+" to draw (Line: 1, Oval: 2, Rectangle: 3): ");
            int shape = input.nextInt();
            if (shape==1){
                System.out.println("Enter the length of the line: ");
                int length = input.nextInt();
                shapes[i] = new MyLine(length);
            }
            else if (shape==2){
                System.out.println("Enter the height of the oval: ");
                int height = input.nextInt();
                System.out.println("Enter the width of the oval: ");
                int width = input.nextInt();
                shapes[i] = new MyOval(height, width);
            }
            else if (shape==3){
                System.out.println("Enter the height of the rectangle: ");
                int height = input.nextInt();
                System.out.println("Enter the width of the rectangle: ");
                int width = input.nextInt();
                shapes[i] = new MyRectangle(height, width);
            }
            else{
                System.out.println("Invalid shape");
            }
        }

        System.out.println();
        for (int i=0;i<5;i++) {
            if (shapes[i] instanceof MyOval){
                System.out.println("The shape "+(i+1)+" is Oval with height " + ((MyOval)shapes[i]).getHeight()+ " and width " + ((MyOval)shapes[i]).getWidth());
            }
            if (shapes[i] instanceof MyRectangle){
                System.out.println("The shape "+(i+1)+" is Rectangle with height " + ((MyRectangle)shapes[i]).getHeight()+ " and width " + ((MyRectangle)shapes[i]).getWidth());
            }
            if (shapes[i] instanceof MyLine){
                System.out.println("The shape "+(i+1)+" is Line with length " + ((MyLine)shapes[i]).getLength());
            }
            if (shapes[i] instanceof MyBoundedShape) {
                System.out.println("Area: " + ((MyBoundedShape)shapes[i]).getArea());
            }
            System.out.println("Drawing the shape "+(i+1)+" :");
            shapes[i].Draw();
            System.out.println();
        }
    }
}
