package org.example.factory;

import lombok.Data;
import lombok.ToString;

/**
 * @author yuyou
 * @since 2022/6/14 23:32
 */
public interface People {

}

@Data
@ToString
class Man implements People {
//    public Man(){
//        super();
//        System.out.println("man class");
//    }
    private int type;
    public int getType() {
        return 1;
    }
}

@Data
@ToString
class Women implements People {
//    public Women(){
//        super();
//        System.out.println("women class");
//    }
    private int type;

    public int getType() {
        return 2;
    }
}

@Data
@ToString
class Student implements People {
//    public Student(){
//        super();
//        System.out.println("student class");
//    }
    private int type;
    public int getType() {
        return 3;
    }
}

@Data
@ToString
class Teacher implements People {
//    public Teacher(){
//        super();
//        System.out.println("teacher class");
//    }
    private int type;
    public int getType() {
        return 4;
    }
}
