package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        boolean valid = false;
        for (User userName : users) {
            if (userName.getUsername().equals(login)) {
                valid = false;
                user = userName;
            }
        }
        if (valid) {
            throw new UserNotFoundException("There is no such user");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("The user is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Ernest", true)
        };
        try {
            User user = findUser(users, "Ernest");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден");
        }
    }

}
