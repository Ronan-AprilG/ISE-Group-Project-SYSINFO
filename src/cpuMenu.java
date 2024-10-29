import javax.swing.*;
import java.awt.*;

public class cpuMenu {
    //declare constants
    public static final int WINDOW_HEIGHT = 360;
    public static final int WINDOW_WIDTH = 640;

    static JPanel initCPUMenu()
    {
        cpuInfo cpu = new cpuInfo();
        cpu.read(0);

        JPanel p = new JPanel();
        p.setBounds(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS ));
        JLabel label = new JLabel();
        label.setText("Your CPU model is " + cpu.getModel());
        label.setBounds(0,0,418,18);

        JLabel label2 = new JLabel();
        label2.setText("The amount of sockets on this computer is " + cpu.socketCount() + " with " + cpu.coresPerSocket() + " cores per socket.");
        label2.setBounds(0,16,600,16);
        JLabel label3 = new JLabel("The size of the layer 1 data cache is " + cpu.l1dCacheSize() + " bytes");
        JLabel label4 = new JLabel("The size of the layer 1 instruction cache is " + cpu.l1iCacheSize() + " bytes");
        JLabel label5 = new JLabel("The size of the layer 2 cache is " +cpu.l2CacheSize() + " bytes");
        JLabel label6 = new JLabel("The size of the layer 3 cache is " +cpu.l3CacheSize()+ " bytes");
        label.setForeground(Color.green);
        label2.setForeground(Color.green);
        label3.setForeground(Color.green);
        label4.setForeground(Color.green);
        label5.setForeground(Color.green);
        label6.setForeground(Color.green);
        Font font = new Font("monospace", Font.PLAIN,15);
        label.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);
        p.add(label);
        p.add(label2);
        p.add(label3);
        p.add(label4);
        p.add(label5);
        p.add(label6);

        p.setBackground(new Color(0,0,0,255));

        return p;

    }
    static double calcCPUUseage()
    {
        cpuInfo cpu = new cpuInfo();
        cpu.read(1);
        double percent = cpu.getUserTime(1) / cpu.getSystemTime(1) * 100;
        return percent;
    }
}
