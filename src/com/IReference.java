package com;

public class IReference<T> {
    private volatile boolean valid;
    private volatile T value;

    boolean isValid() {
        return valid;
    }

    void invalidate() {
        valid = false;
    }

    T set(T value) {
        T old = this.value;
        this.value = value;
        valid = true;
        return old;
    }

    T get() {
        return value;
    }
}