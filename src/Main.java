import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //this code library allows the creation of a window to be open

public class Main {

    public static void main(String[] args)
    {
        /*
        Here is the variables that iniitalise the different pages of the menus

         */
        enum MENUPAGE
        {
            MAIN,
            CPU,

        }
        MENUPAGE currentPage = MENUPAGE.MAIN;

        /*
            Here we use swing's code library Jframe object to open up a new window. That window is stored in the variable app_window
         */
        JFrame app_window = new JFrame("Team 7 SYSINFO");
        app_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make it so that the window is closed by exiting
             //set size of GUI screen

        //creating sample text
        initMainMenu(app_window);
        app_window.setSize(640,360);
        app_window.setLayout(null);
        app_window.setVisible(true); //put this line at the END after you have added all your elements


        }
        static void initMainMenu(JFrame jf)
        {

            JButton cpu_button = new JButton("CPU");
            cpu_button.setBounds(20,20,120,60);

            cpu_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    innitCPUMenu(jf);
                }
            });
            cpu_button.setVisible(true);
            jf.add(cpu_button);

        }
        static void innitCPUMenu(JFrame jf)
        {

            JTextArea example_text = new JTextArea("Test number ");
            example_text.setAlignmentX(0);
            example_text.setAlignmentY(0);
            example_text.setEditable(false);
            example_text.setVisible(true);
            jf.add(example_text); //this is how you add componets to the window

        }

    }
