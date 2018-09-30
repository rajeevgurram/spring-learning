package com.spring.learning.SpringLearning.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by rajeevgurram on 9/9/18.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Searching {
    @Autowired
    @Qualifier("quick")
    private Sort sort;

    public int search(int[] data, int value) {
        return sort.sort();
    }
}
