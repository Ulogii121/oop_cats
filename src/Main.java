public class Main {
    public static void main(String[] args) {
        SiamCat barsik = new SiamCat("Барсик", 5, true);
        BritishCat tuzik = new BritishCat("Тузик",10, false);
        barsik.sleep();
        System.out.println(tuzik.age);

        Animal animal = new Animal();
        System.out.println(animal.toString());
    }
}
