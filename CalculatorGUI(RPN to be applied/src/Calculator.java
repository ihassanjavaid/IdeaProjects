import javax.swing.*;
import java.awt.*;

public class Calculator{

    JFrame frame;

    JPanel headerPanel;

    JLabel heading;
    JLabel instruction;

    JLabel mainStringLabel;

    ControlPanel controlPanel;

    public Calculator(){
        frame = new JFrame("Calculator");
        frame.setSize(450,800);
        frame.setBackground(Color.DARK_GRAY);
        frame.setLayout( new GridLayout(2, 1));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(3,1));

        heading = new JLabel("CALCULATOR");
        configureHeading();
        headerPanel.add(heading);

        instruction = new JLabel("Press \"CLR\" after every operation");
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
}
