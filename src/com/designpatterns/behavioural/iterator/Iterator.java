package com.designpatterns.behavioural.iterator;

public interface Iterator<T> {
    boolean hasNext();
    void next();
    T current();
}
