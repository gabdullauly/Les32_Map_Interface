/*
Создать меню
1- создать User(Добавить в массив)
2- Посмотреть список всех
3- Удалить весь список
4- Удалить пользователя по его id;
5- Изменить данные пользователя по его id;
6- Выйти из программы
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<User> users = new ArrayList<>();

    public static void createUser() {
        System.out.print("Введите id: ");
        Integer id = scan.nextInt();
        System.out.print("Введите login: ");
        String login = scan.next();
        System.out.print("Введите password: ");
        String password = scan.next();
        System.out.print("Введите name: ");
        String name = scan.next();
        System.out.print("Введите surname: ");
        String surname = scan.next();
        if (id != null && !login.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty() && !surname.trim().isEmpty()) {
            User user = new User();
            user.setId(id);
            user.setLogin(login);
            user.setPassword(password);
            user.setName(name);
            user.setSurname(surname);
            users.add(user);
            System.out.println("Пользователь успешно создан!");
        }
    }

    public static void showUserList() {
        System.out.println("Список пользователей:");
        for (User users1 : users) {
            System.out.println(users1.getData());
        }
    }

    public static void deleteAllUsers() {
        users.clear();
        System.out.println("Список пользователей успешно удален!");
    }

    public static User getUserById(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (id == users.get(i).getId()) {
                return users.get(i);
            }
        }
        return null;
    }

    public static void deleteUserById() {
        showUserList();
        System.out.print("Выберите id пользователя, которого хотите удалить: ");
        Integer id = scan.nextInt();
//        for (int i=0; i< users.size(); i++){
//            if (id==users.get(i).getId()){
//                users.remove(users.get(i));
//                System.out.println("Пользователь c id: "+id+ " успешно удален!");
//            }else {
//                System.out.println("Пользователь с id: "+id+" не найден!");
//            }
//        }
        if (id != null) {
            User user = getUserById(id);
            if (user != null) {
                users.remove(user);
                System.out.println("Пользователь c id:" + id + " успешно удален!");
            } else {
                System.out.println("Пользователь с id:" + id + " не найден!");
            }
        }
    }

    public static void editUserById() {
        showUserList();
        System.out.print("Выберите id пользователя, которого хотите удалить: ");
        Integer id = scan.nextInt();
        User user = getUserById(id);
        if (user != null) {
            System.out.print("Введите login: ");
            String login = scan.next();
            System.out.print("Введите password: ");
            String password = scan.next();
            System.out.print("Введите name: ");
            String name = scan.next();
            System.out.print("Введите surname: ");
            String surname = scan.next();
            if (!login.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty() && !surname.trim().isEmpty()) {
                user.setLogin(login);
                user.setPassword(password);
                user.setName(name);
                user.setSurname(surname);
                System.out.println("Пользователь с id:" + id + " успешно изменен!");
            }
        }else {
            System.out.println("Пользователь с id:" + id + " не найден!");
        }
//        for (int i=0; i< users.size(); i++){
//            if (id==users.get(i).getId()){
//                System.out.print("Введите login: ");
//                String login = scan.next();
//                System.out.print("Введите password: ");
//                String password = scan.next();
//                System.out.print("Введите name: ");
//                String name = scan.next();
//                System.out.print("Введите surname: ");
//                String surname = scan.next();
//                if (!login.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty() && !surname.trim().isEmpty()){
//                    users.get(i).setLogin(login);
//                    users.get(i).setPassword(password);
//                    users.get(i).setName(name);
//                    users.get(i).setSurname(surname);
//                    System.out.println("Пользователь с id: "+id+" успешно изменен!");
//                }
//            }else {
//                System.out.println("Пользователь с id: "+id+" не найден!");
//            }
//        }
    }
    public static void main (String[]args){
        while (true) {
            System.out.println("-----------------");
            System.out.println("Осоновное меню:");
            System.out.println("1 - Создать пользователя");
            System.out.println("2 - Показать список пользователей");
            System.out.println("3 - Удалить весь список");
            System.out.println("4 - Удалить пользователя по его id");
            System.out.println("5 - Изменить данные пользователя по его id");
            System.out.println("6 - Выход из программы");
            System.out.print("Выберите действие: ");
            int choice = scan.nextInt();
            if (choice == 6) {
                System.out.println("Программа успешно завершена!");
                break;
            } else if (choice == 1) {
                createUser();
            } else if (choice == 2) {
                showUserList();
            } else if (choice == 3) {
                deleteAllUsers();
            } else if (choice == 4) {
                deleteUserById();
            } else if (choice == 5) {
                editUserById();
            } else {
                System.out.println("Ошбика! Введите правильную цифру из меню.");
            }
        }
    }
}