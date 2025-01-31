package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    /* реализуйте настройку соеденения с БД */

    // URL-адрес базы данных
    private static final String URL = "jdbc:mysql://localhost:3306/testdb?user=root&password=root";
    // имя пользователя в базе данных
    private static final String USER = "root";
    // пароль к базе данных
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
