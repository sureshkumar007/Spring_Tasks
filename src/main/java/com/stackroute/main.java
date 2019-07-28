package com.stackroute;

import com.stackroute.domain.Movies;
import com.stackroute.domain.Actor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Actor actor = context.getBean("actor",Actor.class);
        System.out.println(actor);
        Movies movies=(Movies) context.getBean("movies");

        System.out.println(movies);
        System.out.println( "Hello World!" );


        /*
        Bean factory
         */
//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("springBean.xml"));

        ClassPathResource res = new ClassPathResource("springBean.xml");
        XmlBeanFactory beanFactory = new XmlBeanFactory(res);
        System.out.println("bean working");
        Movies moviee=(Movies)beanFactory.getBean("movie");
        System.out.println("working bean");
        System.out.println(moviee);

    }
}
