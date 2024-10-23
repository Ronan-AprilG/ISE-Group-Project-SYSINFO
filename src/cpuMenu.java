import javax.swing.*;

public class cpuMenu {
    //declare constants
    public static final int WINDOW_HEIGHT = 360;
    public static final int WINDOW_WIDTH = 640;
    static JPanel initCPUMenu()
    {

        JPanel p = new JPanel();
        p.setBounds(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        JLabel label = new JLabel();
        label.setText("Your CPU is :3");
        label.setVisible(true);
        p.add(label);
        return p;

    }
}
