import  javax.swing.*;
import java.awt.*;//Image mate

public class splash {
    public static void main(String[] args) {
//        new SplashFrame().setVisible(true);
        SplashFrame frame = new SplashFrame();

        frame.setVisible(true);

        int x=1;
        for(int i=1; i<700;i+=6,x+=7) {
            frame.setLocation(970 - (x+i/4), 50);//100,100
            frame.setSize(x+i, 950-(i/2));
            try{
                Thread.sleep(10);
            }catch(Exception e) {

            }

            frame.setVisible(true);
        }
    }
}

class SplashFrame extends JFrame implements Runnable{

    Thread t1;

    SplashFrame() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        //image ne area ma fix krva mate (Scale karva mate)
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);

//        setLocation(300,120);
//        setSize(1080,600);
//        setBounds(100,100,1300,700);// location*2, size*2

        //multiThreading via Runnable
        setUndecorated(true);// upar nu BAR nai aave aana thi
        t1 = new Thread(this);
        t1.start();

    }
    public void run(){

        try{
            Thread.sleep(4000);
            this.setVisible(false);
        }catch(Exception e){

        }


    }
}