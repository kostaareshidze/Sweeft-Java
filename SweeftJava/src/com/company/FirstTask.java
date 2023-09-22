package com.company;

import java.util.Arrays;

public class FirstTask {
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .filter(num -> Arrays.stream(nums).filter(n -> n == num).count() == 1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("there is o single element"));
    }

}


