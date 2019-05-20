package model5.interfaces.impl;

import model5.interfaces.Animal;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("The dog is eating vegetables");
    }
}
