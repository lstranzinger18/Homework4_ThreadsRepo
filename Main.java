/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3b.lstranzinger18.Homework4Threads;

import java.io.FileNotFoundException;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("numbers.csv");
        List<Integer> list;
        list = fr.readFile();

        Scanner sc = new Scanner(System.in);
        System.out.println("chunks>");

        int chuncksAmount = Integer.parseInt(sc.nextLine());

        System.out.println("divider>");

        int divider = Integer.parseInt(sc.nextLine());

        Task t = new Task(chuncksAmount, divider);
        t.run();
        
        
        

    }

}
