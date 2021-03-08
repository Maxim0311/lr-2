package com.lr2.util;

public class Exclusionary {     // Исключитель
    protected  boolean x;
    protected  boolean y;

    public Exclusionary(boolean a, boolean b){
        x = a;
        y = b;
    }

    public boolean calc(){
        return this.x^this.y;
    }
}
