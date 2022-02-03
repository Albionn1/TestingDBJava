import java.sql.Connection;
import java.sql.DriverManager;
public class dbLoad {
    public static void main(String [] args){
        Connection conn = null;
        
        try{
      
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/puna", "root", "AlbionRoot");
            if(conn!=null){
                System.out.println("Successfully connected to the Database");
            }
        }
        catch(Exception e){
            System.out.println("Not connected to the Database");
        }
    }
}
