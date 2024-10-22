import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //this code library allows the creation of a window to be open

public class Main extends JFrame{
    static JFrame app_window;
    static JPanel pages;

    //names of our pages use
    public static final String MAIN_MENU_PAGE = "main_page";
    public static final String CPU_PAGE = "cpu_page";

    //creating constants to be referenced
    public static final int WINDOW_HEIGHT = 360;
    public static final int WINDOW_WIDTH = 640;

    //this is a method to change what page is being displayed on the screen.
    //you input the page name as an argument for this method when called
    private static void changePage(String screen)
    {
        ((CardLayout) pages.getLayout()).show(pages,screen);
    }

    public static void main(String[] args)
    {


        //System.loadLibrary("sysinfo");
        /*
       we create a new window and store it in the app_window variables
        we set it so that it closes when exited
        */

        app_window = new JFrame("Team 7 SYSINFO");
        app_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make it so that the window is closed by exiting
        //we store each of the pages of the application in a variable called pages using Swing's Cardlayout function
        pages = new JPanel(new CardLayout());
        pages.add(initMainMenu(),MAIN_MENU_PAGE); //we add each of the pages to the "book" persay stored in pages
        pages.add(initCPUMenu(),CPU_PAGE); //the first argument is the method that creates the panel then its info is stored in a string
        //we add the pages t
        app_window.add(pages);
        app_window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        app_window.setVisible(true); //this line makes the window visible


    }
        static JPanel initMainMenu()
        {
            JPanel p = new JPanel();
            JButton cpu_button = new JButton("CPU");
            cpu_button.setBounds(20,20,120,60);

            cpu_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(CPU_PAGE);
                    /*p.removeAll();
                    initCPUMenu();
                    app_window.revalidate();
                    app_window.repaint();
                     */
                }
            });
            cpu_button.setVisible(true);
            p.add(cpu_button);
            return p;

        }
        static JPanel initCPUMenu()
        {
            JPanel p = new JPanel();
            JLabel label = new JLabel();
            label.setText("Your CPU is :3");
            label.setVisible(true);

            JButton back_button = new JButton("BACK");
            back_button.setBounds(0,WINDOW_HEIGHT-60,120,60);

            back_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(MAIN_MENU_PAGE);

                }
            });
            back_button.setVisible(true);
            p.add(back_button);

            p.add(label);
            return p;

        }

    }
