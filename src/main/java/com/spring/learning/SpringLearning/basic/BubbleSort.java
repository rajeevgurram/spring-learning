package com.spring.learning.SpringLearning.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Qualifier("quick")
public class BubbleSort implements Sort{
    public int sort() {
        return 3;
    }
}
