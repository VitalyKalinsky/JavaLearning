package projects.passwordHacker;

public class Main {
    public static String password = "1254987";

    public static void main(String[] args) {
        PassCompilator passCompilator = new PassCompilator();
        passCompilator.compilePassword(password);
    }
}
