package projects.animals;

public class Bird extends Animal {
    private String area;
    private boolean winterFly;

    static int a = 0;
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    static void soid(){
        System.out.println(123);
    }

    {
        a++;
    }
    public Bird() {
        super();
    }

    public Bird(String area) {
        this.area = area;
    }

    public Bird(String type, String name) {
        super(type, name);
    }

    public Bird(String type, int age, String area, boolean winterFly) {
        super(type, age);
        this.area = area;
        this.winterFly = winterFly;
    }

    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;
    }

    void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }

    @Override
    void display() {
        System.out.printf("Я " + this.getClass() +
                        "Тип: %s, " +
                        "Имя: %s, " +
                        "Возраст: %d, " +
                        "Вес: %.1f, " +
                        "Умеет летать: %b, " +
                        "Умеет ходить: %b, " +
                        "Умеет плавать: %b.\n\n", this.getType(), super.getName(), this.getAge(), this.getWeight(),
                this.isFly(), this.isWalk(), this.isSwim());
    }
}
