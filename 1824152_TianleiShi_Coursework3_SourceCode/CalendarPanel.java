import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalendarPanel extends JPanel {


    private static final long serialVersionUID = 1L;

    private JLabel btn_lastYear = null;
    private JLabel btn_nextYear = null;
    private JLabel btn_lastMonth = null;
    private JLabel btn_nextMonth = null;
    private JLabel lb_datetime = null;
    private JPanel panel_maincalenderpanel = null;
    private JLabel lblNewLabel = null;
    private JLabel label = null;
    private JLabel label_1 = null;
    private JLabel label_2 = null;
    private JLabel label_3 = null;
    private JLabel label_4 = null;
    private JLabel label_5 = null;
    private JLabel btn_close = null;
    private JButton btn_today = null;
    private JButton btn_cancel = null;
    private Object component = null;
    private String returnDateStr = null;
    private CallBack callBack = null;

    private String patern = "yyyy-MM-dd";
    private SimpleDateFormat sdf = null;
    private String nowDatetime = null;


    public CalendarPanel(Object component,String patern) {
        this(patern);
        this.component = component;
    }


    public CalendarPanel(String patern) {
        super();

        this.patern = patern;
        sdf = new SimpleDateFormat(patern);
        nowDatetime = sdf.format(new Date());

        setLayout(null);

        this.setBorder(BorderFactory.createLineBorder(Color.gray));

        init();

        createCalendarPanel(nowDatetime);
    }


    public CalendarPanel() {
        super();

        sdf = new SimpleDateFormat(patern);
        nowDatetime = sdf.format(new Date());

        setLayout(null);

        this.setBorder(BorderFactory.createLineBorder(Color.gray));

        init();

        createCalendarPanel(nowDatetime);
    }


    public Object getComponent() {
        return component;
    }


    public void setComponent(Object component) {
        this.component = component;
    }


    public String getReturnDateStr() {
        return returnDateStr;
    }


    public CallBack getCallBack() {
        return callBack;
    }


    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }



    private void createCalendarPanel(String date){

        if(panel_maincalenderpanel!=null){
            panel_maincalenderpanel.setVisible(false);
            this.remove(panel_maincalenderpanel);
        }


        panel_maincalenderpanel = new JPanel();
        panel_maincalenderpanel.setBackground(Color.WHITE);
        panel_maincalenderpanel.setBounds(2, 47, 247, 156);
        panel_maincalenderpanel.setLayout(new GridLayout(6,7));
        add(panel_maincalenderpanel);

        Date today = null;
        try {
            today = sdf.parse(date);
        } catch (ParseException e1) {
            e1.printStackTrace();
            return;
        }

        Calendar c = new GregorianCalendar();

        c.setTime(today);

        c.set(c.get(Calendar.YEAR),c.get(Calendar.MONTH), 1);

        int firstDayInMonthOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int daysOfMonth  = c.getActualMaximum(Calendar.DAY_OF_MONTH);


        for(int i=1;i<firstDayInMonthOfWeek;i++){
            JLabel bnt = new JLabel("");
            bnt.setSize(27,23);
            bnt.setBackground(Color.WHITE);
            panel_maincalenderpanel.add(bnt);
        }


        for(int i=1;i<=daysOfMonth;i++){
            final JLabel bnt = new JLabel(String.valueOf(i));
            bnt.setHorizontalAlignment(SwingConstants.CENTER);
            bnt.setSize(27,23);
            bnt.setBackground(Color.WHITE);
            if(Calendar.getInstance().get(Calendar.DATE)==i){

                bnt.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }else{

                bnt.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }


            bnt.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {

                    bnt.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if(Calendar.getInstance().get(Calendar.DATE)==Integer.parseInt(((JLabel)e.getSource()).getText().trim())){

                        bnt.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                    }else{

                        bnt.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                    }
                }

                @Override
                public void mouseClicked(MouseEvent e) {

                    String dateStr = lb_datetime.getText().trim();
                    try {
                        dateStr = sdf.format(sdf.parse(dateStr));
                        dateStr = dateStr.substring(0,dateStr.length()-2);
                        if (component instanceof java.awt.TextField){
                            TextField txt = (TextField)component;
                            dateStr += ((JLabel)e.getSource()).getText().trim();
                            dateStr = sdf.format(sdf.parse(dateStr));
                            txt.setText(dateStr);
                        }
                        if (component instanceof java.awt.Label){
                            Label label = (Label)component;
                            dateStr += ((JLabel)e.getSource()).getText().trim();
                            dateStr = sdf.format(sdf.parse(dateStr));
                            label.setText(dateStr);

                        }
                        if (component instanceof javax.swing.JTextField){
                            JTextField txt = (JTextField)component;
                            dateStr += ((JLabel)e.getSource()).getText().trim();
                            dateStr = sdf.format(sdf.parse(dateStr));
                            txt.setText(dateStr);

                        }
                        if (component instanceof javax.swing.JLabel){
                            JLabel label = (JLabel)component;
                            dateStr += ((JLabel)e.getSource()).getText().trim();
                            dateStr = sdf.format(sdf.parse(dateStr));
                            label.setText(dateStr);
                        }

                    } catch (ParseException e2) {
                        e2.printStackTrace();
                    }


                    returnDateStr = dateStr;
                    if(callBack!=null){
                        callBack.callback();
                    }

                    CalendarPanel.this.setVisible(false);

                }


            });
            panel_maincalenderpanel.add(bnt);
        }

        for(int i=1;i<6*7-(firstDayInMonthOfWeek-1)-daysOfMonth;i++){
            JLabel bnt = new JLabel("");
            bnt.setSize(27,23);
            bnt.setBackground(Color.WHITE);
            panel_maincalenderpanel.add(bnt);
        }

        panel_maincalenderpanel.validate();
    }



    private void init(){
        btn_lastYear = new JLabel("<<");
        btn_lastYear.setBounds(10, 0, 27, 23);
        add(btn_lastYear);
        btn_lastYear.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                changTheDate(Calendar.YEAR,false);
            }

        });

        btn_nextYear = new JLabel(">>");
        btn_nextYear.setBounds(179, 0, 27, 23);
        add(btn_nextYear);
        btn_nextYear.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                changTheDate(Calendar.YEAR,true);
            }

        });


        btn_lastMonth = new JLabel("<");
        btn_lastMonth.setBounds(39, 0, 27, 23);
        add(btn_lastMonth);
        btn_lastMonth.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                changTheDate(Calendar.MONTH,false);
            }

        });

        btn_nextMonth = new JLabel(">");
        btn_nextMonth.setBounds(150, 0, 27, 23);
        add(btn_nextMonth);
        btn_nextMonth.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                changTheDate(Calendar.MONTH,true);
            }

        });


        lb_datetime = new JLabel("");
        lb_datetime.setBounds(58, 2, 86, 19);
        lb_datetime.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_datetime);
        lb_datetime.setText(nowDatetime);

        lblNewLabel = new JLabel("Sun");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(2, 22, 27, 23);
        add(lblNewLabel);

        label = new JLabel("Mon");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(39, 22, 27, 23);
        add(label);

        label_1 = new JLabel("Tue");
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setBounds(76, 22, 27, 23);
        add(label_1);

        label_2 = new JLabel("Wed");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setBounds(113, 22, 27, 23);
        add(label_2);

        label_3 = new JLabel("Thu");
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setBounds(147, 22, 27, 23);
        add(label_3);

        label_4 = new JLabel("Fri");
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setBounds(184, 22, 27, 23);
        add(label_4);

        label_5 = new JLabel("Sat");
        label_5.setForeground(Color.GREEN);
        label_5.setHorizontalAlignment(SwingConstants.CENTER);
        label_5.setBounds(221, 22, 27, 23);
        add(label_5);

        btn_close = new JLabel("[X]");
        btn_close.setBounds(222, 0, 27, 23);
        btn_close.setForeground(Color.RED);
        add(btn_close);
        btn_close.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                CalendarPanel.this.setVisible(false);
            }

        });


        btn_today = new JButton("Today");
        btn_today.setBounds(10, 213, 60, 23);
        btn_today.setContentAreaFilled(false);
        btn_today.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(btn_today);
        btn_today.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createCalendarPanel(nowDatetime);
                lb_datetime.setText(nowDatetime);
            }
        });


        btn_cancel = new JButton("Cancel");
        btn_cancel.setBounds(179, 213, 60, 23);
        btn_cancel.setContentAreaFilled(false);
        btn_cancel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(btn_cancel);
        btn_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalendarPanel.this.setVisible(false);
            }
        });
    }


    public void reset(){
        createCalendarPanel(nowDatetime);
        lb_datetime.setText(nowDatetime);
    }



    public void changTheDate(int YEAR_OR_MONTH,boolean flag){
        String dateStr = lb_datetime.getText().trim();
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e1) {
            e1.printStackTrace();
            return;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if(flag){

            c.set(YEAR_OR_MONTH,c.get(YEAR_OR_MONTH)+1 );
        }else{

            c.set(YEAR_OR_MONTH,c.get(YEAR_OR_MONTH)-1 );
        }

        date = c.getTime();
        lb_datetime.setText(sdf.format(date));
        createCalendarPanel(sdf.format(date));
    }



    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(2011,11,1);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }


    public void initCalendarPanel(){
        if(component instanceof javax.swing.JComponent){
            JComponent j = (JComponent)component;
            this.setComponent(component);
            this.setBounds(300, 120, 251, 245);
            this.setVisible(false);
            j.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (CalendarPanel.this.isVisible()){
                        CalendarPanel.this.setVisible(false);
                    }else{
                        CalendarPanel.this.setVisible(true);
                        CalendarPanel.this.reset();
                    }
                }
            });
        }
    }

}


interface CallBack{
    public void callback();
}