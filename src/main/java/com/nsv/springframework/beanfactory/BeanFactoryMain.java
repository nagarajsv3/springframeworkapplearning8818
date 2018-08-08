package com.nsv.springframework.beanfactory;

import com.nsv.springframework.loosecoupling.ShapeCreator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.xml.sax.helpers.XMLReaderFactory;

public class BeanFactoryMain {

    public static void main(String[] args) {

        BeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        ShapeCreator shapeCreator = beanFactory.getBean(ShapeCreator.class);
        shapeCreator.getShape().drawShape();
    }
}
