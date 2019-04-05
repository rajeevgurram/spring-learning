package com.spring.learning.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/***
 * Repository used for DAO / Data
 */
@Repository
public class ComponentPersonDAO {

    @Autowired
    ComponentJDBCConnection componentJdbcConnection;

    public ComponentJDBCConnection getComponentJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJDBCConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }
}
