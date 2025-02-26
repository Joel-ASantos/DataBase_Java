import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "1222"; // Senha ilustrativa

        try (Connection conn = DriverManager.getConnection(url,user,password)) {
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
