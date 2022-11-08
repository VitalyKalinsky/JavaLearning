package vitaly.learning.passwordHacker;

import java.util.*;

public class PassCompilator {
    Random random = new Random();

    private static final List<Character> listOfChars = generateChars();

    public String compilePassword(String realPassword) {
        long countOfUsedPass = 0;
        StringBuilder suggestedPassword = new StringBuilder();
        int let = 1;
        while (!(suggestedPassword.toString().equals(realPassword))) {

            suggestedPassword = new StringBuilder();
            //TODO: сделать условие, при котором если парольне угадан, а символов больше, то возвращаться --
            if (Math.pow(listOfChars.size(), let) == countOfUsedPass) {
                System.out.println(let + "-численные пароли закончились");
                let++;
                countOfUsedPass = 0;
            }

            for (int i = 0; i < let; i++) {
                suggestedPassword.append(listOfChars.get(random.nextInt(listOfChars.size())));
            }

            countOfUsedPass++;
            System.out.println("пароль - " + suggestedPassword + "\nдлина списка паролей - " + countOfUsedPass + "\nитераций - ");
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