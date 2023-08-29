package com.beginnotation.kitare;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age) {
};
record AutoWiringLearn(String id,String name){};
@Configuration
public class MyAnnotation {

//    @Bean
//    public String getName() {
//      //  System.out.println("getName method");
//        return "My name is Kitare";
//    }
   @Bean
   public int getAge(){
        return 52;
   }
    @Bean(name="myperson")
    public Person getPerson() {
//        var person1 = new Person("Kitare", 20);
//        var person2 = new Person("Kitare", 20);
//        System.out.println(person1.hashCode()+" "+person2.hashCode());
        return new Person("Kitare", 20);
    }

    @Bean
    public Person person1(String name,int age){
        System.out.println("Name :"+name);
        return new Person(name,age);
    }

    @Bean
    @Primary
    public AutoWiringLearn getWiring1(){
        return  new AutoWiringLearn("1","Wiring 1");
    }

    @Bean

    public AutoWiringLearn getWiring2(){
        return  new AutoWiringLearn("2","Wiring 2");
    }


    @Bean
    public String getWiring2ToString(@Qualifier("getWiring2") AutoWiringLearn wiring){
        return wiring.toString();
    }

}
