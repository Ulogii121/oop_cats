package animal;

public class Dog extends Animal implements Runnable, Swimmable {
    public String name;

    @Override
    public boolean equals(Cat cat) {
        return false;
    }

    @Override
    public void voice() {
        System.out.println("Гавкает");
    }


    @Override
    public void swim() {

    }

    @Override
    public void run() {

    }
}
