package main.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    public Frame() {
        setLayout(null);
        setSize(600, 600);

        JTextField[] fields = createField();

        TextChangerAction action = new TextChangerAction(fields);

        JButton button = createButtonWithAction(action);

        addComponents(button, fields);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JTextField[] createField() {
        String[] text = {"one", "two", "three", "four", "five"};
        JTextField[] fields = new JTextField[5];

        for (int i = 0; i < 5; i++) {
            JTextField field = new JTextField(text[i]);
            field.setBounds(30, i * 40, 200, 30);

            fields[i] = field;
        }

        return fields;
    }

    private JButton createButtonWithAction(ActionListener actionListener) {
        JButton button = new JButton("Nyomj");
        button.setBounds(30, 300, 200, 30);
        button.addActionListener(actionListener);

        return button;
    }

    private void addComponents(Component component, Component... components) {
        add(component);
        for (Component c : components) {
            add(c);
        }
    }

}
