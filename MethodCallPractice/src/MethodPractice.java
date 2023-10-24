import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics g) {
		
		g.setColor(new Color(255, 203, 76));
		g.fillOval(0, 0, 490, 490);
		
		//colors
		//change color tool
		g.setColor(new Color(65, 25, 0));
		
		// Summarize how the method works
		g.fillOval(100, 100, 75, 75);
		g.fillOval(310, 100, 75, 75);
		
		// Glasses
		
		g.fillRect(75, 80, 350, 10);
		g.fillRect(75, 180, 350, 10);
		
		g.fillRect(70, 80, 10, 110);
		g.fillRect(200, 80, 10, 110);
		g.fillRect(290, 80, 10, 110);
		g.fillRect(420, 80, 10, 110);
		
		// Sides of glasses
		g.fillRect(40, 100, 50, 10);
		g.fillRect(400, 100, 50, 10);
		
		// Hover over the method to get a Javadoc comment
		// This says that 1st arg is x, 2nd is y
		// 3rd is width, 4th is height
		// The order matters in passing in the parameters
		// The parameters are separated
		
		// This makes a rectangle at 0, 0
		// That is 50 high, 50 wide
		// g.fillRect(0, 0, 50, 50);
		// Params 1 + 2 are x and y
		// Params 3 + 4 are w and h
		
		// Mouth
		g.setColor(new Color(255, 0, 0));
		g.fillArc(100, 275, 300, 100, 10, 360);
		g.setColor(new Color(0, 0, 0));
		g.fillArc(100, 300, 300, 50, 10, 360);
		g.setColor(new Color(255, 255, 255));
		g.fillRect(100, 300, 300, 20);
		g.setColor(new Color(255, 255, 255));
		g.fillRect(100, 330, 300, 30);
		
		// Teeth
		for (int i = 100; i < 450; i += 50) {
			g.setColor(new Color(0, 0, 0));
			g.fillRect(i, 300, 10, 60);
		}
		
		g.setColor(new Color(255, 160, 40));
		// Nose
		g.fillOval(220, 180, 50, 100);
		g.fillOval(195, 230, 100, 50);
	
	}

	public static void main(String[] arg) {
		MethodPractice m = new MethodPractice();
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.add(this);
		f.setVisible(true);

	}
}
