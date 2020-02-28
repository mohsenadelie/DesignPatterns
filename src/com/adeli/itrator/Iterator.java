package com.adeli.itrator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
