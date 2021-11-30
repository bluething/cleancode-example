package io.github.bluething.cleancode.example.ch2.after;

import java.time.Instant;
import java.time.ZoneId;

public class TimeUtils {
    public static void printNowNewYorkTime() {
        String now = Instant.now().atZone(ZoneId.of("America/New_York")).toString();
        System.out.println(now);
    }
}
