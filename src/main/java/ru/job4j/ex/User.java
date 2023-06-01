package ru.job4j.ex;

public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public String getUsername() {
        return username;
    }
}
