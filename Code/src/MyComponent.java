import java.awt.Graphics;
import java.util.concurrent.ExecutorService;

import javax.swing.JButton;
import javax.swing.JLabel;


/**
 * 显示界面的组件实体类
 * @author 崔耀强   20150507
 * @version 1.1
 * */

public class MyComponent extends JButton {

    private static final long serialVersionUID = 1L;
    private JLabel jl2;//放value
    private String[] msg;

    private int x=90,y=17;
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

    /**
     * 设置显示值
     * */
    public void setArrText(String[] msg){
        this.msg=msg;
        /*
         * 滚动实现
         * */
        if(msg!=null&&msg.length>0){
            flag=true;
            pool=ThreadGroupUtil.getInstance();
            if(roll==null){
                roll=new Roll();
                //	roll.start();
                pool.execute(roll);
            }
        }else{
            flag=false;
        }
    }

    /**
     *  滚动线程，当有业务值传进来时候，启动该线程
     */
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
                x=90;
            }
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(msg!=null){
            if(i<msg.length){

                g.drawString(msg[i],x,y);
            }
            this.repaint();
        }
    }
}