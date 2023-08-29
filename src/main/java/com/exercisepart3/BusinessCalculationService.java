package com.exercisepart3;


import org.springframework.stereotype.Component;

@Component
public interface BusinessCalculationService {
    int[] retriveData();
    int findMax();
}
