package com.k003.dong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static final String fileName = "E:\\java\\atruong\\Exercise9\\src\\ls9.txt";
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
    }
}
