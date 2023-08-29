package com.exercisepart3;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
public class MongoDBService implements BusinessCalculationService {

    @Override
    public int[] retriveData() {
        return new int[]{1,2,3,4,5,6};
    }

    @Override
    public int findMax() {
        return Arrays.stream(retriveData()).max().orElse(0);
    }
}
