/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import java.util.Map;
import java.util.HashMap;
import view.Menu;

/**
 *
 * @author ACER
 */
public class CountProgramming extends Menu<String> {

    static String[] mc = { "Word Count", "Character Count", "Exit" };
    String str;
    Library l;

    public CountProgramming() {
        super("PROGRAMMING", mc);
        l = new Library();
        str = l.getString("Input string: ");
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                countLetter(str);
                break;
            case 2:
                countCharater(str);
                break;
            case 3:
                System.exit(0);
        }
    }

    public void countLetter(String str) {
        Map<String, Integer> hm = new HashMap<>();
        String[] strSplit = str.trim().split("\\s+");

        for (int i = 0; i != strSplit.length; i++) {
            hm.put(strSplit[i], hm.getOrDefault(strSplit[i], 0) + 1);
        }

        hm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }

    public void countCharater(String str) {
        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i != str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }

        hm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
