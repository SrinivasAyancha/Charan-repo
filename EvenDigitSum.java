public class EvenDigitSum {
    public static void main(String[] args) {
        PrintEvenDigitSum(45678);

    }
    public static void PrintEvenDigitSum(int num){
        int sum = 0;
        while(num!=0){
            int rem=num%10;
            if(rem%2==0){
                sum+=rem;

            }
            num/=10;
        }


        System.out.println(sum);
    }

    }

