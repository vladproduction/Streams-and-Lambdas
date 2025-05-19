package com.vladproduction.app03;

import java.util.HashMap;
import java.util.Map;

public class BiFunctionApp {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        map.computeIfPresent(2, (i, s) -> "Test: " + i + ", " + s);

        System.out.println(map);

    }
}
