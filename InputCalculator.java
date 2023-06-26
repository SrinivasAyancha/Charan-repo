import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPSA();

    }

    public static void inputThenPSA(){
        boolean Toquit = true;
        double count = 0;
        int sum = 0;
        double avg =0;
        while (Toquit){
            Scanner input = new Scanner(System.in);

            String a = input.nextLine();
            try {
                double b = Double.parseDouble(a);
                 sum+=b;
                count++;
            }
            catch (NumberFormatException baa){
                Toquit=false;
            }
        }
        avg = sum/count;
        System.out.println("sum : "+sum);
        System.out.println("avg : "+avg);

    }
}
