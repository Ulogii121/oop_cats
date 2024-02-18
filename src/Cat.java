public class Cat {
    String name;
    int age;
    boolean softness;
    static int catsPopulation = 1000;

    Cat(String catName, int catAge, boolean catSoftness) {
        this.name = catName;
        this.age = catAge;
        this.softness = catSoftness;
    }

    Cat(String catName) {
        this.name = catName;
    }

    public static void getPopulation() {
        System.out.println("Всего в мире " + catsPopulation + " котиков");
    }

    public void eat() {
        System.out.println("Котик " + this.name + " ест");
    }

    public void sleep() {
        System.out.println("Котик " + this.name + " спит");
    }

    public int shit() {
        System.out.println("Котик " + this.name + " нагадил!");
        return age * 2;
    }
}
