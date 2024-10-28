import javax.swing.*;
import java.awt.*;

public class usbMenu {

    public static final int WINDOW_HEIGHT = 360;
    public static final int WINDOW_WIDTH = 640;

    static JButton b, b1, b2, b3;

    static JPanel initusbMenu() {

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("USB information");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        b = new JButton("Bus count");
        b1 = new JButton("Device count");
        b2 = new JButton("Vendor ID");
        b3 = new JButton("Product ID");

        // getting each button to open in a new blank window
        b.addActionListener(e -> openBlankPage("Bus Count Page"));
        b1.addActionListener(e -> openBlankPage("Device Count Page"));
        b2.addActionListener(e -> openBlankPage("Vendor ID Page"));
        b3.addActionListener(e -> openBlankPage("Product ID Page"));

        // the panel to put the buttons in a horizontal line
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(b);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);

        // setting colour of background and text and font size
        buttonPanel.setBackground(Color.black);
        b.setBackground(Color.green);
        b1.setBackground(Color.green);
        b2.setBackground(Color.green);
        b3.setBackground(Color.green);

        Font font = new Font("monospace", Font.BOLD, 30);
        Font font2 = new Font("monospace", Font.BOLD, 20);
        label.setFont(font);
        b.setFont(font2);
        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);

        label.setForeground(Color.green);
        b.setForeground(Color.black);
        b1.setForeground(Color.black);
        b2.setForeground(Color.black);
        b3.setForeground(Color.black);

        p.setBackground(Color.black);

        // adding heading and buttons to panel
        p.add(label);
        p.add(buttonPanel);


        return p;
    }

    // Method to open a blank page with each title
    static void openBlankPage(String title) {
        usbInfo usb = new usbInfo();
        usb.read();
        JFrame blankFrame = new JFrame(title);
        blankFrame.setSize(300, 200);


            if (title == "Bus Count Page") {
                JLabel label2 = new JLabel("USB bus count is: " + usb.busCount());
                blankFrame.add(label2);

                Font font2 = new Font("monospace", Font.PLAIN, 16);
                label2.setFont(font2);
                label2.setForeground(Color.green);
                blankFrame.getContentPane().setBackground(Color.black);
            }

            if (title == "Device Count Page") {
                JLabel label3 = new JLabel("Device count is on bus 0 is: " + usb.deviceCount(0));
                JLabel l3 = new JLabel("Device count is on bus 1 is: " + usb.deviceCount(1));

                blankFrame.add(label3);
                blankFrame.add(l3);
                Font font2 = new Font("monospace", Font.PLAIN, 16);
                label3.setFont(font2);
                label3.setForeground(Color.green);
                l3.setFont(font2);
                l3.setForeground(Color.green);
                blankFrame.getContentPane().setBackground(Color.black);
            }

            if (title == "Vendor ID Page") {
                String str = "";
                for(int i = 0; i<usb.busCount(); i++)
                {
                    for(int j = 0; j<usb.deviceCount(i); j++)
                    {

                        str += "Vendor ID for device " + j + " on bus " + i + " is " + usb.vendorID(i,j) + "\ntest";
                    }
                }
                JLabel label4 = new JLabel(str);
                blankFrame.add(label4);
                Font font2 = new Font("monospace", Font.PLAIN, 16);
                label4.setFont(font2);
                label4.setForeground(Color.green);
                blankFrame.getContentPane().setBackground(Color.black);
            }

            if (title == "Product ID Page") {
                JLabel label5 = new JLabel("Your product ID is:" +usb.productID(1,1));
                blankFrame.add(label5);
                Font font2 = new Font("monospace", Font.PLAIN, 16);
                label5.setFont(font2);
                label5.setForeground(Color.green);
                blankFrame.getContentPane().setBackground(Color.black);
            }


        blankFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        blankFrame.setVisible(true);
    }
}
