package org.example.builder;

/**
 * 建造者模式
 * @author yuyou
 * @since 2022/6/16 21:07
 */
public class Main {
    public static void main(String[] args) {
//        People.Builder builder = new People.Builder();
//        builder.setAge(1);
//        builder.setGender("male");
//        builder.setSex(1);
//        builder.setName("yy");
//        System.out.println(builder.build());
        ConstructorArg.Builder builder = new ConstructorArg.Builder();
        builder.setRef(false);
        builder.setArg("sss");
        builder.setType(People.class);
        ConstructorArg constructorArg = builder.build();
        System.out.println(constructorArg);

    }
}
