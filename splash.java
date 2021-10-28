import  javax.swing.*;
import java.awt.*;//Image mate

public class splash {
    public static void main(String[] args) {
        SplashFrame frame = new SplashFrame();

        frame.setVisible(true);

        int x=1;
        for(int i=1; i<700;i+=6,x+=7) {
            frame.setLocation(970 - (x+i/4), 50);
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
//For scaleing the Image we use this
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        
        //multiThreading via Runnable
        setUndecorated(true);
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
