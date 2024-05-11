import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import java.awt.Image;

public class WeeWoo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("oh yas"); // makes the window
        frame.setLayout(new GridBagLayout()); // sets the layout (also makes the text box centered for some reason)

        //JTextField textFieldUserName = new JTextField(50); // text box in center of the screen
        //frame.add(textFieldUserName); // adds the text box to the frame

        JMenuBar menuBar = new JMenuBar(); // the menu bar at the top of the screen
        JMenu menuFile = new JMenu("File"); // "file" option on the menu bar
        JMenuItem menuItemExit = new JMenuItem("Exit"); // "exit" under "file" in the menu bar

        JButton button = new JButton("wee woo");
        button.setBounds(50, 100, 95, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(button.getText() == "wee woo") {
                button.setText("grah"); }
                else { button.setText("wee woo"); }

            }
        });

        frame.add(button);

        menuFile.add(menuItemExit); // adds "exit" under "file"
        menuBar.add(menuFile); // adds "file" under the menu bar
 
        frame.setJMenuBar(menuBar); // adds menu bar to the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes the program exit when closed, otherwise it keeps running, despite not doing anything

        frame.setSize(300, 200); // sets the length/width of the frame
        frame.setVisible(true); // frame is invisible by default???

        Image icon = new ImageIcon("closed.png").getImage(); // sets "icon" to the closed minecraft chest image. --ImageIcon("PATH_TO_IMAGE")--
        frame.setIconImage(icon); // sets the image as "icon"

        // frame.getContentPane().setBackground(Color.GREEN); // makes the background ENTIRELY green. commented out cuz i HATE how green this is. makes me wanna puke. seriously
        

    }
}
