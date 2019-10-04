public class FandGtask {

    public static String VivodCifr(int n){
        if (n < 10)
            return n+" ";
        else
            return n%10 +" "+ VivodCifr(n/10);
    }

    public static String Task_G(int n){
        if (n < 10)
            return n+" ";
        return Task_G(n/10) + n%10+" ";
    }

    public static void main(String[] args) {
        System.out.println(VivodCifr(123));
        System.out.println(Task_G(123));
    }
}
