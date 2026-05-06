import javax.swing.*;
import java.awt.event.*;

public class ReportCards extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;

    JTextField t1, t2, t3, t4;

    JButton b;

    public ReportCards() {

        // Labels
        l1 = new JLabel("Enter Name");
        l2 = new JLabel("Enter Math Marks");
        l3 = new JLabel("Enter Science Marks");
        l4 = new JLabel("Enter English Marks");

        // TextFields
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);

        // Button
        b = new JButton("Submit");

        // Layout
        setLayout(null);

        // Set positions
        l1.setBounds(30, 30, 150, 20);
        t1.setBounds(180, 30, 100, 20);
        
        l2.setBounds(30, 70, 150, 20);
        t2.setBounds(180, 70, 100, 20);

        l3.setBounds(30, 110, 150, 20);
        t3.setBounds(180, 110, 100, 20);

        l4.setBounds(30, 150, 150, 20);
        t4.setBounds(180, 150, 100, 20);

        b.setBounds(100, 200, 100, 30);

        // Add components
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(b);

        // Button event
        b.addActionListener(this);

        // Frame settings
        setTitle("Report Card");
        setSize(350, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Button Click Event
    public void actionPerformed(ActionEvent e) {

        String name = t1.getText();

        int m1 = Integer.parseInt(t2.getText());
        int m2 = Integer.parseInt(t3.getText());
        int m3 = Integer.parseInt(t4.getText());

        int total = m1 + m2 + m3;

        float avg = (float) total / 3;

        // Result Window
        JFrame result = new JFrame("Result");

        JLabel r1 = new JLabel("Name: " + name);
        JLabel r2 = new JLabel("Total: " + total);
        JLabel r3 = new JLabel("Average: " + avg);

        result.setLayout(null);

        r1.setBounds(30, 30, 200, 20);
        r2.setBounds(30, 70, 200, 20);
        r3.setBounds(30, 110, 200, 20);

        result.add(r1);
        result.add(r2);
        result.add(r3);

        result.setSize(300, 250);
        result.setVisible(true);
    }

    public static void main(String[] args) {

        new ReportCards();

    }
}
