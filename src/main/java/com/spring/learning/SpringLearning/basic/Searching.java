package com.spring.learning.SpringLearning.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by rajeevgurram on 9/9/18.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Searching {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private Sort sort;

    public int search(int[] data, int value) {
        return sort.sort();
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("POST CONSTRUCT");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("PRE DESTROY");
    }


}
