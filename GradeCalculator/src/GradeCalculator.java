import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradeCalculator extends JFrame implements ActionListener {
    private JTextField txtName, txtM1, txtM2, txtTA;
    private JLabel lblResult;

    public GradeCalculator() {
        setTitle("Grade Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        JLabel lblName = new JLabel("Name:");
        txtName = new JTextField();
        JLabel lblM1 = new JLabel("M1:");
        txtM1 = new JTextField();
        JLabel lblM2 = new JLabel("M2:");
        txtM2 = new JTextField();
        JLabel lblTA = new JLabel("TA:");
        txtTA = new JTextField();
        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);
        lblResult = new JLabel();

        add(lblName);
        add(txtName);
        add(lblM1);
        add(txtM1);
        add(lblM2);
        add(txtM2);
        add(lblTA);
        add(txtTA);
        add(btnCalculate);
        add(lblResult);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int M1 = Integer.parseInt(txtM1.getText());
            int M2 = Integer.parseInt(txtM2.getText());
            int TA = Integer.parseInt(txtTA.getText());

            int TotalAverage = M1 + M2 + TA;
            double Avg = (double) TotalAverage / 1;

            lblResult.setText("Total Average: " + TotalAverage + "\nAverage: " + Avg);
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GradeCalculator();
            }
        });
    }
}
