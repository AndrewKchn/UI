package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class H2 {
    public static void main(String[] args) {

        // Для создания необходимо добавить зависимость в pom.xml
        // и далее по коду, необходимы url, username, password и название класса драйвера
        try{
            String url = "jdbc:h2:tcp://localhost/~/test";
            String username = "sa";
            String password = "";
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                System.out.println("Connection to Store db.H2 DB succesfull!");
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM FACILITY");
                System.out.println(resultSet);
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
