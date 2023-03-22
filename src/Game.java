import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game extends JFrame {
    private ArrayList<Point> solution;
    private JPanel panel;
    private BufferedImage sourse;
    private BufferedImage resized;
    private int wight, height;
    private final int DESIRED_WIGHT = 400;

    public Game(){
        initUI();
    }

    public void initUI() {
        solution = new ArrayList<>();
        solution.add(new Point(0,0));
        solution.add(new Point(0,1));
        solution.add(new Point(0,2));
        solution.add(new Point(1,0));
        solution.add(new Point(1,1));
        solution.add(new Point(1,2));
        solution.add(new Point(2,0));
        solution.add(new Point(2,1));
        solution.add(new Point(2,2));
        solution.add(new Point(3,0));
        solution.add(new Point(3,1));
        solution.add(new Point(3,2));

    }


}
