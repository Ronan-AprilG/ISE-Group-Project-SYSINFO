import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //this code library allows the creation of a window to be open

enum MENUPAGE
{
    MAIN,
    CPU,

}

public class Main extends JFrame{
    MENUPAGE currentPage = MENUPAGE.MAIN;
    static JFrame app_window;

    public static void main(String[] args)
    {
        /*
        Here is the variables that iniitalise the different pages of the menu
            Here we use swing's code library Jframe object to open up a new window. That window is stored in the variable app_window
         */
        app_window = new JFrame("Team 7 SYSINFO");
        app_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make it so that the window is closed by exiting
             //set size of GUI screen

        //creating sample text
        initMainMenu();
        app_window.setSize(640,360);
        app_window.setVisible(true); //put this line at the END after you have added all your elements


        }
        static void initMainMenu()
        {
            JPanel p = new JPanel();
            JButton cpu_button = new JButton("CPU");
            cpu_button.setBounds(20,20,120,60);

            cpu_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    p.removeAll();
                    innitCPUMenu();
                    p.revalidate();
                    p.repaint();

                }
            });
            cpu_button.setVisible(true);
            p.add(cpu_button);
            app_window.add(p);

        }
        static void innitCPUMenu()
        {
            JPanel p = new JPanel();
            JLabel label = new JLabel("CPU LABEL");
            label.setText("Your CPU is :3");
            p.add(label);
            app_window.add(p);

        }

    }
