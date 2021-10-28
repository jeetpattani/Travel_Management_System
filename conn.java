
import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn(){
        try{//com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connection string che connection mate
            c = DriverManager.getConnection("jdbc:mysql://localhost:3309/tms","root","");
            s = c.createStatement();        //com.mysql.jdbc.Driver-> deprecated,  new is -> com.mysql.cj.jdbc.Driver

        }catch(Exception e){
            System.out.println( e );
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


    }
}
