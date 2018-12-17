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
    private JButton divide;

    String mainString;
    String secondString;

    int firstOperand;
    int secondOperand;

    boolean flag;

    char operation;

    int result;

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
        secondString = "";

        flag = false;
        operation = '0';
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
        divide = new JButton("/");

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
        divide.setBackground(Color.LIGHT_GRAY);

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
        divide.setFont(algebraicFont);

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
        this.add(divide);

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
        divide.addActionListener(this);
    }

    public void setCalculatorForSettingString(Calculator calculatorForSettingString_in) {
        this.calculatorForSettingString = calculatorForSettingString_in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object identifier = e.getSource();

        if ( !flag ){

            if ( identifier == zero ){
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

            else if ( identifier == plus || identifier == minus || identifier == multiply || identifier == divide ){

                disableOperators();
                firstOperand = Integer.parseInt(mainString);
                flag = true;

                if ( identifier == plus ){
                    mainString = mainString +"+";
                    operation = '+';
                }

                else if ( identifier == minus ){
                    mainString = mainString +"-";
                    operation = '-';
                }

                else if (identifier == multiply){
                    mainString = mainString +"x";
                    operation = 'x';
                }

                else{
                    mainString = mainString +"/";
                    operation = '/';
                }

            }

        }

        if ( flag ) {

            if ( identifier == zero ){
                mainString = mainString +"0";
                secondString = secondString + "0";
            }

            else if ( identifier == one ){
                mainString = mainString +"1";
                secondString = secondString + "1";
            }

            else if ( identifier == two ){
                mainString = mainString +"2";
                secondString = secondString + "2";
            }

            else if ( identifier == three){
                mainString = mainString +"3";
                secondString = secondString + "3";
            }

            else if ( identifier == four ){
                mainString = mainString +"4";
                secondString = secondString + "4";
            }

            else if ( identifier == five){
                mainString = mainString +"5";
                secondString = secondString + "5";
            }

            else if ( identifier == six){
                mainString = mainString +"6";
                secondString = secondString + "6";
            }

            else if ( identifier == seven){
                mainString = mainString +"7";
                secondString = secondString + "7";
            }

            else if ( identifier == eight){
                mainString = mainString +"8";
                secondString = secondString + "8";
            }

            else if ( identifier == nine ){
                mainString = mainString +"9";
                secondString = secondString + "9";
            }

        }

        if ( identifier == clear ){

            flushStrings();
            enableOperators();
            enableAllButtons();
            revertClearButton();

        }

        if ( identifier == equals ){
            mainString = performCalculatorOperation();
            disableOperators();
            disableAllButtons();
            makeClearRed();
        }

        calculatorForSettingString.setMainStringLabel(mainString);
    }

    private void flushStrings(){
        mainString = "";
        secondString = "";
    }

    private String performCalculatorOperation() {

        try {
            secondOperand = Integer.parseInt(secondString);
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Please enter a number first!");
        }

        this.flag = false;

        enableOperators();

        if ( operation == '+' ){
            this.result = firstOperand + secondOperand;
        }

        else if ( operation == '-' ){
            this.result = firstOperand - secondOperand;
        }

        else if ( operation == 'x' ){
            this.result = firstOperand * secondOperand;
        }

        else{
            return mainString + " = " + (firstOperand / secondOperand);
        }

        return mainString + " = " + result;
    }

    private void disableOperators(){
        plus.setEnabled(false);
        minus.setEnabled(false);
        multiply.setEnabled(false);
        divide.setEnabled(false);
    }

    private void enableOperators(){
        plus.setEnabled(true);
        minus.setEnabled(true);
        multiply.setEnabled(true);
        divide.setEnabled(true);
    }

    private void disableAllButtons(){

        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        zero.setEnabled(false);
        equals.setEnabled(false);

    }

    private void enableAllButtons(){

        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        zero.setEnabled(true);
        equals.setEnabled(true);

    }

    private void revertClearButton(){
        clear.setBackground(Color.LIGHT_GRAY);
        clear.setForeground(Color.BLACK);
    }

    private void makeClearRed(){
        clear.setBackground(Color.RED);
        clear.setForeground(Color.WHITE);
    }
    
}
