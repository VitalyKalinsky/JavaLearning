package projects.animals;


public class Animal {
    private String type;
    private String name;
    private int age = 0;
    private double weight = 0;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public Animal(){

    }
    public Animal(String type, String name){
        this.type = type;
        this.name = name;
    }
    public Animal(String type, int age){
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }
    public Animal(String type, String name, int age, double weight,
                  boolean isFly,  boolean isWalk,  boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    void display(){
        System.out.printf("Тип: %s, " +
                "Имя: %s, " +
                "Возраст: %d, " +
                "Вес: %.1f, " +
                "Умеет летать: %b, " +
                "Умеет ходить: %b, " +
                "Умеет плавать: %b.\n\n", type, name, age, weight,
                 isFly, isWalk, isSwim);
    }
    void rename(String s){
        this.name = s;
    }
    void holiday(int hol){
        this.weight += hol * 0.1;
    }
    void holiday(){
        this.weight += 0.1;
    }
    void holiday(double m){
        this.weight += m;
    }
    void holiday(double m, int n){
        this.weight += m * n;
    }
}
