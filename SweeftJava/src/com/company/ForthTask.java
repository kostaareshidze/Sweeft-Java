package com.company;
import java.math.BigInteger;

public class ForthTask {

        public static String addBinary(String a, String b) {
            BigInteger num1 = new BigInteger(a, 2);
            BigInteger num2 = new BigInteger(b, 2);

            BigInteger BinarySum = num1.add(num2);

            return BinarySum.toString(2);
        }

    }

