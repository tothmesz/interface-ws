package com.codecool.interfacews;

public interface Speaking {
    public default void speak(String words){
        System.out.println(words);
    }
}
