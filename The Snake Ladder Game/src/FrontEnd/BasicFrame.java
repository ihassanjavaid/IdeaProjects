package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class BasicFrame {
    private JLabel header;
    private JFrame frame;
    private GameBoard gameBoard;
    private GameButtons gameButtons;

    BasicFrame(){
        frame = new JFrame("Snake and Ladders Game");
        frame.setSize(1485,1070);
        frame.setBackground(Color.DARK_GRAY);
        frame.setLayout(new BorderLayout());

        header = new JLabel("The Snake and Ladder Game");
        configureHeader();
        frame.add(header, BorderLayout.NORTH);

        gameBoard = new GameBoard();
        frame.add(gameBoard, BorderLayout.CENTER);

        gameButtons = new GameButtons();
        frame.add(gameButtons, BorderLayout.SOUTH);
        gameButtons.setBasicframe(this);

        frame.setVisible(true);

        inputPlayerNames();
    }

    private void configureHeader(){
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setVerticalAlignment(SwingConstants.CENTER);
        Font font = new Font("SansSerif", Font.ITALIC, 38);
        header.setFont(font);
        header.setForeground(Color.BLACK);
    }

    protected void callsWhenActionListener(ValuesAndValueType valuesAndTypes){
        gameBoard.setPointsHere(valuesAndTypes);
    }

    private void inputPlayerNames(){
        gameButtons.player1_name = JOptionPane.showInputDialog("<html>Enter Name of 1<sup>st</sup> player</html>\n<html><i>Colour: Red</i></html>");
        gameButtons.player2_name = JOptionPane.showInputDialog("<html>Enter Name of 2<sup>nd</sup> player</html>\n<html><i>Colour: Blue</i></html>");
    }

    protected JFrame getFrame() {
        return frame;
    }
}
