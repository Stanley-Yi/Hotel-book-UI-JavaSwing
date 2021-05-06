import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class hotel_booker {

    static JButton loginButton = new JButton("login");
    static JButton RegisterButton = new JButton("register");

    static JButton booklogoutButton = new JButton("log out");
    static JButton bookuserButton = new JButton("user");
    static JButton bookconfirmButton = new JButton("confirm");
    static JButton bookresetButton = new JButton("reset");

    public static JButton SHANGRI_LA_hotel = new JButton(new ImageIcon("img/SHANGRI_LA_Icon.jpg"));
    public static JButton OrientalHotel = new JButton(new ImageIcon("img/Oriental_Icon.jpg"));
    public static JButton Benevolence = new JButton(new ImageIcon("img/Benevolence_Icon.jpg"));
    static int hotel;

    public static void main(String[] args) {
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
        JPanel confirmPanel = (JPanel) frame.getContentPane();

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

        bookconfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookPanel.setVisible(false);
                bookPanel.removeAll();

                confirmPanel.setOpaque(false);
                confirmPanel.setLayout(new FlowLayout());
                confirm(confirmPanel);
                confirmPanel.setVisible(true);
            }
        });

        frame.getLayeredPane().add(label, Integer.valueOf(Integer.MIN_VALUE));
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
        loginButton.setBackground(Color.decode("#FFEEDD"));
        panel.add(loginButton);

        RegisterButton.setBounds(220, 330, 80, 25);
        RegisterButton.setBackground(Color.decode("#FFEEDD"));
        panel.add(RegisterButton);

    }

    private static void register(JPanel panel) {
        panel.setLayout(null);

    }

    private static void book(JPanel panel) {
        panel.setLayout(null);

        hotel = 0;

        Dimension frameSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize.width = frameSize.width / 2;
        frameSize.height = frameSize.height / 4;
        String file = "img/map.jpg";

        ZoomPanel zp = new ZoomPanel(frameSize, file);
        zp.setBounds(30,100,240,300);
        panel.add(zp);

        panel.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                // 滚轮向前滑动 放大
                if (e.getWheelRotation() < 0) {
                    zp.enlargeImg();
                } else if (e.getWheelRotation() > 0) {
                    zp.reduceImg();
                }
            }
        });

        MyComponent component=new MyComponent();
        component.setBackground(Color.decode("#FFEEDD"));
        component.setFont(new Font("Tahoma", Font.BOLD, 10));
        component.setBounds(60,40,470,20);
        component.setArrText(new String []{"Welcome to using Hotel Book System!",
                                           "The COVID-19 epidemic is raging, please wear masks when entering and exiting, pay attention to safe social distancing, and strengthen protective measures"
                                            });
        panel.add(component);

        booklogoutButton.setBounds(0, 0, 80, 25);
        booklogoutButton.setBackground(Color.white);
        panel.add(booklogoutButton);

        bookuserButton.setBounds(505, 0, 80, 25);
        bookuserButton.setBackground(Color.white);
        panel.add(bookuserButton);

        bookconfirmButton.setBounds(330, 375, 80, 25);
        bookconfirmButton.setBackground(Color.decode("#FFEEDD"));
        panel.add(bookconfirmButton);

        bookresetButton.setBounds(460, 375, 80, 25);
        bookresetButton.setBackground(Color.decode("#FFEEDD"));
        panel.add(bookresetButton);

        JLabel selectHotelLabel = new JLabel("Please select Hotel");
        selectHotelLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        selectHotelLabel.setForeground(Color.white);
        selectHotelLabel.setBounds(320,180,200,20);
        panel.add(selectHotelLabel);

        int[] roomNum = {1};
        JButton roomSub = new JButton("-");
        JButton roomPlus = new JButton("+");

        JPanel hotelInfoPanel = new JPanel();
        hotelInfoPanel.setBounds(295, 100, 280, 270);

        JLabel totalPriceLabel = new JLabel();
        JLabel numLabel = new JLabel();

        JLabel Calendar = new JLabel("Calendar");
        JTextField checkinText = new JTextField();
        JTextField checkoutText = new JTextField();

        CalendarPanel p = new CalendarPanel(checkinText, "yyyy/MM/dd");
        CalendarPanel p2 = new CalendarPanel(checkoutText, "yyyy/MM/dd");
        p.initCalendarPanel();
        p.add(Calendar);
        panel.add(p);
        p2.initCalendarPanel();
        p2.add(Calendar);
        panel.add(p2);

        SHANGRI_LA_hotel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectHotelLabel.setVisible(false);
                selectHotelLabel.removeAll();

                panel.add(hotelInfoPanel);
                hotel = 1;

                panel.setVisible(false);

                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText);

                panel.setVisible(true);
            }
        });

        roomSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);

                if (roomNum[0] - 1 <= 0) {
                    roomNum[0] = 0;
                } else {
                    roomNum[0] -= 1;
                }
                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText);
                panel.setVisible(true);
            }

        });

        roomPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);

                if (roomNum[0] + 1 > 30) {
                    roomNum[0] = 30;
                } else {
                    roomNum[0] += 1;
                }

                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText);
                panel.setVisible(true);
            }
        });

    }

    private static void hotelInfo(JPanel panel, JButton roomSub, JButton roomPlus, int roomNum, int hotel, JLabel totalPriceLabel, JLabel numLabel, JTextField checkinText, JTextField checkoutText) {
        panel.setLayout(null);

        String[] hotelInfo = new String[3];

        switch (hotel) {
            case 1:
                hotelInfo = new String[]{"Shangri-La Hotels & Resorts", "(86 21) 2203 8888", "1488"};
                break;

            case 2:
                hotelInfo = new String[]{"Oriental Hotel", "105 Penang Road, George Town, Penang 10000 Malaysia", "(86 64) 2849 6666", "528"};
                break;

            case 3:
                hotelInfo = new String[]{"Benevolence Hotel", "256 Xingye Avenue, Guangzhou, Guangzhou 511442 China", "(86 57) 7895 1568", "998"};
                break;
        }

        JLabel hotesdlNameLabel = new JLabel("Hotel Name:");
        hotesdlNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        hotesdlNameLabel.setForeground(Color.black);
        hotesdlNameLabel.setBounds(5,0,200,20);
        panel.add(hotesdlNameLabel);

        JLabel NameLabel = new JLabel(hotelInfo[0]);
        NameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        NameLabel.setForeground(Color.black);
        NameLabel.setBounds(5,22,250,20);
        panel.add(NameLabel);

        JLabel hotelAddressLabel = new JLabel("Hotel Address:");
        hotelAddressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        hotelAddressLabel.setForeground(Color.black);
        hotelAddressLabel.setBounds(5,44,200,20);
        panel.add(hotelAddressLabel);

        if (hotel == 1) {
            JLabel addressLabel = new JLabel("1218 Middle Yan'an Road, Jing An");  // Kerry Centre, West Nanjing Road, Shanghai 200040 China
            addressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel.setForeground(Color.black);
            addressLabel.setBounds(5, 66, 280, 20);
            panel.add(addressLabel);

            JLabel addressLabel_2 = new JLabel("Kerry Centre, Shanghai 200040 China");  // Kerry Centre, West Nanjing Road, Shanghai 200040 China
            addressLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel_2.setForeground(Color.black);
            addressLabel_2.setBounds(5, 88, 280, 20);
            panel.add(addressLabel_2);
        }

        JLabel contactNumberLabel = new JLabel("Contact Number: " + hotelInfo[1]);
        contactNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        contactNumberLabel.setForeground(Color.black);
        contactNumberLabel.setBounds(5,110,280,20);
        panel.add(contactNumberLabel);

        int price = Integer.parseInt(hotelInfo[2]);
        JLabel priceLabel = new JLabel("Price per night: $" + price);
        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        priceLabel.setForeground(Color.black);
        priceLabel.setBounds(5,132,280,20);
        panel.add(priceLabel);

        int day = 1;

        JLabel CheckinLabel = new JLabel("Check-in date:");
        CheckinLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        CheckinLabel.setForeground(Color.black);
        CheckinLabel.setBounds(5,154,140,20);
        panel.add(CheckinLabel);

        checkinText.setBounds(150, 155, 100, 20);
        panel.add(checkinText);

        JLabel CheckoutLabel = new JLabel("Check out date:");
        CheckoutLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        CheckoutLabel.setForeground(Color.black);
        CheckoutLabel.setBounds(5,176,160,20);
        panel.add(CheckoutLabel);

        checkoutText.setBounds(150, 176, 100, 20);
        panel.add(checkoutText);

        JLabel roomNumberLabel = new JLabel("Number of Rooms:");
        roomNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomNumberLabel.setForeground(Color.black);
        roomNumberLabel.setBounds(5,198,150,20);
        panel.add(roomNumberLabel);

        roomSub.setBounds(150,199,38,20);
        panel.add(roomSub);

        numLabel.setText("" + roomNum);
        numLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        numLabel.setForeground(Color.black);
        int loc = 201;
        if (roomNum > 9) {
            loc = 198;
        }
        numLabel.setBounds(loc,198,20,20);
        panel.add(numLabel);

        roomPlus.setBounds(225,199,41,20);
        panel.add(roomPlus);

        int ttp = price * roomNum * day;

        totalPriceLabel.setText("Total Price:"+" $"+ttp);
        totalPriceLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        totalPriceLabel.setForeground(Color.black);
        totalPriceLabel.setBounds(5,220,280,20);
        panel.add(totalPriceLabel);
    }

    private static void user(JPanel panel) {
        panel.setLayout(null);

    }

    private static void confirm(JPanel panel) {
        panel.setLayout(null);

    }

}

