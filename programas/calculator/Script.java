package calculator;
import java.awt.event.*;
import javax.swing.*;

public class Script extends javax.swing.JPanel{
    private String add = "+";
    private String subtract = "-";
    private String product = "*";
    private String quocient = "/";
    
    public Script(JButton button, JTextField text1, 
        JTextField text2, JTextField signal, JTextField space){ 
        button.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.valueOf(text2.getText());
                double number2 = Double.valueOf(text1.getText());

                if(signal.getText().equals(add)){
                    space.setText(String.valueOf(number1 + number2));
                }
                if(signal.getText().equals(subtract)){
                    space.setText(String.valueOf(number1 - number2));
                }
                if(signal.getText().equals(product)){
                    space.setText(String.valueOf(number1 * number2));
                }
                if(signal.getText().equals(quocient)){
                    space.setText(String.valueOf(number1 / number2));
                }
            }
        });
    }
}
