package gui_pkg;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App(){ // Constructor
        super(); // class constructor of JFrame class from which our class is extended
        setTitle("My gui_pkg.App With Swing"); // Set title of GUI Window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What to do when we press the Cross Button in title bar
        setSize(500, 500); // sets size
        setVisible(true); // sets the GUI visible
        setLocationRelativeTo(null); // for making the object appear in the middle of the student.Screen
        setLayout(new BorderLayout()); // To divide the screen into Top, Bottom, Left and Right
        setGUIcomponents(); // The method we made ourselves
    }

    public void setGUIcomponents(){
        Container container = getContentPane(); // returns frame internal area -- ITS FRAME // CONTAINER IS WHERE COMPONENTS ARE ADDED - THE MAIN SCREEN
        JButton button = new JButton("OK"); // Makes a button
        container.add(button); // Adds the button in the container we just made two lines above

        MyPanel panel = new MyPanel(); // Makes a panel - Panel is where everything is added
        panel.setSize(300, 300); // sets the size
        panel.setBackground(Color.WHITE); // sets colour of the panel
        container.add(button, BorderLayout.NORTH);
        container.add(panel, BorderLayout.CENTER);
        container.add(panel); // PANEL IN FRAME
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
