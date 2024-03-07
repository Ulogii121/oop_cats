package animal;

public class Cat extends Animal {
    private final String name;
    private int age;
    private boolean softness;
    private static int catsPopulation = 1000;

    @Override
    public String toString() {
        String softnessStr;
        if (this.softness) softnessStr = "мягкий";
        else softnessStr = "жоский";
        return "Котика зовут " + this.name + ". Ему " + this.age + ". Он " + softnessStr;
    }

    @Override
    public void voice() {
        System.out.println("Мяукает");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0) System.out.println("Ошибка! Возраст должен быть больше 0");
        if (age < this.age) System.out.println("Котик может только взрослеть!");
        else this.age = age;
    }

    public boolean isSoftness() {
        return softness;
    }

    public void setSoftness(boolean softness) {
        this.softness = softness;
    }

    public static int getCatsPopulation() {
        return catsPopulation;
    }

    public static void setCatsPopulation(int catsPopulation) {
        Cat.catsPopulation = catsPopulation;
    }

    public Cat(String catName, int catAge, boolean catSoftness) {
        this.name = catName;
        this.age = catAge;
        this.softness = catSoftness;
    }

    public Cat(String catName) {
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
