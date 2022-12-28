public class Rectangle {
    public double width;
    public double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0 || height < 0) {
            System.out.print("Width and height must be positive\n");
            if (width < 0) {
                this.width = 1;
            }
            if (height < 0) {
                this.height = 1;
            }
        }
    }

    public void display() {
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
