package projects.dataStructures;

public class Recursion {
    public int triangle(int n) {
        if (n == 1)
            return 1;
        else
            return (n + triangle(n - 1));
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        return (n * factorial(n - 1));
    }


}
