package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submitBtn, cancelBtn;
    String formno;

    // ---- Custom Panel for Background ----
    class ImageBackgroundPanel extends JPanel {
        private Image bgImage;

        public ImageBackgroundPanel(String imagePath) {
            bgImage = new ImageIcon(getClass().getResource(imagePath)).getImage();
            setLayout(null);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this); // scale image to fit
        }
    }

    public Signup3(String formno) {
        this.formno = formno;

        setTitle("APPLICATION FORM");

        // --- Use Background Panel ---
        ImageBackgroundPanel mainPanel = new ImageBackgroundPanel("/icons/backbg.png"); // Path for your image
        mainPanel.setPreferredSize(new Dimension(850, 1000));

        // Bank Icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        mainPanel.add(image);

        // Labels
        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        mainPanel.add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        mainPanel.add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        mainPanel.add(l3);

        // Radio buttons for Account Type
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setOpaque(false);
        r1.setBounds(100, 180, 150, 30);
        mainPanel.add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setOpaque(false);
        r2.setBounds(350, 180, 300, 30);
        mainPanel.add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setOpaque(false);
        r3.setBounds(100, 220, 250, 30);
        mainPanel.add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setOpaque(false);
        r4.setBounds(350, 220, 250, 30);
        mainPanel.add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        // Card number and pin labels
        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        mainPanel.add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 330, 200, 20);
        mainPanel.add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(330, 300, 250, 30);
        mainPanel.add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(330, 330, 500, 20);
        mainPanel.add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 370, 200, 30);
        mainPanel.add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(330, 370, 200, 30);
        mainPanel.add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100, 400, 200, 20);
        mainPanel.add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 450, 200, 30);
        mainPanel.add(l11);

        // Checkboxes for services
        c1 = new JCheckBox("ATM CARD");
        c1.setOpaque(false);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        mainPanel.add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setOpaque(false);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        mainPanel.add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setOpaque(false);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        mainPanel.add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setOpaque(false);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        mainPanel.add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setOpaque(false);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        mainPanel.add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setOpaque(false);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        mainPanel.add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setOpaque(false);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 20);
        mainPanel.add(c7);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        mainPanel.add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 100, 30);
        mainPanel.add(l13);

        // Buttons
        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("Raleway", Font.BOLD, 14));
        submitBtn.setBackground(Color.BLACK);
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setBounds(250, 720, 100, 30);
        submitBtn.addActionListener(this);
        mainPanel.add(submitBtn);

        cancelBtn = new JButton("Cancel");
        cancelBtn.setFont(new Font("Raleway", Font.BOLD, 14));
        cancelBtn.setBackground(Color.BLACK);
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setBounds(420, 720, 100, 30);
        cancelBtn.addActionListener(this);
        mainPanel.add(cancelBtn);

        // Scrollable Panel
        JScrollPane scrollPane = new JScrollPane(mainPanel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setContentPane(scrollPane);

        setSize(850, 800);
        setLocation(400, 20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected())
            atype = "Saving Account";
        else if (r2.isSelected())
            atype = "Fixed Deposit Account";
        else if (r3.isSelected())
            atype = "Current Account";
        else if (r4.isSelected())
            atype = "Recurring Deposit Account";

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        StringBuilder fac = new StringBuilder();
        if (c1.isSelected())
            fac.append("ATM CARD ");
        if (c2.isSelected())
            fac.append("Internet Banking ");
        if (c3.isSelected())
            fac.append("Mobile Banking ");
        if (c4.isSelected())
            fac.append("EMAIL Alerts ");
        if (c5.isSelected())
            fac.append("Cheque Book ");
        if (c6.isSelected())
            fac.append("E-Statement ");

        try {
            if (e.getSource() == submitBtn) {
                if (atype == null || atype.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                    return;
                }
                Connn c1 = new Connn();
                String q1 = "insert into signupthree values('" + formno + "', '" + atype + "','" + cardno + "','" + pin + "','" + fac.toString().trim() + "')";
                String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\n Pin : " + pin);
                new Deposit(pin);
                setVisible(false);
            } else if (e.getSource() == cancelBtn) {
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
