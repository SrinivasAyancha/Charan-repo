public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(DigitSum(456 ));

    }

    public static int DigitSum(int a){
        int rem=0,sum=0;
        while (a!=0){
            rem = a%10;
            sum+=rem;
            a/=10;
        }
        return sum;
    }
}
