package oop;

public class task_4 {
    public class Entity {
        public void move() {
            System.out.println("Я передвигаюсь.");
        }

        public void eat() {
            System.out.println("Я ем.");
        }
    }

    public class Human extends
            Entity {

        public void speak() {
            System.out.println("Я умею общаться.");
        }
    }

    public class JavaDeveloper
            extends Human {

        public void code() {
            System.out.println("Я умею общаться на Java.");
        }
    }
}
