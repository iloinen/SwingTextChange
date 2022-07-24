package main.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextChangerAction implements ActionListener {

    private final JTextField[] fields;

    public TextChangerAction(JTextField[] fields) {
        this.fields = fields;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JTextField field : fields) {
            int random = (int) (Math.random() * fields.length);
            String temp = field.getText();
            field.setText(fields[random].getText());
            fields[random].setText(temp);
        }
    }

}
