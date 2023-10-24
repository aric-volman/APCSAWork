// The AWT Graphics Program
// This is the student starting version of Graphics Lab 01.
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Lab2 extends JPanel
{
	public void paint(Graphics g)
	{
    	// DRAW CUBE
		this.Cube(g);


    	// DRAW SPHERE




    	// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE




    	// DRAW APCS




    	// DRAW PACMEN FLOWER



	}

	public static void main(String[] arg) {
   	 Lab2 l = new Lab2();
	}
    
	public Lab2() {
   	 JFrame j = new JFrame("Method Calls");
   	 j.setSize(new Dimension(800,600));
   	 j.add(this);
   	 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	 j.setVisible(true);
 	}
	
	public void Cube(Graphics g) {
		g.drawRect(100, 100, 200, 200);
		g.drawRect(150, 150, 200, 200);
		g.drawLine(400, 100, 200, 200);
	}
}
