package Lab4.Question2;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawFourLines extends JPanel {

    public DrawFourLines(){
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        super.paintComponent(g);

        try {
            g.setColor(Color.BLACK);
            g.drawLine(0, 0, width, height);
            g.drawLine(0, height, width, 0);
            g.drawLine(0, height / 2, width, height / 2);
            g.drawLine(width / 2, 0, width / 2, height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
