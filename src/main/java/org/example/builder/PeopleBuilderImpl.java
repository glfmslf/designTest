package org.example.builder;

/**
 * @author yuyou
 * @since 2022/6/17 10:41
 */
public class PeopleBuilderImpl extends PeopleBuilder{
    @Override
    public void buildName(String name) {
        people.setName(name);
    }

    @Override
    public void buildSex(Integer sex) {
        people.setSex(sex);

    }

    @Override
    public void buildAge(Integer age) {
        people.setAge(age);

    }

    @Override
    public void buildGender(String gender) {
        people.setGender(gender);

    }
}
