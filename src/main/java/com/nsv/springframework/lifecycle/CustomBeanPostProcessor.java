package com.nsv.springframework.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(o instanceof Author){
            ((Author)o).setName("Naga");
        }
        System.out.println("inside postprocess before initialisation - Courtesy - BeanPostProcessor");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("inside postprocess after initialisation - Courtesy - BeanPostProcessor");

        return o;
    }
}
