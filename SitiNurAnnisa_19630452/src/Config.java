import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/nurannisa_19630452";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
           System.err.println("koneksi gagal" + e.getMessage());
        }
    
        return mysqlconfig;
    }



}
