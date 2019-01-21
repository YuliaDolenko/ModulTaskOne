package com.company;

public class Main {

    public static void main(String[] args) {
        uniquenessOfNumbers();
    }
    public static void uniquenessOfNumbers() {
        int[] numbers = {1, 2, 3, 3, 5, 5, 0, 1};
        int result = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    result++;
                }
            }
        }
        result = numbers.length - result;
        System.out.println(result);
    }
}
