package org.example;

//1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(); // оператор нью веделяет память, cat - объект.
        //возникла проблема из-за того, что перестал работать к-тор по умолчанию
//        cat.name = "Boris";
//        cat.color = "Orange";
//        cat.age = 4;
//        System.out.println("Cat name: " + cat.name + " color: " + cat.color + " age: " + cat.age);

        // в чем минус когда обращ к полям напрямую?
        // сокрытие данных - инкапсуляция

        Cat cat2 = new Cat("Marzik","asd", 123); // положили значения
        cat2.setAge(4); // переприсвоили возраст
        System.out.println("Cat name: " + cat2.getName() + " color: " + cat2.getColor() + " age: " + cat2.getAge());
        // вывод: Cat name: qwe color: asd age: 4
        // валидация полей
        // можно делать в двух метсах: внутри программного кода или на уровне ввода данных
        // нас интересует на уровне ввода данных
        cat2.setAge(-10);
        System.out.println("Cat name: " + cat2.getName() + " color: " + cat2.getColor() + " age: " + cat2.getAge());
        Cat cat3 = new Cat("Barsik","black", -12);
        System.out.println("Cat name: " + cat3.getName() + " color: " + cat3.getColor() + " age: " + cat3.getAge());
        Cat cat4 = new Cat(); // не заданы поля
        cat2.animalinfo();
        cat3.jump();
        cat2.voice();
        cat4.animalinfo(); // высвечивается предзаданное значение вместо нулл (Информация о животном Kotik)

    }
}
