package com.example.java_practice.design_pattern;

import java.io.Serializable;

public class SingletonInstance implements Cloneable, Serializable {

    private static SingletonInstance instance;
    public SingletonInstance() {
        if(instance!=null) {
            throw new RuntimeException("you are breaking singleton pattern");
        }
    }

    public static SingletonInstance getInstance() {
        if (instance == null) {
            synchronized (SingletonInstance.class) {
                if (instance == null) {
                    instance = new SingletonInstance();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public Object readResolve() {
        return instance;
    }
}
