public class Factors {
    public static void main(String[] args) {

        AllFactors(6);

    }
    public static void AllFactors(int num){
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
