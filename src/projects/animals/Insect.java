package projects.animals;


public class Insect extends Animal{
    private int wingCount;
    private boolean likeJesus;

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public Insect(){
        this.setWalk(true);
    }

    public Insect(int wingCount, boolean likeJesus) {
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
        this.setWalk(true);
    }

    public Insect(String type, String name, int wingCount, boolean likeJesus) {
        super(type, name);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
        this.setWalk(true);
    }

    public Insect(String type, int age, int wingCount, boolean likeJesus) {
        super(type, age);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
        this.setWalk(true);
    }

    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, int wingCount, boolean likeJesus) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
        this.setWalk(true);
    }
    public void ggggg(){
        System.out.println("Ggggg");
    }
}
