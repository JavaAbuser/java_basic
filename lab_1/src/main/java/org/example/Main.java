package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 20;

    private static final int MIN_VALUE = -20;
    private static final int MAX_VALUE = 20;

    public static void main(String[] args) {
        Scanner scanner = getScanner();

        UI.askHeight();
        int rows = scanner.nextInt();

        UI.askWidth();
        int cols = scanner.nextInt();

        if (rows > MAX_SIZE || cols > MAX_SIZE) {
            UI.printSizeExceeded();
            return;
        }

        int[][] matrix = new int[rows][cols];

        UI.askTypeOfCreation();
        int typeOfCreation = scanner.nextInt();

        if (typeOfCreation == 1) {
            UI.askElements();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }
        else if (typeOfCreation == 2){
            Random randInt = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = randInt.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
                }
            }
        }
        else {
            UI.printBadType();
        }

        showMatrix(matrix);
        printMatrixInfo(matrix);
    }

    private static void showMatrix(int[][] matrix) {
        System.out.println("Matrix is: ");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    private static void printMatrixInfo(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        double sum = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) min = num;
                if (num > max) max = num;
                sum += num;
                count++;
            }
        }

        UI.printMinimalElement(min);
        UI.printMaximalElement(max);
        UI.printAvg(sum, count);
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}