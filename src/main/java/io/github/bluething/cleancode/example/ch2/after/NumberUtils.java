package io.github.bluething.cleancode.example.ch2.after;

import java.util.Random;

public class NumberUtils {
    public static int generateRandomNumberBetween(int low, int high) {
        return new Random().nextInt(high - low) + low;
    }

    public static double covertCurrency() {
        return 0;
    }
}
