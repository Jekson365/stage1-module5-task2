package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;


public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return listt -> {
            List<Integer> res = new ArrayList<>();
            for (Integer num : listt) {
                res.add(num / divider);
            }
            return res;
        };
    }
}
