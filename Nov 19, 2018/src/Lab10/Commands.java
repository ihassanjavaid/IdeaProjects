package Lab10;

import javax.swing.*;
import java.awt.*;

public class Commands extends JPanel{
    private JButton okBtn;
    private JButton canelBtn;

    public Commands(){
        super();
        okBtn = new JButton("<html><b>0</b>K</html>");
        okBtn.setBackground(Color.LIGHT_GRAY);
        okBtn.setForeground(Color.GREEN);
        canelBtn = new JButton("<html><u>C</u>ancel</html>");
        canelBtn.setBackground(Color.DARK_GRAY);
        canelBtn.setForeground(Color.RED);
        this.add(okBtn);
        this.add(canelBtn);

    }

}
