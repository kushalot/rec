public class Srednee {
    public static void recursion(int sum, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            recursion(sum + n, ++count);
        } else if (sum > 0 && count > 0) {
            System.out.println((float) sum / count);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0);
    }
}
