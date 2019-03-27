package com.company.Сlasses;

public class User extends DataBase{

    private int id;
    private String login;
    private String password;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        this.id = 1;
        this.login = null;
        this.password = null;
        this.name = null;

    }

    public User(int id, String login, String password, String name) {
        this.id = id > 0 ? id : 1;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                 "\n";
    }
}
