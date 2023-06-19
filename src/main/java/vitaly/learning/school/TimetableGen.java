package vitaly.learning.school;

import java.text.SimpleDateFormat;
import java.util.*;

public class TimetableGen {
    static List<List<String>> timetable = new ArrayList<>();
    static Calendar currentDate = new GregorianCalendar();
    private static int day;
    static String[] daysOfWeek = { "Понедельник", "Вторник", "Среду", "Четверг", "Пятницу", "Субботу", "Понедельник" };

    public static void main(String[] args) {
        createTimetable();
        printTimetable();
    }

    static void printTimetable() {

        if (currentDate.get(Calendar.DAY_OF_WEEK) >= 7) {
            day = 0;
            currentDate.set(Calendar.DAY_OF_MONTH, currentDate.get(Calendar.DAY_OF_MONTH) + 2);
        } else {
            day = currentDate.get(Calendar.DAY_OF_WEEK) - 1 ;
            currentDate.set(Calendar.DAY_OF_MONTH, currentDate.get(Calendar.DAY_OF_MONTH) + 1);
        }
        System.out.printf("ДЗ на %s %s: \n\n", daysOfWeek[day], new SimpleDateFormat("dd.MM").format(currentDate.getTime()));

        timetable.get(day).forEach(x -> System.out.println(x + ": \n"));

        System.out.println("ЕСЛИ ЧТО-ТО НЕПРАВИЛЬНО ИЛИ НЕ ТОЧНО, ПРОШУ СООБЩИТЬ В КОММЕНТАРИЯХ!");
    }

    static void createTimetable() {
        String[][] timetableLessons = { { "Информатика", "Испанский", "Французский", "ОБЖ", "Литра", "Физика" },

                { "Физика", "География", "Русский", "Биология","Алгебра", "Геометрия" },

                { "История", "Русский", "Английский(группа КС)", "Английский(группа АП)", "Алгебра", "Литра" },

                { "Физика","Русский", "Английский(группа КС)", "Английский(группа АП)", "История", "Испанский", "Французский",
                        "Геометрия" },

                { "Химия", "Биология", "Алгебра", "Английский(группа КС)", "Английский(группа АП)", "Литра", "География" },

                { "Английский(группа КС)", "Английский(группа АП)", "Химия", "История", "Обществознание"} };

        for (String[] string : timetableLessons) {
            timetable.add(Arrays.asList(string));
        }
    }
}
