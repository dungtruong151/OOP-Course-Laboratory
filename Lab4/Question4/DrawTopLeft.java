package Lab4.Question4;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawTopLeft extends JPanel{
    public DrawTopLeft(){
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth()/15;
        int height = getHeight()/15;
        super.paintComponent(g);

        try {
            g.setColor(Color.BLACK);
            int i=0;
            while (i<15) {
                g.drawLine(0, height*i, width*(i+1), height*15);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
