import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class forgotPassword extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5;
    Choice c1;
    JButton b1,b2,b3;

    forgotPassword(){
        setBounds(430,200,780,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(20,20,460,322);
        add(p);


        JLabel l1= new JLabel("Username");
        l1.setBounds(30,20,100,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l1);
        t1= new JTextField();
        t1.setBounds(160,20,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);


        JLabel l2= new JLabel("Name");
        l2.setBounds(30,70,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l2);
        t2= new JTextField();
        t2.setBounds(160,70,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);


        JLabel l3= new JLabel("Your Security question");
        l3.setBounds(30,120,220,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l3);

        t3= new JTextField();
        t3.setBounds(210,120,230,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);


        JLabel l4= new JLabel("Answer");
        l4.setBounds(30,170,100,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l4);
        t4= new JTextField();
        t4.setBounds(160,170,180,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);


        JLabel l5= new JLabel("Password");
        l5.setBounds(30,230,100,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l5);
        t5= new JTextField();
        t5.setBounds(160,230,180,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);

        b1= new JButton("Search");
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBounds(360,20,80,25);
        b1.addActionListener(this);
        p.add(b1);

        b2= new JButton("Retrive");
        b2.setBackground(new Color(133,193,233));
        b2.setForeground(Color.WHITE);
        b2.setBounds(360,170,80,25);
        b2.addActionListener(this);
        p.add(b2);

        b3= new JButton("Back");
        b3.setBackground(new Color(133,193,233));
        b3.setForeground(Color.WHITE);
        b3.setBounds(190,280,120,25);
        b3.addActionListener(this);
        p.add(b3);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2= i1.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6= new JLabel(i3);
        l6.setBounds(520,50,220,220);
        add(l6);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        conn c= new conn();

        if(ae.getSource() == b1){
            try {
                String sql = "select * from account where username = '" + t1.getText() + "' ";
                // database matthi data lai aavse and ResultSet class no abject return kare so we have to store somewhere
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                    //getString thi value nikdse database ni colomn mathi
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                }
            }catch(Exception e){}
        }

        else if(ae.getSource() == b2) {
            try {
                String sql = "select * from account where answer = '" + t4.getText() + "' AND username = '" + t1.getText() + "' ";
                ResultSet rs = c.s.executeQuery(sql);
                while (rs.next()) {
                    //getString for get value from database
                    t5.setText(rs.getString("password"));
                }
            }catch (Exception e) {}
        }

        else if(ae.getSource() == b3){
            this.setVisible(false);
            new login().setVisible(true);
        }

    }


    public static void main(String[] args) {
        new forgotPassword().setVisible(true);
    }

}
