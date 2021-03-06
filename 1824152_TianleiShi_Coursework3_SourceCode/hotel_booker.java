import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class hotel_booker {

    static JButton loginButton = new JButton("login");
    static JButton RegisterButton = new JButton("register");

    static JButton registerBack = new JButton("<- Back");
    static JButton registerConfrim = new JButton("confrim");

    static JButton booklogoutButton = new JButton("log out");
    static JButton bookresetButton = new JButton("reset");

    public static JButton SHANGRI_LA_hotel = new JButton(new ImageIcon("SHANGRI_LA_Icon.jpg"));
    public static JButton OrientalHotel = new JButton(new ImageIcon("Oriental_Icon.jpg"));
    public static JButton Benevolence = new JButton(new ImageIcon("Benevolence_Icon.jpg"));
    static int hotel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hotel Book System");

        ImageIcon background = new ImageIcon("background.jpg");
        JLabel label = new JLabel(background);

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

        registerBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerPanel.setVisible(false);
                registerPanel.removeAll();

                loginPanel.setOpaque(false);
                loginPanel.setLayout(new FlowLayout());
                login(loginPanel);
                loginPanel.setVisible(true);
            }
        });

        registerConfrim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerPanel.setVisible(false);
                registerPanel.removeAll();

                bookPanel.setOpaque(false);
                bookPanel.setLayout(new FlowLayout());
                book(bookPanel);
                bookPanel.setVisible(true);
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

        registerBack.setBounds(0, 0, 80, 25);
        registerBack.setBackground(Color.white);
        panel.add(registerBack);

        JLabel setCount = new JLabel("Create your own account");
        setCount.setFont(new Font("Tahoma", Font.BOLD, 23));
        setCount.setForeground(Color.white);
        setCount.setBounds(150,80,300,50);
        panel.add(setCount);

        JLabel userLabel = new JLabel("User:");
        userLabel.setForeground(Color.white);
        userLabel.setBounds(150,200,100,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(270,200,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(150,250,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(270,250,165,25);
        panel.add(passwordText);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setForeground(Color.white);
        confirmPasswordLabel.setBounds(150,300,120,25);
        panel.add(confirmPasswordLabel);

        JPasswordField confirmPasswordText = new JPasswordField(20);
        confirmPasswordText.setBounds(270,300,165,25);
        panel.add(confirmPasswordText);

        registerConfrim.setBounds(265, 370, 80, 25);
        registerConfrim.setBackground(Color.white);
        panel.add(registerConfrim);
    }

    private static void book(JPanel panel) {
        panel.setLayout(null);

        hotel = 0;

        Dimension frameSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize.width = frameSize.width / 2;
        frameSize.height = frameSize.height / 4;
        String file = "map.jpg";

        ZoomPanel zp = new ZoomPanel(frameSize, file);
        zp.setBounds(30,100,240,300);
        panel.add(zp);

        panel.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
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

        JButton bookconfirmButton = new JButton("confirm");
        bookconfirmButton.setBounds(400, 375, 80, 25);
        bookconfirmButton.setBackground(Color.decode("#FFEEDD"));

        bookresetButton.setBounds(505, 0, 80, 25);
        bookresetButton.setBackground(Color.white);
        panel.add(bookresetButton);

        JLabel selectHotelLabel = new JLabel("Please select Hotel");
        selectHotelLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        selectHotelLabel.setForeground(Color.white);
        selectHotelLabel.setBounds(320,180,200,30);
        panel.add(selectHotelLabel);

        JLabel selectLabel = new JLabel("by Slide and Drag");
        selectLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        selectLabel.setForeground(Color.white);
        selectLabel.setBounds(328,240,200,30);
        panel.add(selectLabel);

        int[] roomNum = {1};
        JButton roomSub = new JButton("-");
        JButton roomPlus = new JButton("+");

        JPanel hotelInfoPanel = new JPanel();
        hotelInfoPanel.setBounds(295, 100, 280, 270);

        JLabel totalPriceLabel = new JLabel();
        JLabel numLabel = new JLabel();

        JLabel Calendar = new JLabel("Calendar");

        LocalDate cIdate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate cOdate = LocalDate.now().plusDays(1);

        JLabel totalDayLabel = new JLabel();

        JTextField checkinText = new JTextField();
        JTextField checkoutText = new JTextField();

        checkinText.setText(cIdate.format(formatter));
        checkoutText.setText(cOdate.format(formatter));

        CalendarPanel p = new CalendarPanel(checkinText, "yyyy/MM/dd");
        CalendarPanel p2 = new CalendarPanel(checkoutText, "yyyy/MM/dd");
        p.initCalendarPanel();
        p.add(Calendar);
        panel.add(p);
        p2.initCalendarPanel();
        p2.add(Calendar);
        panel.add(p2);

        final boolean[] selected = {false};

        SHANGRI_LA_hotel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectHotelLabel.setVisible(false);
                selectHotelLabel.removeAll();

                selectLabel.setVisible(false);
                selectLabel.removeAll();

                hotelInfoPanel.removeAll();

                panel.add(bookconfirmButton);

                panel.add(hotelInfoPanel);
                hotel = 1;

                panel.setVisible(false);

                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);

                panel.setVisible(true);
                selected[0] = true;
            }
        });

        OrientalHotel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectHotelLabel.setVisible(false);
                selectHotelLabel.removeAll();

                selectLabel.setVisible(false);
                selectLabel.removeAll();

                hotelInfoPanel.removeAll();

                panel.add(bookconfirmButton);

                panel.add(hotelInfoPanel);
                hotel = 2;

                panel.setVisible(false);

                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);

                panel.setVisible(true);
                selected[0] = true;
            }
        });

        Benevolence.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectHotelLabel.setVisible(false);
                selectHotelLabel.removeAll();

                selectLabel.setVisible(false);
                selectLabel.removeAll();

                hotelInfoPanel.removeAll();

                panel.add(bookconfirmButton);

                panel.add(hotelInfoPanel);
                hotel = 3;

                panel.setVisible(false);

                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);

                panel.setVisible(true);
                selected[0] = true;
            }
        });

        roomSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);

                if (roomNum[0] - 1 <= 1) {
                    roomNum[0] = 1;
                } else {
                    roomNum[0] -= 1;
                }
                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);
                panel.setVisible(true);
            }

        });

        roomPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);

                if (roomNum[0] + 1 >= 30) {
                    roomNum[0] = 30;
                } else {
                    roomNum[0] += 1;
                }

                hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);
                panel.setVisible(true);
            }
        });

        JLabel confirmError = new JLabel("Wrong date, please reselect");
        JLabel confirmSuccess = new JLabel("Room reservation is successful");

        bookconfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selected[0]) {
                    String checkin = checkinText.getText();
                    String checkout = checkoutText.getText();
                    String todayDate = LocalDate.now().format(formatter);

                    int day = 1;

                    DateFormat dft = new SimpleDateFormat("yyyy/MM/dd");
                    try {
                        Date star = dft.parse(checkin);
                        Date today = dft.parse(todayDate);

                        if (today.after(star)) {
                            day = -1;
                        } else {
                            Date endDay = dft.parse(checkout);
                            Long starTime = star.getTime();
                            Long endTime = endDay.getTime();
                            Long num = endTime - starTime;
                            day = (int) (num / 24 / 60 / 60 / 1000);
                        }
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }

                    if (day <= 0) {
                        panel.setVisible(false);

                        confirmSuccess.setVisible(false);
                        confirmSuccess.removeAll();

                        confirmError.setBounds(305, 400, 300, 40);
                        confirmError.setFont(new Font("Tahoma", Font.BOLD, 18));
                        confirmError.setForeground(Color.red);
                        panel.add(confirmError);
                        confirmError.setVisible(true);

                        hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);
                        panel.setVisible(true);
                    } else {
                        panel.setVisible(false);

                        confirmError.setVisible(false);
                        confirmError.removeAll();

                        confirmSuccess.setBounds(292, 400, 300, 40);
                        confirmSuccess.setFont(new Font("Tahoma", Font.BOLD, 18));
                        confirmSuccess.setForeground(Color.green);
                        panel.add(confirmSuccess);
                        confirmSuccess.setVisible(true);

                        hotelInfo(hotelInfoPanel, roomSub, roomPlus, roomNum[0], hotel, totalPriceLabel, numLabel, checkinText, checkoutText, totalDayLabel);
                        panel.setVisible(true);
                    }
                }
            }
        });

    }

    private static void hotelInfo(JPanel panel, JButton roomSub, JButton roomPlus, int roomNum, int hotel, JLabel totalPriceLabel, JLabel numLabel, JTextField checkinText, JTextField checkoutText, JLabel totalDayLabel) {
        panel.setLayout(null);

        String[] hotelInfo = new String[3];

        switch (hotel) {
            case 1:
                hotelInfo = new String[]{"Shangri-La Hotels & Resorts", "(86 21) 2203 8888", "1488"};
                break;

            case 2:
                hotelInfo = new String[]{"Oriental Hotel", "(86 64) 2849 6666", "528"};
                break;

            case 3:
                hotelInfo = new String[]{"Benevolence Hotel", "(86 57) 7895 1568", "998"};
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
            JLabel addressLabel = new JLabel("1218 Middle Yan'an Road, Jing An");
            addressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel.setForeground(Color.black);
            addressLabel.setBounds(5, 66, 280, 20);
            panel.add(addressLabel);

            JLabel addressLabel_2 = new JLabel("Kerry Centre, Shanghai 200040 China");
            addressLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel_2.setForeground(Color.black);
            addressLabel_2.setBounds(5, 88, 280, 20);
            panel.add(addressLabel_2);
        } else if (hotel == 2) {
            JLabel addressLabel = new JLabel("105 Penang Road, George Town, ");
            addressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel.setForeground(Color.black);
            addressLabel.setBounds(5, 66, 280, 20);
            panel.add(addressLabel);

            JLabel addressLabel_2 = new JLabel("Penang 10000 Malaysia");
            addressLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel_2.setForeground(Color.black);
            addressLabel_2.setBounds(5, 88, 280, 20);
            panel.add(addressLabel_2);
        } else {
            JLabel addressLabel = new JLabel("256 Xingye Avenue, Guangzhou,");
            addressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
            addressLabel.setForeground(Color.black);
            addressLabel.setBounds(5, 66, 280, 20);
            panel.add(addressLabel);

            JLabel addressLabel_2 = new JLabel("Guangzhou 511442 China");
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

        String checkin = checkinText.getText();
        String checkout = checkoutText.getText();
        int day = 1;

        DateFormat dft = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date star = dft.parse(checkin);
            Date endDay=dft.parse(checkout);
            Long starTime=star.getTime();
            Long endTime=endDay.getTime();
            Long num=endTime-starTime;
            day = (int) (num / 24 / 60 / 60 / 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

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

        totalDayLabel.setText("Total Days: " + day);
        totalDayLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        totalDayLabel.setForeground(Color.black);
        totalDayLabel.setBounds(5,198,160,20);
        panel.add(totalDayLabel);

        JLabel roomNumberLabel = new JLabel("Number of Rooms:");
        roomNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomNumberLabel.setForeground(Color.black);
        roomNumberLabel.setBounds(5,220,150,20);
        panel.add(roomNumberLabel);

        roomSub.setBounds(150,221,38,20);
        panel.add(roomSub);

        numLabel.setText("" + roomNum);
        numLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        numLabel.setForeground(Color.black);
        int loc = 201;
        if (roomNum > 9) {
            loc = 198;
        }
        numLabel.setBounds(loc,220,20,20);
        panel.add(numLabel);

        roomPlus.setBounds(225,221,41,20);
        panel.add(roomPlus);

        int ttp = price * roomNum * day;

        totalPriceLabel.setText("Total Price:"+" $"+ttp);
        totalPriceLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        totalPriceLabel.setForeground(Color.black);
        totalPriceLabel.setBounds(5,242,280,20);
        panel.add(totalPriceLabel);
    }

}

class ZoomPanel extends JPanel {

    JButton SHANGRI_LA_hotel = hotel_booker.SHANGRI_LA_hotel;
    JButton OrientalHotel = hotel_booker.OrientalHotel;
    JButton Benevolence = hotel_booker.Benevolence;

    private static final long serialVersionUID = 1L;
    private ImageIcon ii;
    private Dimension frameSize;
    private int x, y, width, height;

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
                originX[0] = e.getX();
                originY[0] = e.getY();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
                int offsetX = e.getX() - originX[0];
                int offsetY = e.getY() - originY[0];

                moveImg(offsetX, offsetY);
            }
        });

    }

    public void setImgPos() {
        x = (frameSize.width - width) / 2 - 263;
        y = (frameSize.height - height) / 2 + 43;
    }

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
        offsetX /= 50;
        offsetY /= 50;

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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(ii.getImage(), x, y, width, height, null);
    }
}
