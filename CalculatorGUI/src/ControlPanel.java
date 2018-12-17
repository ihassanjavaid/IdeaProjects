import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ControlPanel extends JPanel implements ActionListener{

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

    private JButton square;
    private JButton sqrt;
    private JButton memory;
    private JButton exit;

    private String mainString;

    private int firstOperand;
    private int secondOperand;

    private int result;

    private char nowOp;
    private char thenOp;

    private int memorySave;

    private Calculator calculatorReferenceVar;

    // Filing for Memory

    private PrintWriter writer;
    private File memoryFile;

    private Font numericalFont = new Font("TimesRoman", Font.PLAIN, 40);
    private Font algebraicFont = new Font("SansSerif", Font.BOLD, 40);

    public ControlPanel() throws FileNotFoundException { // Constructor

        super();

        //this.setBackground(Color.WHITE);
        this.setLayout( new GridLayout(4, 5, 3, 3) );

        inilialiseButtons();

        configureButtons();

        addButtonstoPanel();

        bindButtonstoListener();

        mainString = "";

        firstOperand = 0;
        secondOperand = 0;

        thenOp = '+';
        nowOp = '+';

        memorySave = 0;

        memoryFile = new File("memory.txt");
        writer = new PrintWriter(memoryFile);

        this.setFocusable(true);
        this.addKeyListener(new NumericalListener());

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

        square = new JButton("<html>x<sup>2</sup></html>");
        sqrt = new JButton("sqrt.");
        memory = new JButton("M");
        exit = new JButton("Exit");

    }

    private void configureButtons(){

        // Set Colors

        one.setBackground(Color.LIGHT_GRAY);
        two.setBackground(Color.LIGHT_GRAY);
        three.setFont(numericalFont);
        plus.setBackground(Color.LIGHT_GRAY);
        plus.setForeground(Color.WHITE);

        four.setBackground(Color.LIGHT_GRAY);
        five.setBackground(Color.LIGHT_GRAY);
        six.setBackground(Color.LIGHT_GRAY);
        minus.setBackground(Color.LIGHT_GRAY);
        minus.setForeground(Color.WHITE);

        seven.setBackground(Color.LIGHT_GRAY);
        eight.setBackground(Color.LIGHT_GRAY);
        nine.setBackground(Color.LIGHT_GRAY);
        multiply.setBackground(Color.LIGHT_GRAY);
        multiply.setForeground(Color.WHITE);

        clear.setBackground(Color.LIGHT_GRAY);
        clear.setForeground(Color.RED);
        zero.setBackground(Color.LIGHT_GRAY);
        equals.setBackground(Color.LIGHT_GRAY);
        equals.setForeground(Color.WHITE);
        divide.setBackground(Color.LIGHT_GRAY);
        divide.setForeground(Color.WHITE);

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

        // Configure Extra buttons

        square.setBackground(Color.LIGHT_GRAY);
        sqrt.setBackground(Color.LIGHT_GRAY);
        memory.setBackground(Color.LIGHT_GRAY);
        exit.setBackground(Color.LIGHT_GRAY);
        exit.setForeground(Color.RED);

        square.setFont(new Font("SansSerif", Font.PLAIN, 22));
        sqrt.setFont(new Font("SansSerif", Font.PLAIN, 22));
        memory.setFont(new Font("SansSerif", Font.PLAIN, 34));
        exit.setFont(new Font("SansSerif", Font.ITALIC, 22));


    }

    private void addButtonstoPanel(){

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(plus);
        this.add(square);

        this.add(four);
        this.add(five);
        this.add(six);
        this.add(minus);
        this.add(sqrt);

        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(multiply);
        this.add(memory);

        this.add(clear);
        this.add(zero);
        this.add(equals);
        this.add(divide);
        this.add(exit);

    }

    private void bindButtonstoListener(){

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        plus.addActionListener(this);
        square.addActionListener(this);

        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        minus.addActionListener(this);
        sqrt.addActionListener(this);

        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        multiply.addActionListener(this);
        memory.addActionListener(this);

        clear.addActionListener(this);
        zero.addActionListener(this);
        equals.addActionListener(this);
        divide.addActionListener(this);
        exit.addActionListener(this);
    }

    public void setCalculatorForSettingString(Calculator calculatorForSettingString_in) {
        this.calculatorReferenceVar = calculatorForSettingString_in;
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException, NullPointerException{

        Object identifier = e.getSource();

        if ( identifier  == exit ){
            saveAndExit();
        }

        else if ( identifier == zero ){
            mainString = mainString +"0";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == one ){
            mainString = mainString +"1";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == two ){
            mainString = mainString +"2";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == three){
            mainString = mainString +"3";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == four ){
            mainString = mainString +"4";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == five){
            mainString = mainString +"5";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == six){
            mainString = mainString +"6";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == seven){
            mainString = mainString +"7";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == eight){
            mainString = mainString +"8";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == nine ){
            mainString = mainString +"9";
            calculatorReferenceVar.setMainStringLabel(mainString);
        }

        else if ( identifier == plus || identifier == minus || identifier == multiply || identifier == divide ){

            try {
                secondOperand = (int) Double.parseDouble(mainString);
            }

            catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Please enter a number");
                resetCalculations();
            }
            mainString = "";


            if ( identifier == plus ){
                nowOp = '+';
            }

            else if ( identifier == minus ){
                nowOp = '-';
            }

            else if (identifier == multiply){
                nowOp = 'x';
            }

            else{
                nowOp = '/';
            }

            doLastOperation();
        }

        else if ( identifier == square || identifier == sqrt ){

            if ( identifier == square ){
                doSquareTypeOperations("square");
            }

            if ( identifier == sqrt ){
                doSquareTypeOperations("sqrt");
            }

        }

        if ( identifier == clear ){
            resetCalculations();
        }

        if ( identifier == equals ){
            doLastOperation();
        }

        if ( identifier == memory){
            try {
                saveTheMemory();
            }
            catch (NumberFormatException nfe){
                System.out.println(nfe);
                System.out.println("MainString is empty");
            }
        }

    }


    private void doLastOperation(){

        if ( thenOp == '+'){
            result = firstOperand + secondOperand;
        }

        else if ( thenOp == '-' ){
            result = firstOperand - secondOperand;
        }

        else if ( thenOp == 'x' ){
            result = firstOperand * secondOperand;
        }

        else if ( thenOp == '/' ){
            result = firstOperand / secondOperand;
        }

        thenOp = nowOp;

        firstOperand = result;

        calculatorReferenceVar.setMainStringLabel(String.valueOf(result));
    }

    private void doSquareTypeOperations(String type){

        try {
            secondOperand = (int) Double.parseDouble(calculatorReferenceVar.getMainStringLabel());
        }

        catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Please enter a number first");
            resetCalculations();
        }

        if ( type.equals("square") ){
            mainString = String.valueOf(Math.pow(secondOperand, 2));
        }

        else{
            mainString = String.valueOf(Math.sqrt(secondOperand));
        }

        calculatorReferenceVar.setMainStringLabel(mainString);
    }

    private void resetCalculations() throws NumberFormatException /* For Memory Saving*/ {
        mainString = "";
        calculatorReferenceVar.setMainStringLabel(mainString);
        firstOperand = 0;
        secondOperand = 0;
        nowOp = '+';
        thenOp = '+';
    }

    private void saveTheMemory() throws NumberFormatException{
        memorySave = Integer.parseInt(mainString);
        writer.println("Memory: " +memorySave);
        writer.flush();
        resetCalculations();
    }

    private void saveAndExit(){
        writer.println("Last Value: " +calculatorReferenceVar.getMainStringLabel());
        writer.close();
        System.exit(0);
    }

    private class NumericalListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            // Empty method - Just for interface implementation
        }

        @Override
        public void keyPressed(KeyEvent e) {

            int identifier = e.getKeyCode();

            if ( identifier  ==  KeyEvent.VK_ESCAPE ){
                saveAndExit();
            }

            else if ( identifier == KeyEvent.VK_0 ){
                mainString = mainString +"0";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_1 ){
                mainString = mainString +"1";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_2 ){
                mainString = mainString +"2";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_3 ){
                mainString = mainString +"3";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_4 ){
                mainString = mainString +"4";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_5 ){
                mainString = mainString +"5";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_6 ){
                mainString = mainString +"6";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_7 ){
                mainString = mainString +"7";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_8 ){
                mainString = mainString +"8";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_9 ){
                mainString = mainString +"9";
                calculatorReferenceVar.setMainStringLabel(mainString);
            }

            else if ( identifier == KeyEvent.VK_BACK_SPACE ){
                resetCalculations();
            }

            else if ( identifier == KeyEvent.VK_ENTER ){
                doLastOperation();
            }

            else if ( identifier == KeyEvent.VK_M ){
                saveTheMemory();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Empty method - Just for interface implementation
        }
    }

}
