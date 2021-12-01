package io.github.bluething.cleancode.example.ch3.before;

import io.github.bluething.cleancode.example.ch3.Order;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class MethodWithTooManyArguments {
    public static void main(String[] args) {
        long millisSinceEpoch = nowPlusTime(0, 0, 4);
        new Order().setExpirationDate(millisSinceEpoch);
    }

    private static long nowPlusTime(int months, int weeks, int days) {
        return LocalDateTime.now().plusMonths(months)
                .plusWeeks(weeks)
                .plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}
