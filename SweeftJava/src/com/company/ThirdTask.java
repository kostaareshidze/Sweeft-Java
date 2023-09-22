package com.company;

public class ThirdTask {
    public static int notContains(int[] array){
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                number++;
                i = 0;
            }
        }
        return number;
    }
}
