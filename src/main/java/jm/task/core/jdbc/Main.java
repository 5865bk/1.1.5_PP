package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        //        Util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();

        //      Создание таблицы пользователей
        userService.createUsersTable();

        //      Добавление пользователей
        userService.saveUser("Petr1", "LastPetr1", (byte) 8);
        userService.saveUser("Petr2", "LastPetr2", (byte) 16);
        userService.saveUser("Petr3", "LastPetr3", (byte) 32);
        userService.saveUser("Petr4", "LastPetr4", (byte) 64);


        //     Получение всех пользователей и вывод в консоль
        userService.getAllUsers();

        //     Удаление пользователя по ID
        userService.removeUserById(1);

        //     Очистка таблицы пользователей
        userService.cleanUsersTable();

        //     Удаление таблицы пользователей
        userService.dropUsersTable();
    }
}