package com.example.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class SingletonScope implements DisposableBean {

    private int id;
    private String name;
    private String type;

    public SingletonScope()
    {
        System.out.println("Constructor loaded--SingletonScope.class");
    }
    @PostConstruct
    public void afterConstructor()
    {
        System.out.println("PostConstruct--SingletonScope.class");
    }

    public void normal_working_method1()
    {
        System.out.println("This is normal Business logic method1--SingletonScope.class");
    }
    public void normal_working_method2()
    {
        System.out.println("This is normal Business logic method2--SingletonScope.class");
    }

    @PreDestroy
    public void beforeDestroy()
    {
        System.out.println("PreDestroy--SingletonScope.class");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy the class--SingletonScope.class");
    }
}
