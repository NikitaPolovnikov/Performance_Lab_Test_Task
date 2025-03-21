package org.example;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] array = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        int currentPosition = (m - 1) % n;
        arrayList.add(1);

        while (currentPosition != 0){
            arrayList.add(array[currentPosition]);
            currentPosition = (currentPosition + m - 1) % n;
        }

        System.out.println(arrayList);
    }
}