package org.example.second;

class Singleton{
    public String str;
    private static Singleton singleton;
    private Singleton() {

    }

    public static Singleton getSingleInstance(){
        if (singleton==null){
           singleton = new Singleton();
        }
        return singleton;
    }


}