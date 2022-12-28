package Lab4.Question6;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class BarChart extends JPanel{
    private static int[] a = new int[6];

    public BarChart(){
    }

    public void display(){  
        for (int i=1;i<=5;i++){
            String s = JOptionPane.showInputDialog("Enter the length of the bar "+i);
            int x = Integer.parseInt(s);
            this.a[i] = x;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        int frame = height/13;

        super.paintComponent(g);

        try {
            g.setColor(Color.BLACK);
            g.fillRect(0, 2*frame, frame*this.a[1], frame);
            g.setColor(Color.RED);
            g.fillRect(0, 4*frame, frame*this.a[2], frame);
            g.setColor(Color.BLUE);
            g.fillRect(0, 6*frame, frame*this.a[3], frame);
            g.setColor(Color.GREEN);
            g.fillRect(0, 8*frame, frame*this.a[4], frame);
            g.setColor(Color.YELLOW);
            g.fillRect(0, 10*frame, frame*this.a[5], frame);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
