package com.company;

import com.company.Сlasses.User;

public interface IDataBase {
    void AddUser(User user);

    void RemoveUser(int index);

    String toString();

    void Clean();

}
