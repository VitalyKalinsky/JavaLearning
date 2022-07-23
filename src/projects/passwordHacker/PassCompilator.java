package projects.passwordHacker;

import java.util.*;

public class PassCompilator {
    Random random = new Random();

    private static final List<Integer> listOfChars = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    public String compilePassword(String realPassword) {
        Set setOfUsedPass = new HashSet();
        StringBuilder suggestedPassword = new StringBuilder();
        int let = realPassword.length();
        while (!(suggestedPassword.toString().equals(realPassword))) {

            suggestedPassword = new StringBuilder();
            //TODO: сделать условие, при котором если парольне угадан, а символов больше, то возвращаться --
            if (Math.pow(listOfChars.size(), let) == setOfUsedPass.size()) {
                System.out.println(let + "-численные пароли закончились");
                let++;
                setOfUsedPass.clear();
            }

            for (int i = 0; i < let; i++) {
                suggestedPassword.append(listOfChars.get(random.nextInt(listOfChars.size())));
            }

            if (!(setOfUsedPass.contains(suggestedPassword))) setOfUsedPass.add(suggestedPassword);
            System.out.println("пароль - " + suggestedPassword + "\nдлина списка паролей - " + setOfUsedPass.size() + "\nитераций - ");
        }

        return suggestedPassword.toString();
    }

    private static List<Character> generateChars() {
        List<Character> listOfChars = new ArrayList<>();
        for (int i = 32; i < 127; i++) {
            listOfChars.add((char) i);
        }
        return listOfChars;
    }
}
