package org.example.builder;

/**
 * ClassName: <br/>
 * date: 2020/9/15 10:24<br/>
 *
 * @author zhangpengfei <br/>
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setNo(1);
//        s1.setName("张三");
//        s1.setAge(18);
//        s1.setAddress("北京");
//        Student s2 = new Student();
//        s2.setNo(2);
//        s2.setName("李四");
//        s2.setAge(14);
//        s2.setAddress("上海");
//        Student s3 = new Student();
//        s3.setNo(4);
//        s3.setName("王五");
//        s3.setAge(17);
//        s3.setAddress("深圳");
//        Student s4 = new Student();
//        s4.setNo(3);
//        s4.setName("赵六");
//        s4.setAge(17);
//        s4.setAddress("广州");
//        List<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        List<Student> collect1 = list.stream()
//                .sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getNo).reversed())
//                .collect(Collectors.toList());
//        System.out.println("正序：" + collect1);
//        System.out.println("============================");
//        List<Student> collect2 = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
//        System.out.println("倒序：" + collect2);
//        System.out.println("============================");
        String s = null;
        getsss(s);

        System.out.println(s);
    }

    public static void getsss(String s) {
        if (s == null) {
            s = "ssss";
        }
    }
}


class Student {
    private int No;
    private String name;
    private int age;
    private String address;

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "No=" + No +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}