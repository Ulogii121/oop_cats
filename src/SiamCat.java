public class SiamCat extends Cat {

    SiamCat(String catName, int catAge, boolean catSoftness) {
        super(catName, catAge, catSoftness);
    }

    public void angry() {
        System.out.println("Котик "+ this.name + " злой!");
    }
}
