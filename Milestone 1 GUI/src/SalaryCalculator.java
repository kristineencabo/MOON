import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SalaryCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Salary Calculator");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel userLabel = new JLabel("Employee Name");
        userLabel.setBounds(50, 40, 120, 25);
        panel.add(userLabel);

        JTextField employeeName = new JTextField(20);
        employeeName.setBounds(170, 40, 195, 25);
        panel.add(employeeName);

        JLabel lblESalary = new JLabel("Enter your Salary");
        lblESalary.setBounds(50, 80, 120, 25);
        panel.add(lblESalary);

        JTextField txtESalary = new JTextField();
        txtESalary.setBounds(170, 80, 195, 25);
        panel.add(txtESalary);

        JLabel lblTax = new JLabel("Tax");
        lblTax.setBounds(50, 120, 120, 25);
        panel.add(lblTax);

        JTextField txtTax = new JTextField();
        txtTax.setBounds(170, 120, 195, 25);
        panel.add(txtTax);

        JLabel lblNet = new JLabel("Net");
        lblNet.setBounds(50, 160, 120, 25);
        panel.add(lblNet);

        JTextField txtNet = new JTextField();
        txtNet.setBounds(170, 160, 195, 25);
        panel.add(txtNet);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(390, 80, 120, 25);
        panel.add(btnCalculate);

        JLabel lblPhilHealth = new JLabel("PhilHealth Contribution:");
        lblPhilHealth.setBounds(50, 200, 150, 25);
        panel.add(lblPhilHealth);

        JTextField txtPhilHealth = new JTextField();
        txtPhilHealth.setBounds(210, 200, 155, 25);
        txtPhilHealth.setEditable(false);
        panel.add(txtPhilHealth);

        JLabel lblSSS = new JLabel("SSS Contribution:");
        lblSSS.setBounds(50, 240, 150, 25);
        panel.add(lblSSS);

        JTextField txtSSS = new JTextField();
        txtSSS.setBounds(210, 240, 155, 25);
        txtSSS.setEditable(false);
        panel.add(txtSSS);

        JLabel lblPagIbig = new JLabel("Pag-Ibig Contribution:");
        lblPagIbig.setBounds(50, 280, 150, 25);
        panel.add(lblPagIbig);

        JTextField txtPagIbig = new JTextField();
        txtPagIbig.setBounds(210, 280, 155, 25);
        txtPagIbig.setEditable(false);
        panel.add(txtPagIbig);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double basicSalary = Double.parseDouble(txtESalary.getText());
                double philhealth = philhealth(basicSalary);
                double sss = sss(basicSalary);
                double pagibig = pagibig(basicSalary);
                double deductions = sss + philhealth + pagibig;
                double taxableIncome = basicSalary - deductions;
                double tax = tax(taxableIncome);
                double net = basicSalary - tax - deductions;
                txtPhilHealth.setText(String.format("%.2f", philhealth));
                txtNet.setText(String.format("%.2f", net));

                // SSS calculation
                if (basicSalary > 24750) {
                    sss = 1125;
                } else if (basicSalary >= 24250 && basicSalary <= 24750) {
                    sss = 1102.50;
                } else if (basicSalary >= 23750 && basicSalary <= 24250) {
                    sss = 1080.00;
                } else if (basicSalary >= 23250 && basicSalary <= 23750) {
                    sss = 1057.50;
                } else if (basicSalary >= 22750 && basicSalary <= 23250) {
                    sss = 1035.00;
                } else if (basicSalary >= 22250 && basicSalary <= 22750) {
                    sss = 1012.50;
                } else if (basicSalary >= 21750 && basicSalary <= 22250) {
                    sss = 990.00;
                } else if (basicSalary >= 21250 && basicSalary <= 21750) {
                    sss = 967.50;
                } else if (basicSalary >= 20750 && basicSalary <= 21250) {
                    sss = 945.00;
                } else if (basicSalary >= 20250 && basicSalary <= 20750) {
                    sss = 922.50;
                } else if (basicSalary >= 19750 && basicSalary <= 20250) {
                    sss = 900.00;
                }
                txtSSS.setText(String.format("%.2f", sss));

                // PhilHealth Calculation
                txtPhilHealth.setText(String.format("%.2f", philhealth));

                // Pag-Ibig calculation
                double pagIbig = 0;
                if (basicSalary == 1000 && basicSalary <= 1500) {
                    pagIbig = basicSalary * 0.01;
                } else if (basicSalary > 1500) {
                    pagIbig = basicSalary * 0.02;
                }

                if (pagIbig > 100) {
                    pagIbig = 100;
                }



                if(basicSalary > 3250 && basicSalary <= 3750)
                {
                    tax = basicSalary * 0.05;
                } else if (basicSalary > 3750 && basicSalary <= 4250)
                {
                    tax = basicSalary * 0.06;
                } else if (basicSalary > 4250 && basicSalary <= 4750)
                {
                    tax = basicSalary * 0.07;
                } else if (basicSalary > 4750 && basicSalary <= 5250)
                {
                    tax = basicSalary * 0.08;
                } else if (basicSalary > 5250 && basicSalary <= 5750)
                {
                    tax = basicSalary * 0.09;
                } else if (basicSalary > 5750 && basicSalary <= 6250)
                {
                    tax = basicSalary * 0.10;
                } else if (basicSalary > 6250 && basicSalary <= 6750)
                {
                    tax = basicSalary * 0.11;
                } else if (basicSalary > 6750)
                {
                    tax = basicSalary * 0.12;
                }

                txtTax.setText(String.format("%.2f", tax));
                net = basicSalary - tax;
                txtNet.setText(String.format("%.2f", net));
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static double sss(double basicSalary) {
        if (basicSalary > 24750) {
            return 1125;
        } else if (basicSalary >= 24250 && basicSalary <= 24750) {
            return 1102.50;
        } else if (basicSalary >= 23750 && basicSalary <= 24250) {
            return 1080.00;
        } else if (basicSalary >= 23250 && basicSalary <= 23750) {
            return 1057.50;
        } else if (basicSalary >= 22750 && basicSalary <= 23250) {
            return 1035.00;
        } else if (basicSalary >= 22250 && basicSalary <= 22750) {
            return 1012.50;
        } else if (basicSalary >= 21750 && basicSalary <= 22250) {
            return 990.00;
        } else if (basicSalary >= 21250 && basicSalary <= 21750) {
            return 967.50;
        } else if (basicSalary >= 20750 && basicSalary <= 21250) {
            return 945.00;
        } else if (basicSalary >= 20250 && basicSalary <= 20750) {
            return 922.50;
        } else if (basicSalary >= 19750 && basicSalary <= 20250) {
            return 900.00;
        } else {
            return 0.0;
        }
    }


    private static double pagibig(double salary) {
        if (salary >= 1000 && salary <= 1500) {
            return salary * 0.01;
        } else if (salary > 1500) {
            double pagibig = salary * 0.02;
            if (pagibig > 100) {
                pagibig = 100;
            }
            return pagibig;
        } else {
            return 0.0;
        }
    }

    private static double tax(double taxableIncome) {
        if(taxableIncome > 0 && taxableIncome <= 250000) {
            return 0.0;
        } else if(taxableIncome > 250000 && taxableIncome <= 400000) {
            return (taxableIncome - 250000) * 0.2;
        } else if(taxableIncome > 400000 && taxableIncome <= 800000) {
            return 30000 + (taxableIncome - 400000) * 0.25;
        } else if(taxableIncome > 800000 && taxableIncome <= 2000000) {
            return 130000 + (taxableIncome - 800000) * 0.3;
        } else if(taxableIncome > 2000000 && taxableIncome <= 8000000) {
            return 490000 + (taxableIncome - 2000000) * 0.32;
        } else if(taxableIncome > 8000000) {
            return 2410000 + (taxableIncome - 8000000) * 0.35;
        } else {
            return 0.0;
        }
    }

    private static double philhealth(double salary) {
        return (salary * 0.03) / 2;
    }
}