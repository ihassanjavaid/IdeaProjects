import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel implements ActionListener {

    private JButton one;
    private JButton two;
    private JButton three;
    private JButton plus;

    private JButton four;
    private JButton five;
    private JButton six;
    private JButton minus;

    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton multiply;

    private JButton zero;
    private JButton clear;
    private JButton equals;
    private JButton exit;

    String mainString;

    Calculator calculatorForSettingString;

    private Font numericalFont = new Font("TimesRoman", Font.PLAIN, 40);
    private Font algebraicFont = new Font("SansSerif", Font.BOLD, 40);

    public ControlPanel(){ // Constructor

        super();

        this.setBackground(Color.DARK_GRAY);
        this.setLayout( new GridLayout(4, 4) );

        inilialiseButtons();

        configureButtons();

        addButtonstoPanel();

        bindButtonstoListener();

        mainString = "";
    }

    private void inilialiseButtons(){

        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        plus = new JButton("+");

        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        minus = new JButton("-");

        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        multiply = new JButton("x");

        clear = new JButton("CLR");
        zero = new JButton("0");
        equals = new JButton("=");
        exit = new JButton("Exit");

    }

    private void configureButtons(){

        // Set background

        one.setBackground(Color.LIGHT_GRAY);
        two.setBackground(Color.LIGHT_GRAY);
        three.setFont(numericalFont);
        plus.setBackground(Color.LIGHT_GRAY);

        four.setBackground(Color.LIGHT_GRAY);
        five.setBackground(Color.LIGHT_GRAY);
        six.setBackground(Color.LIGHT_GRAY);
        minus.setBackground(Color.LIGHT_GRAY);

        seven.setBackground(Color.LIGHT_GRAY);
        eight.setBackground(Color.LIGHT_GRAY);
        nine.setBackground(Color.LIGHT_GRAY);
        multiply.setBackground(Color.LIGHT_GRAY);

        clear.setBackground(Color.LIGHT_GRAY);
        zero.setBackground(Color.LIGHT_GRAY);
        equals.setBackground(Color.LIGHT_GRAY);
        exit.setBackground(Color.LIGHT_GRAY);

        // Set Fonts

        one.setFont(numericalFont);
        two.setFont(numericalFont);
        three.setBackground(Color.LIGHT_GRAY);
        four.setFont(numericalFont);
        five.setFont(numericalFont);
        six.setFont(numericalFont);
        seven.setFont(numericalFont);
        eight.setFont(numericalFont);
        nine.setFont(numericalFont);
        zero.setFont(numericalFont);

        plus.setFont(algebraicFont);
        minus.setFont(new Font("SansSerif", Font.BOLD, 55));
        multiply.setFont(algebraicFont);
        equals.setFont(algebraicFont);

        clear.setFont(new Font("SansSerif", Font.ITALIC, 20));
        exit.setFont(new Font("SansSerif", Font.ITALIC, 20));

    }

    private void addButtonstoPanel(){

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(plus);

        this.add(four);
        this.add(five);
        this.add(six);
        this.add(minus);

        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(multiply);

        this.add(clear);
        this.add(zero);
        this.add(equals);
        this.add(exit);

    }

    private void bindButtonstoListener(){

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        plus.addActionListener(this);

        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        minus.addActionListener(this);

        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        multiply.addActionListener(this);

        clear.addActionListener(this);
        zero.addActionListener(this);
        equals.addActionListener(this);
        exit.addActionListener(this);
    }

    public void setCalculatorForSettingString(Calculator calculatorForSettingString_in) {
        this.calculatorForSettingString = calculatorForSettingString_in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object identifier = e.getSource();

        if ( identifier == exit ){
            System.exit(0);
        }

        else if ( identifier == zero ){
            mainString = mainString +"0";
        }

        else if ( identifier == one ){
            mainString = mainString +"1";
        }

        else if ( identifier == two ){
            mainString = mainString +"2";
        }

        else if ( identifier == three){
            mainString = mainString +"3";
        }

        else if ( identifier == four ){
            mainString = mainString +"4";
        }

        else if ( identifier == five){
            mainString = mainString +"5";
        }

        else if ( identifier == six){
            mainString = mainString +"6";
        }

        else if ( identifier == seven){
            mainString = mainString +"7";
        }

        else if ( identifier == eight){
            mainString = mainString +"8";
        }

        else if ( identifier == nine ){
            mainString = mainString +"9";
        }

        else if ( identifier == plus ){
            mainString = mainString +"+";
        }

        else if ( identifier == minus){
            mainString = mainString +"-";
        }

        else if ( identifier == multiply){
            mainString = mainString +"x";
        }

        else if ( identifier == clear ){
            mainString = "";
        }

        else{
            performCalculatorOperation();
            plus.setEnabled(false);
        }

        calculatorForSettingString.setMainStringLabel(mainString);
    }

    private void performCalculatorOperation() {

        int result = 0;

        String string = mainString;

        int numberOfOperands = 1;

        for ( int i = 0 ; i < string.length() ; i++ ){

            if ( string.charAt(i) == '+' || string.charAt(i) == '-' || string.charAt(i) == 'x' )
                numberOfOperands++;
        }

        int[] arrayOfOperands = new int[numberOfOperands];

        int integerForOperandArray = 0;

        for ( int j = 0 ; j < (string.length()-1) ; j++ ){

            String temp = "";

            while ( string.charAt(j) > '0' && string.charAt(j) < '9' ){
                temp = temp + string.charAt(j);
                j++;
                if ( j == string.length() )
                    break;
            }

            arrayOfOperands[integerForOperandArray] = Integer.parseInt(temp);
            integerForOperandArray++;

        }

    }

}
