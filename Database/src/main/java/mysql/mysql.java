package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql{
    public static void main(String[] args) {
        String url = "jdbc:mysql.mysql://localhost:3306/mercado";
        String user = "root";
        String password = "11111";

        try (Connection conn = DriverManager.getConnection(url,user,password)) {
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
