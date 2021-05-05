
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class QuoteBasisPhotoUtils extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ZoomPanel zp;

    public QuoteBasisPhotoUtils() {

    }

    public QuoteBasisPhotoUtils(String file) {
        // 获取屏幕大小
        Dimension frameSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize.width = frameSize.width / 2;
        frameSize.height = frameSize.height * 3 / 4;

        setSize(frameSize);
        setLocationRelativeTo(null);// 居中显示

        // JScrollPane scrollPane_1 = new JScrollPane();
        // getContentPane().add(scrollPane_1, BorderLayout.CENTER);
        // scrollPane_1
        // .setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

//        zp = new ZoomPanel(frameSize, file);
//        getContentPane().add(zp);

        // scrollPane_1.setViewportView(zp);

        // 添加鼠标滚轮消息响应
        addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("sadfdasdfsa");
                // 滚轮向前滑动 放大
                if (e.getWheelRotation() < 0) {
                    zp.enlargeImg();
                }

                // 滚轮向后滑动 缩小
                else {
                    zp.reduceImg();
                }
            }
        });


        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new QuoteBasisPhotoUtils("img/background.jpg");
    }
}

// 缩放面板
//class ZoomPanel extends JLabel {
//    /**
//     *
//     */
//    private static final long serialVersionUID = 1L;
//    private ImageIcon ii;
//    private Dimension frameSize;
//    private int x, y, width, height;// 图片的坐标、缩放的size
//
//    public ZoomPanel(Dimension fs, String imgPath) {
//        setBackground(Color.WHITE);
//        setToolTipText("滑动滚轮可缩小放大图片");
//        this.frameSize = fs;
//
//        ii = new ImageIcon(imgPath);
//        JLabel label = new JLabel();
//        label.setIcon(ii);
//
//        width = 500;
//        height = 707;
//        setImgPos();
//    }
//
//    // 设定x、y坐标
//    public void setImgPos() {
//        x = (frameSize.width - width) / 2;
//        y = (frameSize.height - height) / 2;
//    }
//
//    // 放大
//    public void enlargeImg() {
//        if (width >= ii.getIconWidth() * 2) {
//            return;
//        }
//        if (height >= ii.getIconHeight() * 2) {
//            return;
//        }
//
//        width += width / 9; // 这里为什么是除以9呢 这个是数学问题 留给大家自己想吧 要是不明白,可以留言
//        height += height / 9;
//        setImgPos();
//
//        repaint();
//    }
//
//    // 缩小
//    public void reduceImg() {
//        if (width <= ii.getIconWidth() / 5) {
//            return;
//        }
//        if (height <= ii.getIconHeight() / 5) {
//            return;
//        }
//
//        width -= width / 10;
//        height -= height / 10;
//        setImgPos();
//
//        repaint();
//    }
//
//    // 重绘
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        g.drawImage(ii.getImage(), x, y, width, height, null);
//    }
//}