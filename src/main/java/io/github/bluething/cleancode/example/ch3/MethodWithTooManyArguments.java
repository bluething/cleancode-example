package io.github.bluething.cleancode.example.ch3;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static java.time.LocalDateTime.now;

public class MethodWithTooManyArguments {
    public static void main(String[] args) {
        int months = 0;
        int weeks = 0;
        int days = 4;

        long millisSinceEpoch = nowPlusTime(months, weeks, days);
        new Order().setExpirationDate(millisSinceEpoch);

        // after
        new Order().setExpirationDate(nowPlusDays(4));
    }

    private static long nowPlusTime(int months, int weeks, int days) {
        return LocalDateTime.now().plusMonths(months)
                .plusWeeks(weeks)
                .plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    public static long nowPlusMonths(int months) {
        return now().plusMonths(months)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    public static long nowPlusWeeks(int weeks) {
        return now().plusWeeks(weeks)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    public static long nowPlusDays(int days) {
        return now().plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}
