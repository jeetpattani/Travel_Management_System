import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class dashboard extends JFrame implements ActionListener {
    JButton b13,b14,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b15;
    String username;
    dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);//screen size mujab fit kri dese frame ne

        JPanel p1= new JPanel();
        p1.setBounds(0,0,1534,65);
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        add(p1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i5 = i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2= new JLabel(i6);
        l2.setBounds(3,0,70,70);
        p1.add(l2);

        JLabel l3= new JLabel("Dashboard");
        l3.setFont( new Font("Taahome", Font.BOLD, 30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(80,10,300,40);
        p1.add(l3);


        JPanel p2= new JPanel();
        p2.setBounds(0,65,300,980);
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        add(p2);

        b1 = new JButton("Add personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setForeground(Color.white);
        b1.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b1.setBounds(0,0,300,50);
        b1.setMargin(new Insets(0,0,0,85));
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Update personal details");
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.white);
        b2.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b2.setBounds(0,40,300,50);
        b2.setMargin(new Insets(0,0,0,65));
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("view Details");
        b3.setBackground(new Color(0,0,102));
        b3.setForeground(Color.white);
        b3.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b3.setBounds(0,80,300,50);
        b3.setMargin(new Insets(0,0,0,165));
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Delete personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setForeground(Color.white);
        b4.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b4.setBounds(0,120,300,50);
        b4.setMargin(new Insets(0,0,0,68));
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Check package");
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.white);
        b5.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b5.setBounds(0,160,300,50);
        b5.addActionListener(this);
        b5.setMargin(new Insets(0,0,0,140));
        p2.add(b5);

        b6 = new JButton("Book package");
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.white);
        b6.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b6.setBounds(0,200,300,50);
        b6.setMargin(new Insets(0,0,0,150));
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("View selected package");
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.white);
        b7.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b7.setBounds(0,240,380,50);
        b7.addActionListener(this);
        b7.setMargin(new Insets(0,0,0,150));
        p2.add(b7);

         b8 = new JButton("Destinations");
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.white);
        b8.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b8.setBounds(2,280,300,50);
        b8.setMargin(new Insets(0,0,0,170));
        b8.addActionListener(this);
        p2.add(b8);

         b9 = new JButton("Book New Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.white);
        b9.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b9.setBounds(0,320,350,50);
        b9.setMargin(new Insets(0,0,0,180));
        b9.addActionListener(this);
        p2.add(b9);

         b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.white);
        b10.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b10.setBounds(0,360,350,50);
        b10.setMargin(new Insets(0,0,0,160));
        b10.addActionListener(this);
        p2.add(b10);

         b12 = new JButton("Payment");
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.white);
        b12.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b12.setBounds(0,400,300,50);
        b12.setMargin(new Insets(0,0,0,200));
        b12.addActionListener(this);
        p2.add(b12);

        b13 = new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setForeground(Color.white);
        b13.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b13.setBounds(0,440,300,50);
        b13.addActionListener(this);
        b13.setMargin(new Insets(0,0,0,190));
        p2.add(b13);

        b14 = new JButton("Notepad");
        b14.setBackground(new Color(0,0,102));
        b14.setForeground(Color.white);
        b14.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b14.setBounds(0,480,300,50);
        b14.addActionListener(this);
        b14.setMargin(new Insets(0,0,0,200));
        p2.add(b14);

         b15 = new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setForeground(Color.white);
        b15.setFont(new Font ("Tahoma",Font.PLAIN,20));
        b15.setBounds(0,520,300,50);
        b15.setMargin(new Insets(0,0,0,220));
        b15.addActionListener(this);
        p2.add(b15);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1534,794,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0,0,1534,980);
        add(l1);

        JLabel l4= new JLabel("Travel and Tourism Management system");
        l4.setBounds(470,85,1000,50);
        l4.setFont(new Font("Tahoma",Font.BOLD,44));
        l4.setForeground(Color.white);
        l4.setBackground(Color.red);
        l1.add(l4);

    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){

            }
        }else if(ae.getSource()==b14){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){

            }
        }else if(ae.getSource()==b1){
            new addCustomer(username).setVisible(true);
        }else if(ae.getSource()==b2){
            new updatecustomer(username).setVisible(true);
        }else if(ae.getSource()==b3){
            new viewcustomer(username).setVisible(true);
        }

        else if(ae.getSource()==b4){
            try {
                new deletecustomer().setVisible(true);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        else if (ae.getSource()==b5){
            new checkpackage().setVisible(true);
        }else if(ae.getSource()==b6){
            new bookpackage(username).setVisible(true);
        }else if(ae.getSource()==b7){
            new viewpackage(username).setVisible(true);
        }else if(ae.getSource()==b8){
            new checkhotels().setVisible(true);
        }else if(ae.getSource()==b9){
            new bookhotel(username).setVisible(true);
        }else if(ae.getSource()==b10) {
            new viewbookedhotel(username).setVisible(true);
        }else if(ae.getSource()==b12){
            new payment().setVisible(true);
        }
        else if(ae.getSource()==b15) {
            new about().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new dashboard("").setVisible(true);

    }
}
