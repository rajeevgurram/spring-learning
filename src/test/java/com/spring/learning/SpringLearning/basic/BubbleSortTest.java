package com.spring.learning.SpringLearning.basic;

import com.spring.learning.SpringLearning.SpringLearningBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/***
 * @RunWith, and @ContextConfiguration required to test Spring apps
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringLearningBasicApplication.class)
public class BubbleSortTest {
    /***
     * If we use @Mock here it will be initialized all values with default.
     * bubbleSort.sort() returns 0 instead of 3
     */
    @Autowired
    BubbleSort bubbleSort;

    @Test
    public void sortTest() {
        System.out.println(bubbleSort.sort());
    }
}
