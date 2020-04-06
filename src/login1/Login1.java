
package login1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login1 {
    
    public static void main(String[] args) {
        
        new SignINFrame1().setVisible(true);
        
    }
}
class connectDB{
    static Connection connect(){
        Connection conn1 = null;
        String uname = "user1";
        String pass = "pass";
        String url = "jdbc:derby://localhost:1527/login";
        try {
            Connection conn = DriverManager.getConnection(url,uname,pass);
            conn1 = conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null,"Connection Failed...");        
        }
        return conn1;
    }
}