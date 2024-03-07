package animal;

public class Dog extends Animal {
    public String name;

    @Override
    public void voice() {
        System.out.println("Гавкает");
    }

    public void run() {
        System.out.println(this.name + " бегает");
    }

    public void run(int km) {
        System.out.println(this.name + " пробежал уже " + km + " километра");
    }

    public String run(String place) {
        return this.name + " бегает " + place;
    }
}
