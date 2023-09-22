package com.company;

public class FifthTask {
    public static int countVariants(int stearsCount){

            if (stearsCount <= 1)
                return stearsCount;
            return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
    }
}
