package org.example;

public class UI {
    public static void askHeight() {
        System.out.print("Enter the height of the matrix (maximum 20): ");
    }

    public static void askWidth() {
        System.out.print("Enter the width of the matrix (maximum 20): ");
    }

    public static void printSizeExceeded() {
        System.out.print("The size exceeds 20x20!");
    }

    public static void askTypeOfCreation() {
        System.out.print("Create a matrix (1 - manually, 2 - randomly): ");
    }

    public static void askElements() {
        System.out.print("Enter the matrix elements: ");
    }

    public static void printBadType() {
        System.out.print("i told u 1 or 2!");
    }

    public static void printMinimalElement(int min) {
        System.out.print("Minimum element: " + min);
    }

    public static void printMaximalElement(int max) {
        System.out.println("Maximum element: " + max);
    }

    public static void printAvg(double sum, int count) {
        System.out.println("Avg: " + (sum / count));
    }
}
