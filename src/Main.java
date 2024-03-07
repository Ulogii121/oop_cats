import animal.Cat;
import animal.Dog;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5, true);
        Dog trezor = new Dog();
        trezor.name = "Трезор";


        System.out.println(barsik.toString());
    }
}
