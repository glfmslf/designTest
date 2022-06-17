package org.example.builder;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yuyou
 * @since 2022/6/16 21:52
 */
@ToString
@Data
@NoArgsConstructor
public class People implements Serializable {
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
    @Accessors(chain = true)
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