class ZoomPanel extends JPanel {

    JButton SHANGRI_LA_hotel = hotel_booker.SHANGRI_LA_hotel;
    JButton OrientalHotel = hotel_booker.OrientalHotel;
    JButton Benevolence = hotel_booker.Benevolence;

    private static final long serialVersionUID = 1L;
    private ImageIcon ii;
    private Dimension frameSize;
    private int x, y, width, height;// 图片的坐标、缩放的size

    public ZoomPanel(Dimension fs, String imgPath) {
        setToolTipText("Slide and Drag mouse to zoom in/out and move");
        this.frameSize = fs;

        ii = new ImageIcon(imgPath);

        width = 240;
        height = 300;
        setImgPos();

        SHANGRI_LA_hotel.setBounds(this.x + (width / 2), this.y + (height / 10), 30, 40);
        this.add(SHANGRI_LA_hotel);

        OrientalHotel.setBounds(this.x + (width / 3), this.y + (height / 4 * 3), 40, 42);
        this.add(OrientalHotel);

        Benevolence.setBounds(this.x + (width / 5 * 4), this.y + (height / 2), 40, 36);
        this.add(Benevolence);


        final int[] originX = new int[1];
        final int[] originY = new int[1];

        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                // 记录鼠标按下时的点
                originX[0] = e.getX();
                originY[0] = e.getY();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
                // 拖拽时移动
                int offsetX = e.getX() - originX[0];
                int offsetY = e.getY() - originY[0];

                moveImg(offsetX, offsetY);
            }
        });

    }

    // 设定x、y坐标
    public void setImgPos() {
        x = (frameSize.width - width) / 2 - 263;
        y = (frameSize.height - height) / 2 + 43;
    }

    // 放大
    public void enlargeImg() {
        if (width >= ii.getIconWidth() * 2) {
            return;
        }
        if (height >= ii.getIconHeight() * 2) {
            return;
        }

        width += width / 9;
        height += height / 9;

        setImgPos();

        repaint();

        SHANGRI_LA_hotel.setBounds(this.x + (width / 2), this.y + (height / 10), 30, 40);
        OrientalHotel.setBounds(this.x + (width / 3), this.y + (height / 4 * 3), 40, 42);
        Benevolence.setBounds(this.x + (width / 5 * 4), this.y + (height / 2), 40, 36);
    }

    // 缩小
    public void reduceImg() {
        if (width <= ii.getIconWidth() / 4) {
            return;
        }
        if (height <= ii.getIconHeight() / 4) {
            return;
        }

        width -= width / 10;
        height -= height / 10;

        setImgPos();

        repaint();

        SHANGRI_LA_hotel.setBounds(this.x + (width / 2), this.y + (height / 10), 30, 40);
        OrientalHotel.setBounds(this.x + (width / 3), this.y + (height / 4 * 3), 40, 42);
        Benevolence.setBounds(this.x + (width / 5 * 4), this.y + (height / 2), 40, 36);
    }

    public void moveImg(int offsetX, int offsetY) {
        offsetX /= 70;
        offsetY /= 70;

        if (this.x > 1) {
            this.x = 1;
        } else if (this.x + width < 240) {
            this.x = 240 - width;
        } else {
            this.x += offsetX;
        }

        if (this.y > 1) {
            this.y = 1;
        } else if (this.y + height < 300) {
            this.y = 300 - height;
        } else {
            this.y += offsetY;
        }

        repaint();

        SHANGRI_LA_hotel.setBounds(this.x + (width / 2), this.y + (height / 10), 30, 40);
        OrientalHotel.setBounds(this.x + (width / 3), this.y + (height / 4 * 3), 40, 42);
        Benevolence.setBounds(this.x + (width / 5 * 4), this.y + (height / 2), 40, 36);
    }

    // 重绘
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(ii.getImage(), x, y, width, height, null);
    }
}
