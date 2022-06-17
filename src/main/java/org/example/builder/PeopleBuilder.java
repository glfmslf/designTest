package org.example.builder;

/**
 * @author yuyou
 * @since 2022/6/17 10:28
 */
public abstract class PeopleBuilder {

    public People people = new People();

    public abstract void buildName(String name);

    public abstract void buildSex(Integer sex);

    public abstract void buildAge(Integer age);

    public abstract void buildGender(String gender);

    public People getBean() {
        return this.people;
    }

}
