package com.IvanV1112.spring.service;

import com.IvanV1112.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    private List<User> users;
    private File data;

    @Autowired
    public FileService() {
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

    private static boolean fileFormat(String[] strings) {
        if (strings == null || strings.length != 7) return false;
        try {
            Integer.parseInt(strings[3]);
            Double.parseDouble(strings[6]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void fileUpload(MultipartFile file) {
        if (file.isEmpty()) return;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line = reader.readLine();
            String[] elements;
            while (line != null) {
                elements = line.split(" ");
                line = reader.readLine();
                if (!fileFormat(elements)) continue;
                User user = new User(elements[0], elements[1], elements[2], Integer.parseInt(elements[3]), elements[4], elements[5], Double.parseDouble(elements[6]));
                users.add(user);
                UserService userService = new UserService();
                userService.addUser(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
