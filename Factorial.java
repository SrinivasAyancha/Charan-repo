public class Factorial {
    public static void main(String[] args) {
        CheckFactorial(5);

    }
    public static void CheckFactorial(int num){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact*=i;

        }
        System.out.println(fact);

    }
}
