package projects.animals;

public class Fish extends Animal {
    private String squama;
    private boolean upStreamSwim;

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
    {
        this.setSwim(true);
    }
    public Fish() {
    }

    public Fish(String squama, boolean upStreamSwim) {
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish(String type, String name, String squama, boolean upStreamSwim) {
        super(type, name);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish(String type, int age, String squama, boolean upStreamSwim) {
        super(type, age);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String squama, boolean upStreamSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    void bul_bul() {
        System.out.println("Bul-Bul");
    }
}
