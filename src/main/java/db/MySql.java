package db;

import java.sql.Connection;
import java.sql.DriverManager;

// Для создания необходимо добавить зависимость в pom.xml
// и далее по коду, необходимы url, username, password и название класса драйвера
// Предварительно требуется скачать и установить базу данных

public class MySql {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/ekkel";
            String username = "root";
            String password = "P@ssw0rd";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection to Store db.MySql DB succesfull!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
