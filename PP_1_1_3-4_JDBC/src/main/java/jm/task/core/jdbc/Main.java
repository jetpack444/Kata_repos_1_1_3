package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        // 1. Создание таблицы юзеров
        userService.createUsersTable();
        System.out.println("User table created.");

        // 2. Добавить юзера в таблицу
        userService.saveUser("Ivan", "Ivanov", (byte) 5);
        System.out.println("A User named Ivan added to the database.");

        // 3. Получить всех юзера из таблицы
        System.out.println("User in the database:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        // 4. Отчистка таблицы юзеров
        userService.cleanUsersTable();
        System.out.println("User table cleaned.");

        // 5. удаление таблицы
        userService.dropUsersTable();
        System.out.println("User table deleted.");
    }
}
