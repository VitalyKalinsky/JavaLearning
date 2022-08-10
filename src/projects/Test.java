package projects;

public class Test {
    public static void main(String[] args) {
        System.out.println(translateDecToBin(255));
    }

    public static String translateDecToBin(int dec){
        String binNum = "";
        while(dec != 0){
            binNum = dec % 2 + binNum;
            dec /= 2;
        }
        return binNum;
    }
}
