public class Power2 {
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        else if (n%2 != 0) {
            return 0;
        }
        else {
            return recursion(n / 2);
        }
    }


    public static void main(String[] args) {
        int n = 1238;
        if (recursion(n) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
