package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EQSolver extends JFrame {
    private JTextArea textAval;
    private JTextArea textBval;
    private JTextArea textCval;
    private JButton calculateButton;
    private JTextPane Answers;
    private JTextPane description;
    private JPanel topPanel;
    private JLabel headerLabel;
    private JPanel mainPanel;

    public EQSolver() {
        super("Quadratic equation Solver");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //getting the values
                int valueA = Integer.parseInt(textAval.getText());
                int valueB = Integer.parseInt(textBval.getText());
                int valueC = Integer.parseInt(textCval.getText());
                //assigning to the equation
                Equations equation = new Equations(valueA,valueB,valueC);
                //setting the solutions
                String solution ="x1 = "+ Double.toString(equation.getSolution1(valueA,valueB,valueC))+"\n"+"x2 = "+Double.toString(equation.getSolution2(valueA,valueB,valueC))+"\nDelta value = "+Integer.toString(equation.deltaValue);
                Answers.setText(solution);
                //setting the description
                description.setText(equation.calculatingDelta(valueA,valueB,valueC));
            }
        });
    }
}
