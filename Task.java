/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3b.lstranzinger18.Homework4Threads;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class Task implements Runnable {

    List<Integer> list;
    int divider;
    int amountChunk;

    public Task(int amountChunk, int divider) {

        this.amountChunk = amountChunk;
        this.divider = divider;
    }

    @Override
    public void run() {

        FileReader fr = new FileReader("numbers.csv");
        try {
            this.list = fr.readFile();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        int startFrom = 0;
        for (int i = 1; i <= this.amountChunk; i++) {

            List<Integer> smallerList = this.list.subList(startFrom, (list.size() / this.amountChunk) * i);
            for (Integer integer : smallerList) {
                if (fr.isDivider(integer, this.divider) == true) {
                    System.out.println(integer);
                }

            }

            startFrom = ((list.size() / this.amountChunk) * i) + 1;
        }

    }

}
