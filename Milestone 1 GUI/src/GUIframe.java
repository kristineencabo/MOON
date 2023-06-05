
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIframe {

    private static JLabel userLabel;
    private static JLabel positionLabel;
    private static JTextField userText;
    private static JTextField positionText;
    private static JButton button;
    private static JLabel birthdayLabel;
    private static JTextField birthdayText;
    private static JLabel sssNumberLabel;
    private static JTextField sssNumberText;
    private static JLabel philhealthNumberLabel;
    private static JTextField philhealthNumberText;
    private static JLabel pagibigNumberLabel;
    private static JTextField pagibigNumberText;
    private static JLabel tinNumberLabel;
    private static JTextField tinNumberText;
    private static JLabel profileLabel;
    private static JLabel timeInLabel;
    private static JTextField timeInText;
    private static JLabel timeOutLabel;
    private static JTextField timeOutText;
    private static JLabel workingHoursLabel;
    private static JLabel weeklySalaryLabel;
    private static JLabel basicSalaryLabel;
    private static JLabel sssLabel;
    private static JLabel philhealthLabel;
    private static JLabel pagibigLabel;
    private static JLabel tinLabel;
    private static JLabel taxIncomeLabel;
    private static JLabel witHoldingTaxLabel;
    private static JLabel netSalaryLabel;
    private static JTextField workingHoursText;
    private static JTextField weeklySalaryText;
    private static JTextField basicSalaryText;
    private static JTextField sssText;
    private static JTextField philhealthText;
    private static JTextField pagibigText;
    private static JTextField tinText;
    private static JTextField taxIncomeText;
    private static JTextField witHoldingTaxText;
    private static JTextField netSalaryText;
    private static JLabel payrollLabel;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        profileLabel = new JLabel("EMPLOYEE DETAILS");
        profileLabel.setBounds(20, 10, 80, 25);
        panel.add(profileLabel);

        userLabel = new JLabel("User:");
        userLabel.setBounds(120, 40, 80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(180, 40, 165, 25);
        panel.add(userText);

        button = new JButton("Click to Add Photo");
        button.setBounds(10, 40, 90, 90);
        panel.add(button);

        positionLabel = new JLabel("Position:");
        positionLabel.setBounds(120, 80, 80,25);
        panel.add(positionLabel);

        positionText = new JTextField(20);
        positionText.setBounds(180, 80, 165, 25);
        panel.add(positionText);

        birthdayLabel = new JLabel("Birthday:");
        birthdayLabel.setBounds(120, 120, 80,25);
        panel.add(birthdayLabel);

        birthdayText = new JTextField(20);
        birthdayText.setBounds(180, 120, 165, 25);
        panel.add(birthdayText);

        sssNumberLabel = new JLabel("sssNumber:");
        sssNumberLabel.setBounds(100, 160, 80, 25);
        panel.add(sssNumberLabel);

        sssNumberText = new JTextField(20);
        sssNumberText.setBounds(180, 160, 165, 25);
        panel.add(sssNumberText);

        philhealthNumberLabel = new JLabel("philhealthNumber:");
        philhealthNumberLabel.setBounds(100, 200, 80, 25);
        panel.add(philhealthNumberLabel);

        philhealthNumberText = new JTextField(20);
        philhealthNumberText.setBounds(180, 200, 165, 25);
        panel.add(philhealthNumberText);

        pagibigNumberLabel = new JLabel("pagibigNumber:");
        pagibigNumberLabel.setBounds(100, 240, 80, 25);
        panel.add(pagibigNumberLabel);

        pagibigNumberText = new JTextField(20);
        pagibigNumberText.setBounds(180, 240, 165, 25);
        panel.add(pagibigNumberText);

        tinNumberLabel = new JLabel("tinNumber:");
        tinNumberLabel.setBounds(100, 280, 80, 25);
        panel.add(tinNumberLabel);

        tinNumberText = new JTextField(20);
        tinNumberText.setBounds(180, 280, 165, 25);
        panel.add(tinNumberText);

        payrollLabel = new JLabel("PAYROLL:");
        payrollLabel.setBounds(20, 350, 80, 25);
        panel.add(payrollLabel);

        timeInLabel = new JLabel("Time In:");
        timeInLabel.setBounds(40, 380, 80, 25);
        panel.add(timeInLabel);

        timeInText = new JTextField(20);
        timeInText.setBounds(130, 380, 165, 25);
        panel.add(timeInText);

        timeOutLabel = new JLabel("Time Out:");
        timeOutLabel.setBounds(40, 410, 80, 25);
        panel.add(timeOutLabel);

        timeOutText = new JTextField(20);
        timeOutText.setBounds(130, 410, 165, 25);
        panel.add(timeOutText);

        workingHoursLabel = new JLabel("Working Hours:");
        workingHoursLabel.setBounds(40, 440, 80, 25);
        panel.add(workingHoursLabel);

        workingHoursText = new JTextField(20);
        workingHoursText.setBounds(130, 440, 165, 25);
        panel.add(workingHoursText);

        weeklySalaryLabel = new JLabel("Weekly Salary:");
        weeklySalaryLabel.setBounds(40, 470, 80, 25);
        panel.add(weeklySalaryLabel);

        weeklySalaryText = new JTextField(20);
        weeklySalaryText.setBounds(130, 470, 165, 25);
        panel.add(weeklySalaryText);

        basicSalaryLabel = new JLabel("Basic Salary:");
        basicSalaryLabel.setBounds(40, 500, 80, 25);
        panel.add(basicSalaryLabel);

        basicSalaryText = new JTextField(20);
        basicSalaryText.setBounds(130, 500, 165, 25);
        panel.add(basicSalaryText);

        sssLabel = new JLabel("SSS:");
        sssLabel.setBounds(40, 530, 80, 25);
        panel.add(sssLabel);

        sssText = new JTextField(20);
        sssText.setBounds(130, 530, 165, 25);
        panel.add(sssText);

        philhealthLabel = new JLabel("Philhealth:");
        philhealthLabel.setBounds(40, 560, 80, 25);
        panel.add(philhealthLabel);

        philhealthText = new JTextField(20);
        philhealthText.setBounds(130, 560, 165, 25);
        panel.add(philhealthText);

        pagibigLabel = new JLabel("Pag ibig:");
        pagibigLabel.setBounds(350, 380, 80, 25);
        panel.add(pagibigLabel);

        pagibigText = new JTextField(20);
        pagibigText.setBounds(450, 380, 165, 25);
        panel.add(pagibigText);

        tinLabel = new JLabel("TIN:");
        tinLabel.setBounds(350, 410, 80, 25);
        panel.add(tinLabel);

        tinText = new JTextField(20);
        tinText.setBounds(450, 410, 165, 25);
        panel.add(tinText);

        taxIncomeLabel = new JLabel("Tax Income:");
        taxIncomeLabel.setBounds(350, 440, 80, 25);
        panel.add(taxIncomeLabel);

        taxIncomeText = new JTextField(20);
        taxIncomeText.setBounds(450, 440, 165, 25);
        panel.add(taxIncomeText);

        witHoldingTaxLabel = new JLabel("Witholding Tax:");
        witHoldingTaxLabel.setBounds(350, 470, 80, 25);
        panel.add(witHoldingTaxLabel);

        witHoldingTaxText = new JTextField(20);
        witHoldingTaxText.setBounds(450, 470, 165, 25);
        panel.add(witHoldingTaxText);

        netSalaryLabel = new JLabel("Net Salary:");
        netSalaryLabel.setBounds(350, 500, 80, 25);
        panel.add(netSalaryLabel);

        netSalaryText = new JTextField(20);
        netSalaryText.setBounds(450, 500, 165, 25);
        panel.add(netSalaryText);
    }

}
