import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Calculator{

    private JFrame frame;

    private JPanel headerPanel;

    private JLabel heading;
    private JLabel instruction;

    private JLabel mainStringLabel;

    private ControlPanel controlPanel;

    public Calculator() throws FileNotFoundException {
        frame = new JFrame("Calculator");
        frame.setSize(450,600);
        frame.setBackground(Color.DARK_GRAY);
        frame.setLayout( new GridLayout(2, 1));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(3,1 ));

        heading = new JLabel("CALCULATOR");
        configureHeading();
        headerPanel.add(heading);

        instruction = new JLabel("--------------------------------------------------------------------------------------------------");
        instruction.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(instruction);

        mainStringLabel = new JLabel("");
        configureMainStringLabel();
        headerPanel.add(mainStringLabel);

        frame.add(headerPanel);

        controlPanel = new ControlPanel();
        frame.add(controlPanel);
        controlPanel.setCalculatorForSettingString(this);

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void setMainStringLabel(String string) {
        this.mainStringLabel.setText(string);
    }

    private void configureMainStringLabel(){
        mainStringLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        mainStringLabel.setVerticalAlignment(SwingConstants.CENTER);
        Font font = new Font("SansSerif", Font.PLAIN, 38);
        mainStringLabel.setFont(font);
        mainStringLabel.setForeground(Color.BLACK);
    }

    private void configureHeading(){
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setVerticalAlignment(SwingConstants.CENTER);
        Font font = new Font("TimesRoman", Font.BOLD, 38);
        heading.setFont(font);
        heading.setForeground(Color.BLACK);
    }

    public String getMainStringLabel() {
        return mainStringLabel.getText();
    }
}
