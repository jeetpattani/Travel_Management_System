import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public  class login extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;

    login(){
//        setSize(300,300);
//        setLocation(100,100);




        setLayout(null);//by default borderLayout mujab mede set kre,bija => FlowLayout,Grid,GridLayout
        getContentPane().setBackground(Color.WHITE);
        setBounds(430,200,780,400);


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,390,368);
        p1.setLayout(null);
        add(p1);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(70,60,250,250);
        p1.add(l1);


        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,20,355,300);
        add(p2);


        JLabel l2 = new JLabel("Username");
        l2.setBounds(35,15,100,25);
        l2.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        p2.add(l2);

        t1 = new JTextField();
        t1.setBounds(35,50,285,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(35,95,100,25);
        l3.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        p2.add(l3);

        t2 = new JPasswordField();
        t2.setBounds(35,130,285,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);

        //login button
        b1 = new JButton("Login");
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBounds(35,194,130,30);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Sign-Up");
        b2.setBackground(new Color(133,193,233));
        b2.setForeground(Color.WHITE);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBounds(190,194,130,30);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Forgot Password?");
        b3.setBackground(Color.WHITE);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.setBounds(70,248,215,30);
        b3.addActionListener(this);
        p2.add(b3);

//        JLabel l4= new JLabel("Trouble in Login..");
//        l4.setBounds(300,250,100,20);
//        p2.add(l4);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                String username = t1.getText();
                String password= t2.getText();
                String sql = "select * from account where username ='"+username+"'  AND password = '"+password+"'  ";
                conn c= new conn();
                ResultSet rs = c.s.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    new loading(username).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid login");
                }


            }catch(Exception e){
            }
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new signup().setVisible(true);
        }else if(ae.getSource()==b3){
            this.setVisible(false);
            new forgotPassword().setVisible(true);
        }

    }

    public static void main(String[] args) {

        new login();

    }
}
