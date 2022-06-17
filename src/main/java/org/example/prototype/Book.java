package org.example.prototype;

import lombok.Getter;
import org.example.builder.People;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author yuyou
 * @since 2022/6/17 14:48
 */
@Getter
public class Book implements Cloneable, Serializable {

    private static final long serialVersionUID = 6913628848107453288L;
    private People people;

    public Book(People people){
        this.people = people;
    }

    /**
     * simple clone
     * @author yuyou
     * @since 14:50 2022/6/17
     * @return java.lang.Object
    */
    public Book clone() {
//        浅克隆
//        try {
//            return (Book) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        throw new IllegalArgumentException();
//        深度克隆
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (Book) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}
