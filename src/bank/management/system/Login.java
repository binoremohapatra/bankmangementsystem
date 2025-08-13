package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField password;
    JButton button1, button2, button3;

    public Login() {
        super("Bank Management System");
        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);

        // Background image: must be added first so it stays at back
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/bank bacground.png"));
        Image bgImg = bgIcon.getImage().getScaledInstance(850, 480, Image.SCALE_SMOOTH);
        JLabel bgLabel = new JLabel(new ImageIcon(bgImg));
        bgLabel.setBounds(0, 0, 850, 480);
        add(bgLabel);

        // Bank logo at top left
        ImageIcon bankIcon = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image bankImg = bankIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JLabel bankLabel = new JLabel(new ImageIcon(bankImg));
        bankLabel.setBounds(30, 20, 80, 80);
        bgLabel.add(bankLabel);

        // Card logo near form
        ImageIcon cardIcon = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image cardImg = cardIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        JLabel cardLabel = new JLabel(new ImageIcon(cardImg));
        cardLabel.setBounds(630, 40, 40, 40);
        bgLabel.add(cardLabel);

        // User icon beside card field
        ImageIcon userIcon = new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
        Image userImg = userIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        JLabel userLabel = new JLabel(new ImageIcon(userImg));
        userLabel.setBounds(170, 190, 30, 30);
        bgLabel.add(userLabel);

        // Lock icon beside pin field
        ImageIcon lockIcon = new ImageIcon(ClassLoader.getSystemResource("icons/lock.png"));
        Image lockImg = lockIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        JLabel lockLabel = new JLabel(new ImageIcon(lockImg));
        lockLabel.setBounds(170, 250, 30, 30);
        bgLabel.add(lockLabel);

        label1 = new JLabel("WELCOME TO APNA BANK");
        label1.setFont(new Font("AvantGarde", Font.BOLD, 28));
        label1.setBounds(230, 100, 450, 40);
        label1.setForeground(Color.WHITE);
        bgLabel.add(label1);

        label2 = new JLabel("Card No");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(210, 190, 130, 30);
        bgLabel.add(label2);

        textField2 = new JTextField(20);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 20));
        textField2.setForeground(Color.BLACK);
        bgLabel.add(textField2);

        label3 = new JLabel("Pin");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(210, 250, 80, 30);
        bgLabel.add(label3);

        password = new JPasswordField(20);
        password.setFont(new Font("Arial", Font.BOLD, 20));
        password.setForeground(Color.BLACK);
        password.setBounds(325, 250, 230, 30);
        bgLabel.add(password);

        button1 = new JButton("Sign in");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(325, 300, 100, 30);
        button1.addActionListener(this);
        bgLabel.add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBounds(455, 300, 100, 30);
        button2.addActionListener(this);
        bgLabel.add(button2);

        button3 = new JButton("Login");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBounds(325, 350, 230, 30);
        button3.addActionListener(this);
        bgLabel.add(button3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button2) {
                textField2.setText("");
                password.setText("");
            } else if (e.getSource() == button3 || e.getSource() == button1) {
                JOptionPane.showMessageDialog(this, "Login functionality not implemented yet.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
