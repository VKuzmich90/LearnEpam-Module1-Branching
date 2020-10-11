package epam.learn.module1.branching;

public class Task4 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double x = 5.5;
        double y = 3;
        double z = 2.1;
        if (((x <= a) && (y <= b)) || ((x <= b) && (y <= a)) || ((x <= a) && (z <= b)) ||
                ((x <= b) && (z <= a)) || ((y <= a) && (z <= b)) || ((y <= b) && (z <= a))) {
            System.out.println("The brick will go through the hole");

        } else System.out.println("The brick will not go through the hole");
    }

}
