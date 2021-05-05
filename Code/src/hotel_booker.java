import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class hotel_booker {

    static JButton loginButton = new JButton("login");
    static JButton RegisterButton = new JButton("register");

    static JButton booklogoutButton = new JButton("log out");
    static JButton bookuserButton = new JButton("user");
    static JButton bookconfirmButton = new JButton("confirm");
    static JButton bookresetButton = new JButton("reset");

    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Hotel Book System");

        ImageIcon background = new ImageIcon("img/background.jpg");// 背景图片
        JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面

        label.setBounds(0, 0, 600, 500);

        JPanel loginPanel = (JPanel) frame.getContentPane();
        loginPanel.setOpaque(false);

        loginPanel.setLayout(new FlowLayout());

        JPanel bookPanel = (JPanel) frame.getContentPane();
        JPanel registerPanel = (JPanel) frame.getContentPane();
        JPanel userPanel = (JPanel) frame.getContentPane();

        login(loginPanel);
        loginPanel.setVisible(true);

        frame.getLayeredPane().setLayout(null);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPanel.setVisible(false);
                loginPanel.removeAll();

                bookPanel.setOpaque(false);
                bookPanel.setLayout(new FlowLayout());
                book(bookPanel);
                bookPanel.setVisible(true);
            }
        });

        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPanel.setVisible(false);
                loginPanel.removeAll();

                registerPanel.setOpaque(false);
                registerPanel.setLayout(new FlowLayout());
                register(registerPanel);
                registerPanel.setVisible(true);
            }
        });

        booklogoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookPanel.setVisible(false);
                bookPanel.removeAll();

                loginPanel.setOpaque(false);
                loginPanel.setLayout(new FlowLayout());
                login(loginPanel);
                loginPanel.setVisible(true);
            }
        });

        bookresetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookPanel.setVisible(false);
                bookPanel.removeAll();

                bookPanel.setOpaque(false);
                bookPanel.setLayout(new FlowLayout());
                book(bookPanel);
                bookPanel.setVisible(true);
            }
        });

        bookuserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookPanel.setVisible(false);
                bookPanel.removeAll();

                userPanel.setOpaque(false);
                userPanel.setLayout(new FlowLayout());
                user(userPanel);
                userPanel.setVisible(true);
            }
        });


        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        frame.setBounds((width - 600) / 2, (height - 500) / 2, 600, 500);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private static void login(JPanel panel) {
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome   to   using");
        welcomeLabel.setFont(new Font("Edwardian Script ITC", Font.ITALIC, 50));
        welcomeLabel.setForeground(Color.white);
        welcomeLabel.setBounds(30,40,600,60);
        panel.add(welcomeLabel);

        JLabel systemLabel = new JLabel("Hotel   Book   System");
        systemLabel.setFont(new Font("Edwardian Script ITC", Font.ITALIC, 50));
        systemLabel.setForeground(Color.white);
        systemLabel.setBounds(190,110,600,60);
        panel.add(systemLabel);


        JLabel userLabel = new JLabel("User:");
        userLabel.setForeground(Color.white);
        userLabel.setBounds(200,200,100,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(300,200,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(200,250,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(300,250,165,25);
        panel.add(passwordText);


        JLabel servLabel = new JLabel("24h Service Hotline:");
        servLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
        servLabel.setForeground(Color.white);
        servLabel.setBounds(30,210,120,50);
        panel.add(servLabel);

        JLabel servPhoneLabel = new JLabel("010-98710403");
        servPhoneLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
        servPhoneLabel.setForeground(Color.white);
        servPhoneLabel.setBounds(30,230,120,50);
        panel.add(servPhoneLabel);

        JLabel reportLabel = new JLabel("Complaints Hotline");
        reportLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
        reportLabel.setForeground(Color.white);
        reportLabel.setBounds(30,260,120,50);
        panel.add(reportLabel);

        JLabel reportPhoneLabel = new JLabel("010-11001200");
        reportPhoneLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
        reportPhoneLabel.setForeground(Color.white);
        reportPhoneLabel.setBounds(30,280,120,50);
        panel.add(reportPhoneLabel);


        loginButton.setBounds(380, 330, 80, 25);
        panel.add(loginButton);

        RegisterButton.setBounds(220, 330, 80, 25);
        panel.add(RegisterButton);

    }

    private static void register(JPanel panel) {
        panel.setLayout(null);


    }

    private static void book(JPanel panel) {
        panel.setLayout(null);

        JPanel mapPanel = new JPanel();
        mapPanel.setBounds(30,100,240,300);
        panel.add(mapPanel);

        QuoteBasisPhotoUtils photo = new QuoteBasisPhotoUtils("img/background.jpg");

        MyComponent component=new MyComponent();
        component.setBounds(60,40,470,20);
        component.setArrText(new String []{"Welcome to using Hotel Book System!",
                                            "The COVID-19 epidemic is raging, please wear masks when entering and exiting, pay attention to safe social distancing, and strengthen protective measures"
                                            });
        panel.add(component);

        booklogoutButton.setBounds(0, 0, 80, 25);
        panel.add(booklogoutButton);

        bookuserButton.setBounds(505, 0, 80, 25);
        panel.add(bookuserButton);

        bookconfirmButton.setBounds(330, 375, 80, 25);
        panel.add(bookconfirmButton);

        bookresetButton.setBounds(460, 375, 80, 25);
        panel.add(bookresetButton);

    }

    private static void user(JPanel panel) {
        panel.setLayout(null);


    }

}
