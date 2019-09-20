package com;

import java.util.ArrayList;
import java.util.List;

public class lesson38 {

// "8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.

    public static void main(String[] args) {

        int[] ArrayList = new int[11];
        ArrayList[0] = 72;  // H
        ArrayList[1] = 101; // e
        ArrayList[2] = 108; // l
        ArrayList[3] = 108; // l
        ArrayList[4] = 111; // o
        ArrayList[5] = 32;  // " "
        ArrayList[6] = 87;  // W
        ArrayList[7] = 111; // o
        ArrayList[8] = 114; // r
        ArrayList[9] = 108; // l
        ArrayList[10] = 100; // d

        for (int i = 0; i < ArrayList.length; ) {
            printList(transformIntToChar(ArrayList[i]));
            i++;
        }
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}