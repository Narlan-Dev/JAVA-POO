package calculator;
import javax.swing.*;
import java.awt.*;

public class Panel extends javax.swing.JFrame {
    public Panel(){
        JButton button = new JButton("START");
        JTextField number1 = new JTextField("");
        JTextField number2 = new JTextField("");
        JTextField signal = new JTextField("");
        JTextField space = new JTextField("");
        JLabel title = new JLabel("PANEL");
        JLabel information1 = new JLabel("RESULT");
        JLabel information2 = new JLabel("NUMBER");
        JLabel information3 = new JLabel("SIGNAL");
        JLabel information4 = new JLabel("NUMBER");

        /*-----------------------Design----------------------*/
        title.setFont(new Font("Segoe UI", 1, 14));
        information1.setFont(new Font("Segoe UI", 0, 10));
        information2.setFont(new Font("Segoe UI", 0, 10));
        information3.setFont(new Font("Segoe UI", 1, 10));
        information4.setFont(new Font("Segoe UI", 0, 10));
        number1.setHorizontalAlignment(JTextField.CENTER);
        number2.setHorizontalAlignment(JTextField.CENTER);
        signal.setHorizontalAlignment(JTextField.CENTER);
        space.setHorizontalAlignment(JTextField.RIGHT);
        
        GroupLayout layout = new GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(title))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(information1, GroupLayout.Alignment.LEADING)
                            .addComponent(space, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(information2)
                                .addGap(18, 18, 18))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(number2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(information3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(information4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signal, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(information2)
                    .addComponent(information4)
                    .addComponent(information3)
                    .addComponent(information1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(number1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(signal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(space, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button)
                .addContainerGap())
        );
            pack();

        /*------------------------Body-----------------------*/
        new Script(button, number1, number2, signal, space);
    }   
}
