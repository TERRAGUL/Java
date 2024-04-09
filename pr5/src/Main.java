// Интерфейс Animal
interface Animal {
    void eat();
    void sound();
}

// Класс Dog, реализующий интерфейс Animal
class Dog implements Animal {
    public void eat() {
        System.out.println("Собака ест кости");
    }

    public void sound() {
        System.out.println("Гав");
    }
}

// Класс Cat, реализующий интерфейс Animal
class Cat implements Animal {
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }

    public void sound() {
        System.out.println("Мяу");
    }
}

// Интерфейс Pet, расширяющий Animal
interface Pet extends Animal {
    void play();
}

// Реализация интерфейса Pet для класса Dog
class DogPet extends Dog implements Pet {
    public void play() {
        System.out.println("Собака играет с мячом");
    }
}

// Реализация интерфейса Pet для класса Cat
class CatPet extends Cat implements Pet {
    public void play() {
        System.out.println("Кошка играет с веревочкой");
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        DogPet dog = new DogPet();
        CatPet cat = new CatPet();

        dog.eat();
        dog.sound();
        dog.play();

        cat.eat();
        cat.sound();
        cat.play();
    }
}