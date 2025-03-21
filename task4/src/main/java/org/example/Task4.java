package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {
        int sum = 0;
        int steps = 0;
        String filePath = args[0];

        File file = new File(filePath);
        ArrayList<Integer> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    arrayList.add(Integer.parseInt(line));
                    sum += Integer.parseInt(line);
                } catch (Exception e) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int number : arrayList){
            steps += Math.abs(number - Math.round((double) sum/ (double) arrayList.size()));
        }

        System.out.println("Минимальное количество ходов: " + steps);
    }
}
