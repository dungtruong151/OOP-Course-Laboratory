package Lab4.Question5;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {
        //DrawLineSpirals panel = new DrawLineSpirals();
        DrawArcSpirals panel = new DrawArcSpirals();
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
