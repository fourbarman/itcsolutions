package ru.fourbarman;

public class Main {
    public static void main(String[] args) {
        try {
            int num = Validator.validate(args);
            int reversedNum = DescendingOrder.sortDesc(num);
            System.out.println("Reversed number = " + reversedNum);
        } catch (IllegalArgumentException ise) {
            System.out.println("Please, provide one positive integer number (from 0 to 2147483647)");
        }
    }
}
