package org.example.builder;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yuyou
 * @since 2022/6/16 21:52
 */
@ToString
@Data
@NoArgsConstructor
public class People {
    private String name;

    private String gender;

    private int sex;

    private int age;


    private People(Builder builder){
        this.name = builder.name;
        this.gender = builder.gender;
        this.sex = builder.sex;
        this.age = builder.age;
    }


    @Data
    public static class Builder{
        private String name;

        private String gender;

        private int sex;

        private int age;

        public People build() {
            return new People(this);
        }

    }
}
