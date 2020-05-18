package ru.easium.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDAO {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        JdbcCommonDAO dao = context.getBean(JdbcCommonDAO.class);


        dao.insertCourse("Spring",23);
        dao.insertCourse("Hibernate",32);
        System.out.println(dao.getAllCourse());;
    }
}