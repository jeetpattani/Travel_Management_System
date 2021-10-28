
import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connection string for connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3309/tms","root","");
            s = c.createStatement();        //com.mysql.jdbc.Driver-> deprecated,  new one is -> com.mysql.cj.jdbc.Driver

        }catch(Exception e){
            System.out.println( e );
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


    }
}
