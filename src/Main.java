import java.awt.*;
import javax.swing.*; //this code library allows the creation of a window to be open

public class Main {
    public static void main(String[] args)
    {
        /*
            Here we use swing's code library Jframe object to open up a new window. That window is stored in the variable app_window
         */
        JFrame app_window = new JFrame("Team 7 SYSINFO");
        app_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make it so that the window is closed by exiting
        app_window.setSize(640,360);         //set size of GUI screen

        //creating sample text
        JTextArea example_text = new JTextArea("Test number ");
        example_text.setAlignmentX(0);
        example_text.setAlignmentY(0);
        example_text.setEditable(false);
        example_text.setVisible(true);
        app_window.add(example_text); //this is how you add componets to the window

        app_window.setVisible(true); //put this line at the END after you have added all your elements
        }
    }
