import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee_db";
        String username = "root";
        String password = "krati@020304";

        try {

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println("Database connected successfully!");

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}