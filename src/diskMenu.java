import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class diskMenu {

    static JPanel innitDiskMenu()
    {
        diskInfo disk = new diskInfo();
        disk.read();
        JPanel p = new JPanel();
        p.setBackground(Color.black);

        // DIsk count
        JLabel label1 = new JLabel("disk count: " + disk.diskCount() );
        p.add(label1);

        // get Name
        JLabel label2 = new JLabel ("    Name Disk 1: " + disk.getName(0) );
        p.add(label2);
        JLabel label3 = new JLabel ("    Name Disk 2: " + disk.getName(1) );
        p.add(label3);
        JLabel label4 = new JLabel ("    Name Disk 3: " + disk.getName(2) );
        p.add(label4);
        JLabel label5 = new JLabel ("    Name Disk 4: " + disk.getName(3) );
        p.add(label5);
        JLabel label6 = new JLabel ("    Name Disk 5: " + disk.getName(4) );
        p.add(label6);
        JLabel label7 = new JLabel ("    Name Disk 6: " + disk.getName(5) );
        p.add(label7);
        JLabel label8 = new JLabel ("    Name Disk 7: " + disk.getName(6) );
        p.add(label8);

        // get Used
        JLabel label9 = new JLabel ("    Used Disk 1: " + disk.getUsed(0) );
        p.add(label9);
        JLabel label10 = new JLabel ("    Used Disk 2: " + disk.getUsed(1) );
        p.add(label10);
        JLabel label11 = new JLabel ("    Used Disk 3: " + disk.getUsed(2) );
        p.add(label11);
        JLabel label12 = new JLabel ("    Used Disk 4: " + disk.getUsed(3) );
        p.add(label12);
        JLabel label13 = new JLabel ("    Used Disk 5: " + disk.getUsed(4) );
        p.add(label13);
        JLabel label14 = new JLabel ("    Used Disk 6: " + disk.getUsed(5) );
        p.add(label14);
        JLabel label15 = new JLabel ("    Used Disk 7: " + disk.getUsed(6) );
        p.add(label15);

        //get Available
        JLabel label16 = new JLabel ("    Available Disk 1: " + disk.getAvailable(0) );
        p.add(label16);
        JLabel label17 = new JLabel ("    Available Disk 2: " + disk.getAvailable(1) );
        p.add(label17);
        JLabel label18 = new JLabel ("    Available Disk 3: " + disk.getAvailable(2) );
        p.add(label18);
        JLabel label19 = new JLabel ("    Available Disk 4: " + disk.getAvailable(3) );
        p.add(label19);
        JLabel label20 = new JLabel ("    Available Disk 5: " + disk.getAvailable(4) );
        p.add(label20);
        JLabel label21 = new JLabel ("    Available Disk 6: " + disk.getAvailable(5) );
        p.add(label21);
        JLabel label22 = new JLabel ("    Available Disk 7: " + disk.getAvailable(6) );
        p.add(label22);

        // get total
        JLabel label23 = new JLabel ("    Total for Disk 1: " + disk.getTotal(0) );
        p.add(label23);
        JLabel label24 = new JLabel ("    Total for Disk 2: " + disk.getTotal(1) );
        p.add(label24);
        JLabel label25 = new JLabel ("    Total for Disk 3: " + disk.getTotal(2) );
        p.add(label25);
        JLabel label26 = new JLabel ("    Total for Disk 4: " + disk.getTotal(3) );
        p.add(label26);
        JLabel label27 = new JLabel ("    Total for Disk 5: " + disk.getTotal(4) );
        p.add(label27);
        JLabel label28 = new JLabel ("    Total for Disk 6: " + disk.getTotal(5) );
        p.add(label28);
        JLabel label29 = new JLabel ("    Total for Disk 7: " + disk.getTotal(6) );
        p.add(label29);

        // Font of text
        Font font = new Font("monospace", Font.PLAIN, 30);
        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);
        label7.setFont(font);
        label8.setFont(font);
        label9.setFont(font);
        label10.setFont(font);
        label11.setFont(font);
        label12.setFont(font);
        label13.setFont(font);
        label14.setFont(font);
        label15.setFont(font);
        label16.setFont(font);
        label17.setFont(font);
        label18.setFont(font);
        label19.setFont(font);
        label20.setFont(font);
        label21.setFont(font);
        label22.setFont(font);
        label23.setFont(font);
        label24.setFont(font);
        label25.setFont(font);
        label26.setFont(font);
        label27.setFont(font);
        label28.setFont(font);
        label29.setFont(font);

        //Colour of Text
        // colour of  disk count and name
        label1.setForeground(Color.green);
        label2.setForeground(Color.green);
        label3.setForeground(Color.green);
        label3.setForeground(Color.green);
        label4.setForeground(Color.green);
        label5.setForeground(Color.green);
        label6.setForeground(Color.green);
        label7.setForeground(Color.green);
        label8.setForeground(Color.green);

        // colour of get used
        label9.setForeground(Color.white);
        label10.setForeground(Color.white);
        label11.setForeground(Color.white);
        label12.setForeground(Color.white);
        label13.setForeground(Color.white);
        label14.setForeground(Color.white);
        label15.setForeground(Color.white);

        // colour of available disk space
        label16.setForeground(Color.red);
        label17.setForeground(Color.red);
        label18.setForeground(Color.red);
        label19.setForeground(Color.red);
        label20.setForeground(Color.red);
        label21.setForeground(Color.red);
        label22.setForeground(Color.red);

        // colour of get total
        label23.setForeground(Color.yellow);
        label24.setForeground(Color.yellow);
        label25.setForeground(Color.yellow);
        label26.setForeground(Color.yellow);
        label27.setForeground(Color.yellow);
        label28.setForeground(Color.yellow);
        label29.setForeground(Color.yellow);





        return p;

    }
}
