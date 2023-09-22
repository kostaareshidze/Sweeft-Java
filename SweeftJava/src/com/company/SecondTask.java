package com.company;

public class SecondTask {
    public static int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};

        int minCoins = 0;
        int remainingAmount = amount;

        for (int coin : coins) {
            while (remainingAmount >= coin) {
                minCoins++;
                remainingAmount -= coin;
            }
        }

        return minCoins;
    }
}