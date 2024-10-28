import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //this code library allows the creation of a window to be open

public class Main {
    static JFrame app_window;
    static JPanel pages;

    //names of our pages use
    public static final String MAIN_MENU_PAGE = "main_page";
    public static final String CPU_PAGE = "cpu_page";
    public static final String PCI_MENU = "pci_page";
    public static final String USB_PAGE = "usb_page";
    public static final String DISK_PAGE = "disk_page";
    //creating constants to be referenced
    public static final int WINDOW_HEIGHT = 720;
    public static final int WINDOW_WIDTH = 1280;
    static String currentpage = MAIN_MENU_PAGE;
    //this is a method to change what page is being displayed on the screen.
    //you input the page name as an argument for this method when called
    private static void changePage(String screen)
    {
        ((CardLayout) pages.getLayout()).show(pages,screen);
    }

    public static void main(String[] args)
    {

        System.loadLibrary("sysinfo");
        /*
       we create a new window and store it in the app_window variables
        we set it so that it closes when exited
        */
        cpuInfo cpu = new cpuInfo();

        app_window = new JFrame("Team 7 SYSINFO");
        app_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make it so that the window is closed by exiting
        //we store each of the pages of the application in a variable called pages using Swing's Cardlayout function
        pages = new JPanel(new CardLayout());
        pages.add(initMainMenu(),MAIN_MENU_PAGE); //we add each of the pages to the "book" persay stored in pages
        JPanel cpuPage = add_back_button(cpuMenu.initCPUMenu());
        pages.add(cpuPage,CPU_PAGE); //the first argument is the method that creates the panel then its info is stored in a string
        JPanel pciPage = add_back_button(PCImenu.initPCImenu());
        pages.add(pciPage,PCI_MENU);
        JPanel usbPage = add_back_button(usbMenu.initusbMenu());
        pages.add(usbPage,USB_PAGE);
        JPanel diskPage = add_back_button(diskMenu.innitDiskMenu());
        pages.add(diskPage,DISK_PAGE);
        //we add the pages t
        app_window.add(pages);
        app_window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        app_window.setVisible(true); //this line makes the window visible

        diskInfo disk = new diskInfo();
        System.out.println(disk.diskCount());
        while(true)
        {
            switch(currentpage)
            {
                case CPU_PAGE: //update for cpu usage
                    //JPanel
                    //System.out.println(cpuMenu.calcCPUUseage());
                    break;
            }

        }

    }
        static JPanel initMainMenu()
        {

            JPanel p = new JPanel();
            ImageIcon img = new ImageIcon("src/bg.jpg");
            p.setBackground(Color.DARK_GRAY);
            p.setLayout(null);

            JLabel title = new JLabel("Team 7's SYSINFO PROGRAM");
            title.setBounds(WINDOW_WIDTH/2,20,400,40);
            title.setAlignmentX(SwingConstants.CENTER);
            p.add(title);

            JButton cpu_button = new JButton("CPU info");
            cpu_button.setBounds(30,60,240,100);
            cpu_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(CPU_PAGE);
                    currentpage = CPU_PAGE;
                }
            });
            p.add(cpu_button);
            JButton pci_button = new JButton("PCI info");
            pci_button.setBounds(WINDOW_WIDTH-270,60,240,100);
            pci_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(PCI_MENU);
                }
            });
            p.add(pci_button);
            JButton disk_button = new JButton("Disk info");
            disk_button.setBounds(30,180,240,100);
            disk_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(DISK_PAGE);
                }
            });
            p.add(disk_button);
            JButton usb_button = new JButton("USB info");
            usb_button.setBounds(WINDOW_WIDTH-270,180,240,100);
            usb_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(USB_PAGE);
                }
            });
            p.add(usb_button);
            return p;

        }
        static JPanel add_back_button(JPanel panel)
        {
            JButton back_button = new JButton("BACK");
            back_button.setBounds(0,WINDOW_HEIGHT-60,120,60);

            back_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("buttonpresses");
                    changePage(MAIN_MENU_PAGE);

                }
            });
            back_button.setVisible(true);
            panel.add(back_button);
            return panel;
        }

    }
/*

 */