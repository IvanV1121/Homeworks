package com.IvanV1112.springtask.service;

import com.IvanV1112.springtask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users;
    private final File data;

    @Autowired
    public UserService() {
        this.users = new ArrayList<>();
        this.data = new File("users.txt");
        if (!data.exists()) {
            try {
                data.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(data))) {
            String line = reader.readLine();
            String[] cells;
            while (line != null) {
                cells = line.split(" ");
                users.add(new User(cells[0], cells[1], cells[2], Integer.parseInt(cells[3]), cells[4], cells[5], Double.parseDouble(cells[6])));
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

    public void fileUpload(MultipartFile file) {
        if (file.isEmpty()) return;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line = reader.readLine();
            String[] cells;
            while (line != null) {
                cells = line.split(" ");
                line = reader.readLine();
                if (!isFormat(cells)) continue;
                User user = new User(cells[0], cells[1], cells[2], Integer.parseInt(cells[3]), cells[4], cells[5], Double.parseDouble(cells[6]));
                users.add(user);
                addUser(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isFormat(String[] strings) {
        if (strings == null || strings.length != 7) return false;
        try {
            Integer.parseInt(strings[3]);
            Double.parseDouble(strings[6]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}