package projects;
import java.util.*;

public class Marks {
    public static void markCounter() {
        Scanner scanner = new Scanner(System.in);
        String marks = scanner.nextLine();
        int five = 0, four = 0, three = 0, two = 0;
        for (Integer i : UsefulMethods.parseIntInString(marks)) {
            switch (i) {
                case 5:
                    five++;
                    break;
                case 4:
                    four++;
                    break;
                case 3:
                    three++;
                    break;
                case 2:
                    two++;
                    break;
            }
        }
        int total = five + four + three + two;
        System.out.println("Пятёрок - " + five + " = " + Math.floor((double) five / total * 100) + "%");
        System.out.println("Четвёрок - " + four + " = " + Math.floor((double) four / total * 100) + "%");
        System.out.println("Троек - " + three + " = " + Math.floor((double) three / total * 100) + "%");
        System.out.println("Двоек - " + two + " = " + Math.floor((double) two / total * 100) + "%");
    }

    public static void getMiddleMark() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> marks = UsefulMethods.parseIntInString(scanner.next());
        double totalMark = 0;
        double markCount = 0;
        for (int mark : marks) {
            totalMark += mark;
            markCount++;
        }
        System.out.print("Ваш средний балл - " + totalMark / markCount);
    }

}
