import java.awt.event.ActionListener ;
import java.awt.event.WindowListener ;
import java.awt.event.MouseMotionAdapter ;
import java.awt.event.MouseMotionListener ;
import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
import java.awt.event.KeyEvent ;
import java.awt.event.MouseEvent ;
import java.awt.event.MouseAdapter ;
import java.awt.event.KeyAdapter ;
import java.awt.event.KeyListener ;
import java.awt.event.MouseListener ;
import javax.swing.JTextArea ;
import javax.swing.JFrame ;
import javax.swing.JScrollPane ;
import javax.swing.JPasswordField ;

class MyMouse extends JFrame
{
    //JTextArea text = new JTextArea() ;
    public MyMouse()
    {
        super.setTitle("鼠标精灵") ;
        super.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseDragged(MouseEvent e)
            {
                System.out.println("x坐标:"+e.getX()+"  y坐标:"+e.getY()) ;
            }
        }) ;
        super.addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                System.exit(1) ;
            }
        }) ;

        super.setSize(400,300) ;
        super.setVisible(true) ;
    }


} ;

class Tester
{
    public static void main(String args[])
    {
        MyMouse mhk = new MyMouse() ;
    }
} ;
