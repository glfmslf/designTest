package org.example.factory;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author yuyou
 * @since 2022/6/14 23:16
 */
public class FactoryMain {
    public static void main(String[] args) throws JsonProcessingException {
//        People people = BeanFactory.createCache(4);
//        People people1 = BeanFactory.createCache(4);
//        System.out.println(people.hashCode());
//        System.out.println(people1.hashCode());
//        System.out.println(people == people1);
//        System.out.println(people.equals(people1));
//        if (people instanceof Man) {
//            System.out.println("man class");
//        }
//        if (people instanceof Women) {
//            System.out.println("women class");
//        }
//        if (people instanceof Student) {
//            System.out.println("student class");
//        }
//        if (people instanceof Teacher) {
//            System.out.println("teacher class");
//        }
//        System.out.println(people);
//        ObjectMapper objectMapper = new ObjectMapper();
//        System.out.println(objectMapper.writeValueAsString(people));
        MethodFactory methodFactory = MethodFactoryMap.getFactory(4);
        MethodFactory methodFactory1 = MethodFactoryMap.getFactory(2);
        System.out.println(methodFactory == methodFactory1);
        People people = methodFactory.create();
        if (people instanceof Man) {
            System.out.println("man class");
        }
        if (people instanceof Women) {
            System.out.println("women class");
        }
        if (people instanceof Student) {
            System.out.println("student class");
        }
        if (people instanceof Teacher) {
            System.out.println("teacher class");
        }
    }

}
