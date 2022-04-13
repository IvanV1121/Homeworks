package com.IvanV1121.Homework2Part1.Chapter2;

import com.opencsv.CSVReader;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MainCSVreader {

    public static void main(String[] args) throws Exception {

        System.out.println("Exercise_13_CSVreader");

        Reader reader = Files.newBufferedReader(Paths.get("newDoc.csv").toAbsolutePath());
        readAll(reader).stream().forEach(strings -> System.out.println(Arrays.toString(strings)));
    }

    public static List<String[]> readAll(Reader reader) throws Exception {
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> list;
        list = csvReader.readAll();
        reader.close();
        csvReader.close();
        return list;
    }
}


