/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3b.lstranzinger18.Homework4Threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class FileReader {

    String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public List<Integer> readFile() throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filename);

        Scanner sc = new Scanner(file);
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();

            String[] arr = line.split(":");

            for (String string : arr) {

                try {

                    Integer.parseInt(string);

                    numbers.add(Integer.parseInt(string));

                } catch (final NumberFormatException e) {
                        
                }
            }

        }

        return numbers;
    }

}
