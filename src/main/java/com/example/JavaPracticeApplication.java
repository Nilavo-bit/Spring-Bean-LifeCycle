package com.example;

import com.example.scope.AppConfig;
import com.example.scope.Employee;
import com.example.scope.PrototypeScope;
import com.example.scope.SingletonScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.apache.coyote.http11.Constants.a;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ApplicationContext context = SpringApplication.run(JavaPracticeApplication.class, args);
		System.out.println("========Application context Loaded==========");
		PrototypeScope bean = context.getBean(PrototypeScope.class);
		System.out.println("=====PrototypeScope class loaded======");
		((org.springframework.context.ConfigurableApplicationContext) context).close();

















	}

}
