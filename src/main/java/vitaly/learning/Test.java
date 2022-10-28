package projects;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Vasya", "639", 15);
        ObjectMapper
    }
}

class Person implements Serializable {

    String name;
    String id;
    int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", id=" + id +
                ", age=" + age +
                "}";
    }
}