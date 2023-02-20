package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                rsl = value;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User is not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        Boolean rsl = false;
        if (user.getUsername().length() > 3 && user.isValid()) {
            rsl = true;
        }
        if (!rsl) {
                   throw new UserInvalidException("User is not valid");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true),
                    new User("Bogdanchik", true),
                    new User("Bog", false),
                    new User("Dima", true),
                    new User("Dimasik", true)
            };
            User user1 = findUser(users, "Petr Arsentev");
            User user2 = findUser(users, "Bog");
            if (validate(user1)) {
                System.out.println("This user has an access");
            }
            if (validate(user2)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
