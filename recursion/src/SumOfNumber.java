public class SumOfNumber {

    public static int sum(int a){
        if(a < 10 )
            return a;
        return sum(a/10)+ a%10;
    }


    public static void main(String[] args) {
        System.out.println("summa="+sum(55));

    }
}
