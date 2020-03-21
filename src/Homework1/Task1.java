package Homework1;


public class Task1 {
    public static void main(String[] args) {
        System.out.print(factRecursion(15) + " ! ");

    }

    private static int factRecursion(int n) {
        int result = 1;
        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }
        result = n * factRecursion(n - 1);
        return result;
    }
}
