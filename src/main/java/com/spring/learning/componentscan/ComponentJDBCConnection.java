package com.spring.learning.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/***
 *  proxyMode = ScopedProxyMode.TARGET_CLASS used to get this class always
 *  gives us new object even though caller is singleton.
 *  ex: Main -> Class 1 (Singleton) -> This (Create object everytime)
 *  In that case ScopedProxyMode.TARGET_CLASS gets new instance
 *  when ever anywhere it gets called.
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJDBCConnection {
    public ComponentJDBCConnection() {
        System.out.println("JDBC Connection");
    }
}
