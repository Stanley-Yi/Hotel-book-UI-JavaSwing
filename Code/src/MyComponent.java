import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.awt.Toolkit;
import javax.swing.*;


public class MyComponent extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel jl2;//放value
    private String[] msg;

    private int x=480,y=14;
    private int i=0;
    private Roll roll;
    private ExecutorService pool;
    public static boolean flag;



    public JLabel getJl2() {
        return jl2;
    }

    public void setJl2(JLabel jl2) {
        this.jl2 = jl2;
    }

    public MyComponent() {
        super();
        this.setLayout(null);
        JLabel jl2=new JLabel();
        this.jl2=jl2;
        jl2.setBounds(0, 0, 100, 30);
        this.add(jl2);
    }


    public void setArrText(String[] msg){
        this.msg=msg;

        if(msg!=null&&msg.length>0){
            flag=true;
            pool=ThreadGroupUtil.getInstance();
            if(roll==null){
                roll=new Roll();

                pool.execute(roll);
            }
        }else{
            flag=false;
        }
    }


    class Roll extends Thread{
        @Override
        public void run(){
            while(flag){
                try {
                    Thread.sleep(100);
                    if(jl2.getText()!=null){
                        jl2.setText(null);
                    }
                } catch (InterruptedException e) {
                }
                if((x-=1) > -25){
                    continue;
                }
                i = ++i % msg.length;

                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                }
                x=480;
            }
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(msg!=null){
            Toolkit tool = this.getToolkit();
            if(i<msg.length) {
                g.drawString(msg[i], x, y);
            }
            this.repaint();
        }
    }
}