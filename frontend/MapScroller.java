package frontend;

import javax.swing.*;


public class MapScroller {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Test");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });   
        
    }

    public MapScroller() {

    }
}