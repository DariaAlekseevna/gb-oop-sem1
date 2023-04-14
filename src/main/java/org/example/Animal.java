package org.example;

public class Animal {
    protected String name;
    public void animalinfo() {
        System.out.println("Информация о животном " + name);
    }

    public void voice() {
        System.out.println("Издаем звук " + name);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло " + name);
    }
}
