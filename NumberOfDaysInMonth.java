public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        getDaysinMonth(2,2000);


    }
    public static boolean Leapyear(int year){
        if(year>0&&year<9999){
            if((year%4==0 && year%100!=0)||year%400==0){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }

    public static void getDaysinMonth(int month , int year){
         switch (month){
            case 1,3,5,7,8,10,12-> System.out.println("31");
            case 4,6,9,11-> System.out.println("30");
            case 2-> {if(Leapyear(year)==true){

                System.out.println("29");
            }
            else{
                System.out.println("28");
            }
            }
    }




    }
}
