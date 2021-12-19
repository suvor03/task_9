package ru.vsu.cs.suvorov_d_a;

import java.util.*;

public class SortPositiveNumbersOfList {
    public static List<Integer> process(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > 0 && list.get(j) > 0 && list.get(i) > list.get(j)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        return list;
    }
}