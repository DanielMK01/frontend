/*import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Display {
    private JFrame frame;
    private int x;
    private int y;
    private int radius;
    private ArrayList<int[]> arraylist;
 
    public Display() throws IOException{
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("UW Map");
        frame.setSize(1050, 750);
        frame.setVisible(true);
        BufferedImage myImage = ImageIO.read(new File("uw-campus-printable-09191024_1.jpg"));
        frame.setRootPane(new ImagePanel(myImage));
    }    

    public void drawPointLayer() {
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
      	        super.paintComponent(g);
                g.setColor(Color.red);
                for (int i = 0; i < arraylist.size(); i++) {
                    x = arraylist.get(i)[0];
                    y = arraylist.get(i)[1];
                    radius = arraylist.get(i)[2];
                    g.fillOval(x, y, radius*2, radius*2);
                }
                
    	    }
        };
        frame.add(pane);
    }

    public void update() {
        MapSocket socket = new MapSocket();
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask(){
        public void run() {   
            socket.sendGetPopulationInfo();
            LinkedList<int[]> list = socket.getCoordinates();
            while(list.hasNext()) {
                arraylist.add(list.next());
                drawPointLayer();
            }
        }
      }, 1000, 5000);
    }

    class ImagePanel extends JComponent {
        private Image image;
        public ImagePanel(Image image) {
            this.image = image;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }
    
    

}*/