public class Sum3And5 {
    public static void main(String[] args) {
        int sum=0,count=0;
        for(int i = 1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println("This number is "+i+"divided by both 3 and 5");
                sum+=i;
                count++;
            }
            if(count==5){
                System.out.println(sum);
                break;
            }

        }
    }
}
