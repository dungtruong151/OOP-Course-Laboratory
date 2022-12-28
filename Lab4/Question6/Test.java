package Lab4.Question6;

import javax.swing.JFrame;

public class Test {
    public static void main(String[] args) {
        BarChart dialog = new BarChart();
        dialog.display();
        
        BarChart panel = new BarChart();
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}