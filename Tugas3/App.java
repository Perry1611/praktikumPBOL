import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menggunakan CardLayout untuk dua tampilan
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Sign Up
        JPanel signUpPanel = new JPanel(new GridLayout(6, 1)); // gridlayout agar tampilan mudah dibagi

        // Panel 1: Judul Sign Up
        JPanel panel1 = new JPanel();
        JLabel judul = new JLabel("Sign Up");
        judul.setFont(new Font("Arial", Font.BOLD, 24));
        judul.setForeground(Color.BLUE);
        panel1.add(judul);
        signUpPanel.add(panel1);

        // Panel 2: Input nama
        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        panel2.setBorder(BorderFactory.createEmptyBorder(5, 25, 5, 25)); //padding
        JLabel fullNameLabel = new JLabel("Full Name");
        JTextField fullNameField = new JTextField(20);
        panel2.add(fullNameLabel);
        panel2.add(fullNameField);
        signUpPanel.add(panel2);

        // Panel 3: Input Email
        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        panel3.setBorder(BorderFactory.createEmptyBorder(5, 25, 5, 25));
        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField(20);
        panel3.add(emailLabel);
        panel3.add(emailField);
        signUpPanel.add(panel3);

        // Panel 4: Input Password
        JPanel panel4 = new JPanel(new GridLayout(2, 1));
        panel4.setBorder(BorderFactory.createEmptyBorder(5, 25, 5, 25));
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);
        panel4.add(passwordLabel);
        panel4.add(passwordField);
        signUpPanel.add(panel4);

        // Panel 5: Tombol Sign Up
        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(Color.BLUE);
        panel5.add(signUpButton);
        signUpPanel.add(panel5);

        // Panel 6: Teks dan Tombol Login
        JPanel panel6 = new JPanel(new FlowLayout());
        JLabel label2 = new JLabel("Have an account?");
        JButton loginButton = new JButton("Login");
        loginButton.setForeground(Color.RED);
        panel6.add(label2);
        panel6.add(loginButton);
        signUpPanel.add(panel6);

        // Login
        JPanel loginPanel = new JPanel(new GridLayout(5, 1));

        // Panel 1: Judul Login
        JPanel panelJudul = new JPanel();
        JLabel loginTitle = new JLabel("Login");
        loginTitle.setFont(new Font("Arial", Font.BOLD, 24));
        loginTitle.setForeground(Color.BLUE);
        panelJudul.add(loginTitle);
        loginPanel.add(panelJudul);

        // Panel 2: Input Email
        JPanel panelEmail = new JPanel(new GridLayout(2, 1));
        panelEmail.setBorder(BorderFactory.createEmptyBorder(5, 25, 5, 25));
        JLabel labelEmail = new JLabel("Email");
        JTextField loginEmailField = new JTextField(20);
        panelEmail.add(labelEmail);
        panelEmail.add(loginEmailField);
        loginPanel.add(panelEmail);

        // Panel 3: Input Password
        JPanel loginPassPanel = new JPanel(new GridLayout(2, 1));
        loginPassPanel.setBorder(BorderFactory.createEmptyBorder(5, 25, 5, 25));
        JLabel loginPasswordLabel = new JLabel("Password");
        JPasswordField loginPasswordField = new JPasswordField(20);
        loginPassPanel.add(loginPasswordLabel);
        loginPassPanel.add(loginPasswordField);
        loginPanel.add(loginPassPanel);

        // Panel 4: Tombol Login
        JPanel loginButtonPanel = new JPanel(new FlowLayout());
        JButton loginSubmitButton = new JButton("Login");
        loginSubmitButton.setForeground(Color.WHITE);
        loginSubmitButton.setBackground(Color.BLUE);
        loginButtonPanel.add(loginSubmitButton);
        loginPanel.add(loginButtonPanel);

        // Pamel 5: Teks dan Tombol Sign Up
        JPanel backSignUpPanel = new JPanel(new FlowLayout());
        JLabel noAccountLabel = new JLabel("Don't have an account?");
        JButton backSignUpButton = new JButton("Sign Up");
        backSignUpButton.setForeground(Color.RED);
        backSignUpPanel.add(noAccountLabel);
        backSignUpPanel.add(backSignUpButton);
        loginPanel.add(backSignUpPanel);

        // Tambahkan kedua panel ke CardLayout
        mainPanel.add(signUpPanel, "SignUpPanel");
        mainPanel.add(loginPanel, "LoginPanel");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "LoginPanel");
            }
        });
        backSignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "SignUpPanel");
            }
        });
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
