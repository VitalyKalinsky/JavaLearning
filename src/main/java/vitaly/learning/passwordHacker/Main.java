package projects.passwordHacker;

public class Main {
    public static String password = "dfgd";

    public static void main(String[] args) {
        PassCompilator passCompilator = new PassCompilator();
        passCompilator.compilePassword(password);
    }
}
