package com.testrecord;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;



@Component

class Bean{
    private SubBean subBean;

    @Autowired
    public void setSubBean(SubBean subBean) {
        System.out.println("Setter is auto-wiring");
        this.subBean = subBean;
    }

    public SubBean getSubBean() {
        return subBean;
    }



}

@Component
class SubBean{

}

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        try(var context =new AnnotationConfigApplicationContext(Main.class))
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        var bean1=context.getBean(Bean.class).getSubBean();
        var bean2 =context.getBean(SubBean.class);
            System.out.println(bean1==bean2?"ok":"no");
        }
    }
}
