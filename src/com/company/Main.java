package com.company;

import com.company.Сlasses.DataBase;
import com.company.Сlasses.User;

public class Main {

    public static void main(String[] args) {
	    DataBase dataBase = new DataBase();
	    dataBase.AddUser(new User(1,"Vadym","1234","Vadym"));
	    dataBase.AddUser(new User(2,"Login","6434","Alex"));
	    dataBase.AddUser(new User(3,"zxcv","5678","ZXCV"));
	    dataBase.AddUser(new User(4,"asdf","9012","ASDF"));
	    dataBase.AddUser(new User(5,"qwer","3456","QWER"));
        System.out.println(dataBase);
        dataBase.RemoveUser(0);
        System.out.println(dataBase);
        dataBase.Clean();
        System.out.println(dataBase);
    }
}
