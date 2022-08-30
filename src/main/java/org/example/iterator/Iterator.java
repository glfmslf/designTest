package org.example.iterator;

/**
 * @author yuyou
 * @since 2022/8/30 16:14
 */
public interface Iterator<E>{
    boolean hasNext();

    void next();

    E currentItem();
}
