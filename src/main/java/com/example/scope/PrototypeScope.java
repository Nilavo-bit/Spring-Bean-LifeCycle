package com.example.scope;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScope implements DisposableBean {

    private int id;
    private String name;
    private String type;

    PrototypeScope(){
        System.out.println("Constructor loaded--PrototypeScope.class");
    }
    @PostConstruct
    public void afterConstructor()
    {
        System.out.println("PostConstruct--PrototypeScope.class");
    }

    public void normal_working_method1()
    {
        System.out.println("This is normal Business logic method1--PrototypeScope.class");
    }
    public void normal_working_method2()
    {
        System.out.println("This is normal Business logic method2--PrototypeScope.class");
    }

    @PreDestroy
    public void beforeDestroy()
    {
        System.out.println("PreDestroy--PrototypeScope.class");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method from PrototypeScope.class");
    }
}
