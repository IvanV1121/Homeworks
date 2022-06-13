package com.IvanV1112.spring.service;

import com.IvanV1112.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users;
    private File data;

    @Autowired
    public UserService() {
        this.users = new ArrayList<>();
        this.data = new File("Users.txt");
        if (!data.exists()) {
            try {
                data.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(data))) {
            String line = reader.readLine();
            String[] elements;
            while (line != null) {
                elements = line.split(" ");
                users.add(new User(elements[0], elements[1], elements[2], Integer.parseInt(elements[3]), elements[4], elements[5], Double.parseDouble(elements[6])));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(data, true))) {
            users.add(user);
            writer.write(user.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> findUser(User user) {
        final boolean isFirstName = !user.getName().equals("");
        final boolean isLastName = !user.getSurname().equals("");
        List<User> foundedUsers = new ArrayList<>();
        if (isFirstName && isLastName) {
            for (User currUser : users) {
                if (currUser.getSurname().equals(user.getSurname()) && currUser.getName().equals(user.getName())) {
                    foundedUsers.add(currUser);
                }
            }
        } else if (isFirstName) {
            for (User currUser : users) {
                if (currUser.getName().equals(user.getName())) {
                    foundedUsers.add(currUser);
                }
            }
        } else if (isLastName) {
            for (User currUser : users) {
                if (currUser.getSurname().equals(user.getSurname())) {
                    foundedUsers.add(currUser);
                }
            }
        }
        return foundedUsers;
    }
}