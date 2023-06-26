public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGCD(12,30);

    }
    public static void getGCD(int a,int b){
        if(a<10 || b<10){
            System.out.println("-1");

        }
        else{
            int g=0;
            for(int i = 1 ;i<=(Math.max(a,b)/2);i++){
                if((a%i)==0 && (b%i)==0){

                     g = i;

                }
            }
            System.out.println(g);

        }

    }
}
