public class Ot1doN {
    private static int n=10;

    public static String rec(int n){
        if (n == 0)
            return "0";

        return rec(n-1)+" "+n;
    }

    public static void main(String[] args) {

        System.out.println(rec(n));
    }
}
