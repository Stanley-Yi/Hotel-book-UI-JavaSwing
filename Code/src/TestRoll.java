import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestRoll extends JFrame{

    /**
     * @param args
     */
    public TestRoll() {

        JPanel jp=new JPanel();
        jp.setLayout(null);
        MyComponent component=new MyComponent();
        component.setBounds(20,30, 100, 30);
        jp.add(component);
        component.setArrText(new String []{"张三","李四","王五"});
        this.getContentPane().add(jp);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new TestRoll();
    }

}
