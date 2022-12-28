package Lab3.Question1;

public class MyLine extends MyShape {
    private int length;

    public MyLine(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public void Draw(){
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
