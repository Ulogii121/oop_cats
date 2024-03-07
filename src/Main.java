import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5, true);
        Cat tuzik = new Cat("Барсик", 5, true);

        boolean isEqualsCats = barsik.equals(tuzik);
        System.out.println(isEqualsCats);
    }
}
