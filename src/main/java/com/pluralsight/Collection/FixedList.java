package com.pluralsight.Collection;
import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public boolean add(T item) {
        if (items.size() >= maxSize) {
            System.out.println("Cannot add item: list is full.");
            return false;
        }
        items.add(item);
        return true;
    }

    public List<T> getItems() {
        return items;
    }
}