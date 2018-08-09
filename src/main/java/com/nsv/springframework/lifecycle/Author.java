package com.nsv.springframework.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Author implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean{

    private Book book;
    private String name;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Name of the Bean - Courtesy - BeanNameAware Interface"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Book book = beanFactory.getBean(Book.class);
        book.setTitle("How to Program");
        System.out.println("Courtesy - BeanFactoryAware Interface - "+book.getTitle());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Courtesy - InitializingBean Interface"+"Inside afterPropertiesSet");
    }

    public void init(){
        System.out.println("Author - Inside init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Courtesy - DisposableBean Interface"+"Inside destroy");

    }
}
