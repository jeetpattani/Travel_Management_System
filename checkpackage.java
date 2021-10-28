import javax.swing.*;
import java.awt.*;

public class checkpackage extends JFrame {

    checkpackage(){
        setBounds(450,200,800,500);

        String [] package1= new String[]{"BRONZE PACKAGE","6 Days and 7 Nights","Airport Assistant","Half Day City Tour","Daily Buffet",
                "Welcome Drinks on Arrival","Full 3 days Island Cruise","English speaking Guide",
                "BOOK NOW","SUMMER SPECIAL","Rs 18000/-","icons/package1.jpg"};

        String [] package2= new String[]{"SILEVR PACKAGE","8 Days and 9 Nights","Airport Assistant","Night safari","Daily Entertainment",
                "Welcome gifts","Full 3 days Island Cruise","English speaking Guide",
                "BOOK NOW","WINTER SPECIAL","Rs 28000/-","icons/package2.jpg"};

        String [] package3= new String[]{"GOLD PACKAGE","6 Days and 7 Nights","Airport Assistant"," Night safari","Daily food",
                "5star hotel stay","Full 2 days Isaland Cruise","English speaking Guide",
                "BOOK NOW","HOLIDAY SPECIAL","Rs 42000/-","icons/package3.jpg"};

        JTabbedPane pane= new JTabbedPane();

        JPanel p1= createPackage(package1);
        pane.addTab("Package 1", null, p1);

        JPanel p2= createPackage(package2);
        pane.addTab("Package 2", null, p2);

        JPanel p3= createPackage(package3);
        pane.addTab("Package 3", null,p3);

        add(pane,BorderLayout.CENTER);

    }

    public JPanel createPackage(String[] pack){
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);


        JLabel l1= new JLabel(pack[0]);
        l1.setBounds(50,0,300,30);
        l1.setFont(new Font("Tahoma", Font.BOLD,22));
        p1.add(l1);

        JLabel l2= new JLabel(pack[1]);
        l2.setBounds(35,40,300,30);
        l2.setForeground(Color.orange);
        l2.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l2);

        JLabel l3= new JLabel(pack[2]);
        l3.setBounds(35,80,300,30);
        l3.setForeground(Color.ORANGE);
        l3.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l3);

        JLabel l4= new JLabel(pack[3]);
        l4.setBounds(35,120,300,30);
        l4.setForeground(Color.orange);
        l4.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l4);

        JLabel l5= new JLabel(pack[4]);
        l5.setBounds(35,160,300,30);
        l5.setForeground(Color.orange);
        l5.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l5);

        JLabel l6= new JLabel(pack[5]);
        l6.setBounds(35,200,300,30);
        l6.setForeground(Color.orange);
        l6.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l6);

        JLabel l7= new JLabel(pack[6]);
        l7.setBounds(35,240,300,30);
        l7.setForeground(Color.orange);
        l7.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l7);

        JLabel l8= new JLabel(pack[7]);
        l8.setBounds(35,280,300,30);
        l8.setForeground(Color.orange);
        l8.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l8);

        JLabel l9= new JLabel(pack[8]);
        l9.setBounds(35,320,300,30);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l9);

        JLabel l10= new JLabel(pack[9]);
        l10.setBounds(300,360,300,30);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma", Font.BOLD,18));
        p1.add(l10);

        JLabel l11= new JLabel(pack[10]);
        l11.setBounds(630,380,300,30);
        l11.setForeground(Color.blue);
        l11.setFont(new Font("Tahoma", Font.BOLD,22));
        p1.add(l11);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource(pack[11]));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l12= new JLabel(i3);
        l12.setBounds(310,0,500,300);
        p1.add(l12);

        return p1;

    }


    public static void main(String[] args) {
        new checkpackage().setVisible(true);
    }
}
