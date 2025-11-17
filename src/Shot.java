/** 
 * Shot.java
 * Author: Ari Khan
 * Version: 1.0.0
 * Date: 2025-11-16
 * Description: A class describing shot elements fired by the spacecraft.
*/ 

import java.awt.Color;
import java.awt.Graphics;

public class Shot extends Element {
    public Shot(int x, int y) {
        super(x, y, 4, 12, 15);
    }

    @Override
    public void update() {
        y -= speed;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
}
