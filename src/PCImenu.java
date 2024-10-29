import javax.swing.*;
import java.awt.*;

public class PCImenu {

    public static final int WINDOW_HEIGHT = 720;
    public static final int WINDOW_WIDTH = 1280;

    static JPanel initPCImenu()
    {
        pciInfo pci = new pciInfo();
        pci.read();

        JPanel a = new JPanel();
        a.setBounds(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        a.setBackground(new Color(0,0,0,255));
        a.setOpaque(true);
        a.setLayout(new BoxLayout(a,BoxLayout.Y_AXIS ));



        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel labelHeader = new JLabel();
        JLabel labelHeader2 = new JLabel();

        labelHeader.setText("PCI Information");
        labelHeader2.setText("Individual PCI Bus Info");
        label.setText("Your PCI bus count for this machine is : " + pci.busCount());
        label2.setText("Your PCI device count is "+ pci.deviceCount(0));
        label3.setText("Your PCI function count is : "+pci.functionCount(0,0));
        label4.setText("PCI functions present : "+pci.functionPresent(0,0,0));
        label5.setText("VendorID : "+pci.vendorID(0,0,0));
        label6.setText("ProductID : "+pci.productID(0,0,0));



        Font font = new Font("monospace", Font.PLAIN,10); // font style and type
        labelHeader.setFont(font);
        labelHeader2.setFont(font);
        label.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);

        labelHeader.setForeground(Color.green);
        labelHeader2.setForeground(Color.green);
        label.setForeground(Color.green);
        label2.setForeground(Color.green);
        label3.setForeground(Color.green);
        label4.setForeground(Color.green);
        label5.setForeground(Color.green);
        label6.setForeground(Color.green);

        a.add(labelHeader);
        a.add(Box.createVerticalStrut(30));
        a.add(label);
        a.add(label2);
        a.add(label3);
        a.add(label4);
        a.add(label5);
        a.add(label6);
        a.add(Box.createVerticalStrut(30));
        a.add(labelHeader2);
        a.add(Box.createVerticalStrut(30));


            for(int i = 0; i < pci.busCount(); i++){
                JLabel label10 = new JLabel();
                label10.setText("Bus " + i +" has " + pci.deviceCount(i)+" devices");
                label10.setForeground(Color.green);
                label10.setFont(font);
                a.add(label10);
                for(int f = 0; f < 32; f++) {
                    if (pci.functionCount(i,f) > 0){
                        JLabel label11 = new JLabel();
                        label11.setText("Bus "+ i + " device " +f+" has "+ pci.functionCount(i ,f)+" functions");
                        label11.setForeground(Color.green);
                        label11.setFont(font);
                        a.add(label11);
                        for(int k = 0; k < 8; k++){
                            if(pci.functionPresent(i,f,k) > 0) {
                                JLabel label12 = new JLabel();
                                label12.setText("Bus "+i+" device "+f+ " function "+k+" has vendor "+ String.format("0x%04X", pci.vendorID(i,f,k))+
                                        " and product "+ String.format("0x%04X", pci.productID(i,f,k)));
                                label12.setForeground(Color.green);
                                label12.setFont(font);
                                a.add(label12);
                            }
                        }
                    }
                }
            }
            a.revalidate();
            a.repaint();
        return a;
    }
}
