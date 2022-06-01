package com.netcracker.serv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.netcracker.model.UserData;

public class UserService {

    private List<UserData> users;
    private File uploadFile;

    public UserService(List<UserData> users, File uploadFile) {
        this.users = new ArrayList<>();
        this.uploadFile = new File("UsersList.txt");
    }

    public void AddUser(UserData user) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(uploadFile));
        users.add(user);
        bufferedWriter.write(user.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public List<UserData> getUsers() {
        return users;
    }

    public List<User> FindUser




}
