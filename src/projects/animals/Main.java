package projects.animals;

public class Main{
    public static void main(String[] args) {
        Man man = new Man();
        Person person = new Person();
        Person oman = new Man();
        System.out.println(Man.stat);

    }
}
class Person {
    private static int num = 0;
    static int stat = 1;

    static {
        num++;
    }
    int getNum(){
        return num;
    }
}
class Man extends  Person{
    void doSomething(){
        System.out.println("it is doing something");
    }
}
