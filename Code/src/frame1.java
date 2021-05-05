import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class frame1 extends JFrame implements ActionListener{
    /**

     * @param args

     */

    private JButton jb;

    public frame1()

    {
        this.setSize(300, 200);

        this.setLocation(300, 400);

        jb=new JButton("跳转");

        this.add(jb);

        jb.addActionListener(this);//加入事件监听

        this.setVisible(true);

    }

    public static void main(String[] args) {
// TODO Auto-generated method stub

        frame1 frame=new frame1();

    }

    @Override

    public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

        if(e.getSource()==jb)

        {
            this.dispose();//点击按钮时frame1销毁,new一个frame2

            new frame2();

        }

    }

}

