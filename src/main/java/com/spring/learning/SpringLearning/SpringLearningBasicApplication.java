package com.spring.learning.SpringLearning;

import com.spring.learning.SpringLearning.basic.Searching;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningBasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLearningBasicApplication.class, args);
		Searching s = applicationContext.getBean(Searching.class);
		Searching s1 = applicationContext.getBean(Searching.class);
		System.out.println(s == s1);
		System.out.println(s.search(new int[] {1, 2, 3, 4}, 3));

	}
}
