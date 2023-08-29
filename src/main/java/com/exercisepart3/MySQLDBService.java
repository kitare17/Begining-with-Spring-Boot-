package com.exercisepart3;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MySQLDBService implements BusinessCalculationService{

    @Override
    public int[] retriveData() {
        return new int[]{5,6,7,8,9,10};
    }

    @Override
    public int findMax() {
        return Arrays.stream(retriveData()).max().orElse(0);
    }
}
