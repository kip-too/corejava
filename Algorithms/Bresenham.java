/*package Algorithms.Linedrawingalgos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Bresenham {
    public static void main(String[] args){

    }
    private static void run(){
        JFrame f= new JFrame();
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setTitle("Bresenham");
        f.getContentPane().add(new BresenhamPanel());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
class BresenhamPanel extends JPanel{
    private final int pixelSize=10;

    BresenhamPanel(){
        setPreferredSize(new Dimension(600, 500));
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w=(getWidth()-1) / pixelSize;
        int h=(getHeight()-1) / pixelSize;
        int maxX= (W - 1) / 2;
        int maxY =(h-1)/2;
        int x1=maxX, x2 = maxX *  -2/3, x3 =maxX * 2/3, x4=maxX;
        int y1=-maxY, y2=maxY * -2/3, y3=maxY * 2/3, y4=maxY;

        
        
    }
}

*/