import java.util.Scanner;

public class TriangleNumber {

    public static void Light() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i+" ");
            }
        }
    }

    public static String recur(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(recur(n-1) + " " + j);
        }
        return "";
    }

    public static int rec(int n){
        if(n == 1){
            System.out.println(n);
            return n;
        }
        if(n > 1){
            for (int i = n;i >= 1;i--){
                System.out.print(n+" ");
            }
        }
        return rec(n-1);//как вывести в обратном порядке?
    }
        public static void main (String[]args){
            Light();
            System.out.println("");
            recur(11);
            System.out.println("");
            rec(5);
        }
    }

