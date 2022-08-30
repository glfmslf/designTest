package org.example.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author yuyou
 * @since 2022/8/30 16:11
 */
public class ListIterator<E> implements Iterator<E> {

    private int cursor;

    private ArrayList<E> list;

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor > list.size()) {
            throw new NoSuchElementException();
        }
        return list.get(cursor);
    }
}
