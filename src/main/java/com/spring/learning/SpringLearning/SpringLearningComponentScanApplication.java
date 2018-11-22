package com.spring.learning.SpringLearning;

import com.spring.learning.SpringLearning.scope.PersonDAO;
import com.spring.learning.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
		"com.spring.learning.componentscan"
})
public class SpringLearningComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringLearningComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLearningComponentScanApplication.class, args);

		ComponentPersonDAO personDAO = applicationContext.getBean(ComponentPersonDAO.class);
		ComponentPersonDAO personDAO1 = applicationContext.getBean(ComponentPersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getComponentJdbcConnection());
		LOGGER.info("{}", personDAO.getComponentJdbcConnection());
		LOGGER.info("{}", personDAO.getComponentJdbcConnection());
		LOGGER.info("{}", personDAO.getComponentJdbcConnection());

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getComponentJdbcConnection());
	}
}
