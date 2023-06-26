public class SumOdd {
    public static void main(String[] args) {
        System.out.println(SumOdd(1,- 100));
    }
    public static boolean IsOdd(int num){
        if(num<0){
            return false;
        }
        if(num%2==0){
            return false;
        }
        return true;
    }

    public static int SumOdd(int start , int end){
        int sum = 0;
        if(start>0 && end>0){
        for(int i=start;i<=end;i++){
            if(IsOdd(i)){
               sum+=i;
            }
        }
        return sum;
        }
        return -1;
    }
}
