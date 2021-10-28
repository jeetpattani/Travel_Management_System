import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NullPointerException;

public class signup extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;


    signup(){
        setBounds(430,200,780,400);
        getContentPane().setBackground(Color.WHITE); //Target whole panel
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,480,380);
        p1.setLayout(null);
        add(p1);

        JLabel l1= new JLabel("Username");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD,14));
        l1.setBounds(40,20,100,25);
        p1.add(l1);

        t1= new JTextField();
        t1.setBounds(180,20,250,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.addActionListener(this);
        add(t1);


        JLabel l2= new JLabel("Name");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.BOLD,14));
        l2.setBounds(40,70,100,25);
        p1.add(l2);

        t2= new JTextField();
        t2.setBounds(180,70,250,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        t1.addActionListener(this);
        add(t2);


        JLabel l3= new JLabel("Password");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.BOLD,14));
        l3.setBounds(40,120,100,25);
        p1.add(l3);

        t3= new JTextField();
        t3.setBounds(180,120,250,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);


        JLabel l4= new JLabel("Security question");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.BOLD,14));
        l4.setBounds(40,170,130,25);
        p1.add(l4);

        //For dropdownmenu we can create by using comboBox / Choice
        c1 = new Choice();
        c1.add("Your favourite cartoon name");
        c1.add("Your First crush name");
        c1.add("Your lucky number");
        c1.setBounds(214,175,272,25);
        p1.add(c1);


        JLabel l5= new JLabel("Answer");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.BOLD,14));
        l5.setBounds(40,230,100,25);
        p1.add(l5);

        t4= new JTextField();
        t4.setBounds(180,230,250,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        add(t4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        JLabel l6 = new JLabel(i1);
        l6.setBounds(520,55,200,200);
        add(l6);

        b1 = new JButton("Create");
        b1.setBounds(100,294,130,30);
        b1.setForeground(new Color(133,193,233));
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("Tahoma", Font.BOLD,14));
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(270,294,130,30);
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Tahoma", Font.BOLD,14));
        b2.addActionListener(this);
        p1.add(b2);
    }


    @Override
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==b1){
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();

            try{
                String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";

                conn c = new conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account created successfully ");

                this.setVisible(false);
                new login().setVisible(true);

            }catch(Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==b2){
            new login().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new signup().setVisible(true);
    }

}
