package Pashkovsky;

import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(2);
        cat.getName();
        cat.getAge();
        cat.check();

    }

    @Test
    public static void newCat() {
        Cat cat = new Cat();
        cat.setName("Bro");
        cat.setAge(13);
        cat.getName();
        cat.getAge();
        cat.check();


    }

    @Test
    public void newCat1() {
        Cat cat = new Cat();
        cat.setName("Morda");
        cat.setAge(23);
        cat.getName();
        cat.getAge();
        cat.check();


    }

    @Test
    public void newCat2() {
        Cat cat = new Cat();
        cat.setName("jopa");
        cat.setAge(3);
        cat.getName();
        cat.getAge();
        cat.check();
    }
}
