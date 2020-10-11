package epam.learn.module1.branching;

public class Task5 {
    public static void main(String[] args) {
        double x = 4;
        if (x <= 3) {
            System.out.println(Math.pow(x, 3) - 3 * x + 9);
        } else System.out.println(1 / (Math.pow(x, 3) + 6));
    }
}
