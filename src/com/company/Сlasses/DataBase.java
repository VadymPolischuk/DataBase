package com.company.Сlasses;

import com.company.IDataBase;

import java.util.Arrays;

public class DataBase implements IDataBase {

    User[] users;

    public DataBase() {
        this.users = new User[0];
    }

    @Override
    public void AddUser(User user) {
        User newUser[] = new User[this.users.length + 1];
        int i = 0;
        if (this.users.length > 0) {
            for (User temp : this.users) {
                newUser[i++] = temp;
            }
            newUser[this.users.length] = user;
        } else
            newUser[0] = user;

        this.users = newUser;


    }

    @Override
    public void RemoveUser(int index) {

        User[] newUser = new User[this.users.length - 1];
        if(index > 0) {
            for (int i = 0; i < index - 1; i++) {
                newUser[i] = this.users[i];
            }
            for (int i = index - 1; i < newUser.length; i++) {
                newUser[i] = this.users[i + 1];
            }
            this.users = newUser;
        }
        else
            System.out.println("Введите ID > 0");


    }

    @Override
    public void Clean() {
        this.users = new User[0];

    }

    @Override
    public String toString() {
        if (this.users.length > 0) {
            return Arrays.toString(users) +
                    '}';
        }
        return "DataBase is empty";
    }
}
