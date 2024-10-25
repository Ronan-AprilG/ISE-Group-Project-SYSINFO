import javax.swing.*;

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
        p.setLayout(null);
        JLabel label = new JLabel();
        label.setText("Your CPU model is " + cpu.getModel());
        label.setBounds(0,0,418,18);
        p.add(label);
        JLabel label2 = new JLabel();
        label2.setText("The amount of sockets on this computer is " + cpu.socketCount() + " with " + cpu.coresPerSocket() + " cores per socket.");
        label2.setBounds(0,16,600,16);
        p.add(label2);

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
