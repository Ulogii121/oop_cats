public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 2, true);
        Cat murzik = new Cat("Мурзик");

        /*Cat.catsPopulation = 1001;
        Cat.getPopulation();*/

        System.out.println(Cat.catsPopulation);

        Cat.catsPopulation = 1001;
        barsik.catsPopulation = 1500;
        murzik.catsPopulation = 500;

        System.out.println(Cat.catsPopulation);
        System.out.println(barsik.catsPopulation);
        System.out.println(murzik.catsPopulation);

        /*Cat barsik = new Cat();
        barsik.name = "Барсик";
        barsik.age = 2;
        barsik.softness = true;*/

        //murzik.name = "Мурзик";

        // System.out.println(barsik.name + " " + barsik.age + " " + barsik.softness);

        /*barsik.eat();
        barsik.sleep();
        murzik.eat();
        murzik.sleep();

        int result = barsik.shit();
        System.out.println(result);*/

        System.out.println(murzik.name);
        System.out.println(murzik.age);
        System.out.println(murzik.softness);
    }
}
