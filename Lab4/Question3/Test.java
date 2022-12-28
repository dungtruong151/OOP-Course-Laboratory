package Lab4.Question3;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {
        //DrawTopLeft panel = new DrawTopLeft();
        DrawAllCorners panel = new DrawAllCorners();
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
