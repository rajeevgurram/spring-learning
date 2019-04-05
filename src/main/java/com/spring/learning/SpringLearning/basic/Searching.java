package com.spring.learning.SpringLearning.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Service is for business logic
 */
@Service
/***
 * singleton – Return a single bean instance per Spring IoC container
 * prototype – Return a new bean instance each time when requested
 * request – Return a single bean instance per HTTP request. *
 * session – Return a single bean instance per HTTP session. *
 * globalSession – Return a single bean instance per global HTTP session. *
 */
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
        System.out.println("POST CONSTRUCT");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PRE DESTROY");
    }


}
