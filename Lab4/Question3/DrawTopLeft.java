package Lab4.Question3;

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
            for (int i=0;i<15;i++){
                g.drawLine(0, 0, width*i, height*(15-i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
