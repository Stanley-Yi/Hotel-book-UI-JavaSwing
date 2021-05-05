import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class login_frame {

    public login_frame() {
        JFrame frame = new JFrame("Hotel Book System");
        // Setting the width and height of frame

        ImageIcon background = new ImageIcon("img/background.jpg");// 背景图片
        JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面

        label.setBounds(0, 0, 600, 400);

        JPanel imagePanel = (JPanel) frame.getContentPane();
        imagePanel.setOpaque(false);

        imagePanel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setForeground(Color.white);
        userLabel.setBounds(200,150,100,25);
        imagePanel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(300,150,165,25);
        imagePanel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(200,200,80,25);
        imagePanel.add(passwordLabel);

        /*
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(300,200,165,25);
        imagePanel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(380, 280, 80, 25);
        imagePanel.add(loginButton);

        JButton RegisterButton = new JButton("register");
        RegisterButton.setBounds(220, 280, 80, 25);
        imagePanel.add(RegisterButton);

        frame.getLayeredPane().setLayout(null);

        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
