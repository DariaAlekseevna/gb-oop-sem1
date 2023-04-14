package org.example;

public class Cat extends Animal {

    private String color;
    private Integer age;


    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            System.out.println("данные введены некоректно");
        } else {
            this.age = age;
        }
    }

    // можно еще так, если нейминг другой, то можно избавиться от слова this.
    // this дает просто пренадлежность к классу, программа понимает что к чему присоединяется,
    // когда ставим this программа понимает,
    // что нейм который находится внутри данного класса (public class Cat)
    // присвоить то поле, которое было подано как параметр (String name)
    // когда нейминг одинаковый джава не понимает как можно в передаваемый нейм положить этот же нейм.

//    public Cat(String name1, String color1, Integer age1) {
//        name = name1;
//        color = color1;
//        age = age1;
//    }

    public Cat() {
        this.name = "Kotik"; // предзадали значение, чтобы избежать NPE (ошибка связана с null)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        // валидация
        if (age < 0) {
            System.out.println("данные введены некоректно");
        } else {
            this.age = age;
        }

    }

    @Override
    public void voice() {
        System.out.println(name + " meooow!!");
    }
}
