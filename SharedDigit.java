public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(101,11));

    }

    public static boolean hasSharedDigit(int a,int b){
        if(a<10||b>99){
            return false;
        }
        else{
            int x = a%10;
            int y = b%10;
            a/=10;
            b/=10;
            return ((a==b) || (a==y)||(a==b)||(b==x));
        }
    }
}
