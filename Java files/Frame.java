import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame extends JFrame {
  
  private BufferedImage img;
  private JFrame frame;
  
  public Frame () throws IOException{
    frame = buildFrame();
    
    img = ImageIO.read(new File("uw-campus-printable-09191024_1.jpg"));
    
  }
  
  public void drawPoint(int x, int y) {
     JPanel pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
      	super.paintComponent(g);
         g.setColor(Color.red);
         g.drawImage(img, 0, 0, null);
         g.fillOval(x, y, 10, 10);
    	}
    };
    frame.add(pane);
  }
  
  private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("UW Map");
        frame.setSize(1050, 750);
        frame.setVisible(true);
        return frame;
  }
  
  
}