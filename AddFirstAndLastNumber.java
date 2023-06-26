public class AddFirstAndLastNumber {
    public static void main(String[] args) {
        System.out.println( Addnum(235));
    }

    public static int Addnum(int a) {
//       int digits = (int)Math.log10(a); // number of digits - 1
//       int firstDigit = (int)(a / Math.pow(10, digits));
//        int lastDigit = a % 10;
//        return firstDigit+lastDigit;

        int ld = a%10;
        while(a>9){
            a/=10;
        }
        return a+ld;

    }
}
