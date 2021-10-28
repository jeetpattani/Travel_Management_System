import javax.swing.*;
import javax.swing.plaf.ProgressBarUI;
import java.awt.*;

public class loading extends JFrame implements Runnable{

    JProgressBar p;
    Thread t;
    String username ;

    loading(String user){
    username=user;

        t= new Thread(this);

        setBounds(500,200,650,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);


        JLabel l1 = new JLabel("Travel and Tourism Application");
        l1.setBounds(90,35,600,40);
        l1.setFont(new Font("Railway",Font.BOLD,32));
        l1.setForeground(Color.blue);
        add(l1);


        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(110,100,430,30);
        add(p);

        JLabel l2 = new JLabel("Please wait...");
        l2.setBounds(270,-30,300,380);
        l2.setFont(new Font("Railway",Font.BOLD,20));
        l2.setForeground(Color.red);
        add(l2);

        JLabel l3 = new JLabel("Welcome " + username);
        l3.setBounds(60,200,300,380);
        l3.setFont(new Font("Railway",Font.BOLD,20));
        l3.setForeground(Color.red);
        add(l3);

        t.start();

    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int m = p.getMaximum();//100
                int n = p.getValue();
                if (n < m) {
                    p.setValue(p.getValue() + 1);


                }else {
                    i=101;
                    setVisible(false);
                    new dashboard(username).setVisible(true);

                }
                Thread.sleep(50);
            }
        }catch(Exception e){

        }

    }


    public static void main(String[] args) {
        new loading("").setVisible(true);
    }
}
