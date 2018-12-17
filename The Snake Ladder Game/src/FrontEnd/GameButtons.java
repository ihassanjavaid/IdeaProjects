package FrontEnd;

import BackEnd.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButtons extends JPanel implements ActionListener {
    private JButton rollBtn;
    private JButton exitBtn;

    private JLabel footer;

    private BasicFrame basicframe;

    private int playerIterator = 0;

    String player1_name;
    String player2_name;

    private Board board;

    public GameButtons(){
        super();

        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new BorderLayout());

        rollBtn = new JButton("<html><i>Roll!</i></html>");
        rollBtn.setBackground(Color.WHITE);
        rollBtn.setForeground(Color.DARK_GRAY);
        rollBtn.setPreferredSize(new Dimension(150, 50));
        this.add(rollBtn, BorderLayout.WEST);

        rollBtn.addActionListener(this);

        exitBtn = new JButton("<html><u>E</u>xit</html>");
        exitBtn.setBackground(Color.WHITE);
        exitBtn.setForeground(Color.DARK_GRAY);
        exitBtn.setPreferredSize(new Dimension(150, 50));
        this.add(exitBtn, BorderLayout.EAST);

        exitBtn.addActionListener(this);

        configureFooter();

        this.add(footer, BorderLayout.CENTER);

        board = new Board();

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        Object buttonIdentifier = event.getSource();

        if ( buttonIdentifier == exitBtn) {
            System.exit(0);
        }

        else {
            int value = gamePlay(board, playerIterator);

            checkWin(value);

            basicframe.callsWhenActionListener(new ValuesAndValueType(value, playerIterator));

            if (playerIterator == 0) {
                //footer.setText(this.player1_name +" got: "+this.diceNum +"Position: "+value);
                playerIterator = 1;
            }
            else if (playerIterator == 1) {
                //footer.setText(this.player2_name + " got: " + this.diceNum +"Position: "+value);
                playerIterator = 0;
            }
        }
    }
    public int gamePlay(Board board, int i) {
        int positonAfterRoll;

        int num = board.rollTheDice();

        int type = 0;
        /*
        0: Nothing
        1: Ladder
        -1: Snake
         */

        //<for-self-check>
        if (i == 0)
            System.out.println(this.player1_name +" got: " +num);
        else
            System.out.println(this.player2_name + " got: " +num);
        //</for-self-check>

        board.players[i].setCurrentPosition(board.players[i].getCurrentPosition()+num);

        positonAfterRoll = board.players[i].getCurrentPosition();

        for (int k = 0 ; k < 4 ; k++ ) {

            if (board.players[i].getCurrentPosition() == board.getSnakes()[k].getPoints().getStartPoint() ){

                board.players[i].setCurrentPosition(board.getSnakes()[k].getPoints().getEndPoint());

                positonAfterRoll = board.players[i].getCurrentPosition();

                type = -1;

                //<for-self-check>
                if (i == 0)
                    System.out.println(this.player1_name +" got bit by a snake");
                else
                    System.out.println(this.player2_name +" got bit by a snake");
                //</for-self-check>
            }

            if (board.players[i].getCurrentPosition() == board.getLadders()[k].getPoints().getStartPoint() ){

                board.players[i].setCurrentPosition(board.getLadders()[k].getPoints().getEndPoint());

                positonAfterRoll = board.players[i].getCurrentPosition();

                type = 1;

                //<for-self-check>
                if (i == 0)
                    System.out.println(this.player1_name +" climbed a ladder");
                else
                    System.out.println(this.player2_name +" climbed a ladder");
                //</for-self-check>
            }

        }

        if ( positonAfterRoll > 84 ){
            positonAfterRoll = positonAfterRoll - num;
            System.out.println(num +" exceeds winning. Turn revoked.");

            if ( i == 0 )
                footer.setText(this.player1_name +" got " +num +" which exceeds 84. Turn revoked");
            else
                footer.setText(this.player2_name + " got " +num + " which exceeds 84. Turn revoked");
        }

        else if ( positonAfterRoll == 84){

            /*
            if ( i == 0 ) {
                System.out.println(this.player1_name + " has won the game");
                footer.setText(this.player1_name + " has won the game");
            }
            else {
                System.out.println(this.player2_name + " has won the game");
                footer.setText(this.player2_name + " has won the game");
            }
            */
            footer.setText("<html><i>Game Ended!</i></html>");
        }

        else {

            if (i == 0) {
                System.out.println(this.player1_name + "\'s position: " + positonAfterRoll);

                if (type == 0)
                    footer.setText(this.player1_name + " got: " + num + " Position: " + positonAfterRoll);
                else if (type == 1)
                    footer.setText(this.player1_name + " got: " + num + " and climbed up a Ladder. Position: " + positonAfterRoll);
                else
                    footer.setText(this.player1_name + " got: " + num + " and got bit by a Snake. Position: " + positonAfterRoll);
            }

            else {
                System.out.println(this.player2_name + "\'s position: " + positonAfterRoll);

                if (type == 0)
                    footer.setText(this.player2_name + " got: " + num + " Position: " + positonAfterRoll);
                else if (type == 1)
                    footer.setText(this.player2_name + " got: " + num + " and climbed up a Ladder. Position: " + positonAfterRoll);
                else
                    footer.setText(this.player2_name + " got: " + num + " and got bit by a Snake. Position: " + positonAfterRoll);
            }

        }

        board.players[i].setCurrentPosition(positonAfterRoll);
        return positonAfterRoll;
    }

    public void setBasicframe(BasicFrame basicframe_in) {
        this.basicframe = basicframe_in;

    }

    private void checkWin(int value){
        if ( value == 84 ){
            if ( playerIterator == 0 )
                JOptionPane.showMessageDialog(basicframe.getFrame(), ("Congratulations!\n" +this.player1_name + " won the game!"), "Winner!", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(basicframe.getFrame(), ("Congratulations!\n" +this.player2_name + " won the game!"), "Winner!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    private void configureFooter(){
        footer = new JLabel("Game Starts!");
        footer.setHorizontalAlignment(SwingConstants.CENTER);
        footer.setVerticalAlignment(SwingConstants.CENTER);
        Font font = new Font("SansSerif",Font.PLAIN, 18);
        footer.setFont(font);
        footer.setForeground(Color.BLACK);
    }

}
