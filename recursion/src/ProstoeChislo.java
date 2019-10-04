public class ProstoeChislo {

    public static String prost(int a,int n){
            //мой вариант
       if (a<2){
           return "no";
       }
       if (a==2){
           return "yes";
       }
       if (a%n == 0){
           return "no";
       }
       if (n < a/2){
           return prost(a,n+1);
       }
       else
           return "yes";
    }

    public static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(prost(44,2));
        System.out.println(recursion(18, 2));

    }
}
