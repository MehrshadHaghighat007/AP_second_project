package DrawModels;

import javax.swing.*;
import java.awt.*;

public class DrawBall extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 153, 153));
        g.fillOval();
    }
}
