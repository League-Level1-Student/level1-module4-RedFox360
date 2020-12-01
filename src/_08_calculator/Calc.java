package _08_calculator;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc implements ActionListener {
    private JFrame f = new JFrame();
    private JPanel p = new JPanel();
    private JLabel l;
    private JTextField tf1 = new JTextField(), tf2 = new JTextField();
    private JButton mul = new JButton("mul"), div = new JButton("div"), plus = new JButton("plus"),
            minus = new JButton("minus"), exp = new JButton("exp");

    public void visualCalc() {
        l = new JLabel("", JLabel.CENTER);
        tf1.setPreferredSize(new Dimension(200, 20));
        tf2.setPreferredSize(new Dimension(200, 20));
        f.setPreferredSize(new Dimension(450, 150));
        l.setFont(new Font("Consolas", Font.PLAIN, 20));
        l.setPreferredSize(new Dimension(400, 40));
        p.add(tf1);
        p.add(tf2);
        p.add(mul);
        p.add(div);
        p.add(plus);
        p.add(minus);
        p.add(exp);
        p.add(l);
        f.add(p);
        f.setVisible(true);
        f.pack();
        mul.addActionListener(this);
        div.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        exp.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mul) {
            l.setText("" + Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText()));
        }
        if (ae.getSource() == div) {
            l.setText("" + Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText()));
        }
        if (ae.getSource() == plus) {
            double plus = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
            l.setText("" + plus);
        }
        if (ae.getSource() == minus) {
            double minus = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
            l.setText("" + minus);
        }
        if (ae.getSource() == exp) {
            l.setText("" + Math.pow(Double.parseDouble(tf1.getText()), Double.parseDouble(tf2.getText())));
        }
    }
    double factorial(double a) {
        double runner = a;
        double forRunner = a - 1;
        for (long j = 0; j < forRunner - 1; j++) {
            runner -= 1;
            a *= runner;
        }
        return a;
    }
    double pow(double a, double b){
        return Math.pow(a, b);
    }
   
}
