package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double circleCoordinateX = 0;
        double circleCoordinateY = 0;
        double circleRadius = 0;

        try (Scanner pointsScanner = new Scanner(new File(args[1]))){
            Scanner circleScanner = new Scanner(new File(args[0]));
            circleCoordinateX = circleScanner.nextDouble();
            circleCoordinateY = circleScanner.nextDouble();
            circleRadius = circleScanner.nextDouble();

            circleScanner.close();

            while (pointsScanner.hasNextDouble()) {
                double pointX = pointsScanner.nextDouble();
                double pointY = pointsScanner.nextDouble();

                double distance =
                        Math.sqrt(Math.pow(pointX - circleCoordinateX, 2) + Math.pow(pointY - circleCoordinateY, 2));

                if (distance < circleRadius) {
                    System.out.println(1);
                } else if (distance == circleRadius) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Один или несколько файлов не найдены");
        }
    }
}