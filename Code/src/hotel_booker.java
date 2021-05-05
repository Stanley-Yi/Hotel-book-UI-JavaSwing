import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class hotel_booker {

    public static JButton loginButton;
    public static JButton RegisterButton;

    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Hotel Book System");
        // Setting the width and height of frame

        ImageIcon background = new ImageIcon("img/background.jpg");// 背景图片
        JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面

        label.setBounds(0, 0, 600, 500);

        JPanel loginPanel = (JPanel) frame.getContentPane();
        loginPanel.setOpaque(false);

        loginPanel.setLayout(new FlowLayout());

        login(loginPanel);

        frame.getLayeredPane().setLayout(null);

        JPanel bookPanel = (JPanel) frame.getContentPane();
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

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");
        userLabel.setForeground(Color.white);
        userLabel.setBounds(200,200,100,25);
        panel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
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

        JPanel reminderPanel = new JPanel();
        reminderPanel.setBounds(30,200,150,150);
        panel.add(reminderPanel);

        // 创建登录按钮
        loginButton = new JButton("login");
        loginButton.setBounds(380, 330, 80, 25);
        panel.add(loginButton);

        RegisterButton = new JButton("register");
        RegisterButton.setBounds(220, 330, 80, 25);
        panel.add(RegisterButton);

    }

    private static void book(JPanel panel) {

        panel.setLayout(null);


        // 创建 JLabel
        JLabel userLabel = new JLabel("asfsd:");
        userLabel.setForeground(Color.white);
        userLabel.setBounds(200,200,100,25);
        panel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(300,200,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("sdfsd:");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(200,250,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(300,250,165,25);
        panel.add(passwordText);

        JPanel reminderPanel = new JPanel();
        reminderPanel.setBounds(30,200,150,150);
        panel.add(reminderPanel);


    }

}
