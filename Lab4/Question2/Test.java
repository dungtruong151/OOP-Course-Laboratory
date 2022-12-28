package Lab4.Question2;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {
        DrawFourLines drawFourLines = new DrawFourLines();
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawFourLines);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
