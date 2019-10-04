public class Akkerman {
    public static int recursion(int m, int n) {
        // Базовый случай
        if (m == 0) {
            return n + 1;
        } // Шаг рекурсии / рекурсивное условие
        else if (n == 0 && m > 0) {
            return recursion(m - 1, 1);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(m - 1, recursion(m, n - 1));
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(4, 0));
    }
//аккермана не понял
}
