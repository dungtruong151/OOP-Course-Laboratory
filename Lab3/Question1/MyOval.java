package Lab3.Question1;
import java.lang.Math;

public class MyOval extends MyBoundedShape{
    private int height;
    private int width;

    public MyOval(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return Math.PI * (height/2) * (width/2);
    }

    @Override
    public void Draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (Math.pow((i - height/2), 2)/Math.pow((height/2), 2) + Math.pow((j - width/2), 2)/Math.pow((width/2), 2) <= 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
