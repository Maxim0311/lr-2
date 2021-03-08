package com.lr2.util;

public class Comparator {   // Компаратор
    protected  boolean x;
    protected  boolean y;

    public Comparator(boolean a, boolean b){
        x = a;
        y = b;
    }

    public boolean calc(){
        return this.x==this.y;
    }
}
