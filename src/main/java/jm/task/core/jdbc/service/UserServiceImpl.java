package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        userDao.createUsersTable();
        System.out.println("Таблица пользователей создана");
    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();
        System.out.println("Таблица пользователей удалена");
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.printf("User с именем - %s добавлен в базу данных%n", name);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("User с ID " + id + " удален из базы данных");
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userDao.getAllUsers();
        if (userList.isEmpty()) {
            System.out.println("В базе данных нет пользователей");
        } else {
            userList.forEach(System.out::println);
        }
        return userList;
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
        System.out.println("Таблица пользователей очищена");
    }
}
