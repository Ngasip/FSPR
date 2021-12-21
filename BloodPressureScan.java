package session03;
import java.util.*;

public class BloodPressureScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Systolic, Diastolic;
        String temp = "temporal";
        String scanExit;
        int intExit;
        boolean exit = false;
        boolean fl;
        while(exit == false){
            fl = true;
            while(fl == true){
                // if(scanExit == 1){
                //     temp = sc.nextLine();
                // }
                System.out.println("Input tekanan darah Systolic");
                temp = sc.nextLine();
                fl = false;
                try{
                    Integer.parseInt(temp);
                }catch(NumberFormatException e){
                    System.out.println("Not Int, Please input int");
                    fl = true;
                }
            }
            Systolic = Integer.parseInt(temp);
            fl = true;
            while(fl == true){
                System.out.println("Input tekanan darah Diastolic");
                temp = sc.nextLine();
                fl = false;
                try{
                    Integer.parseInt(temp);
                }catch(NumberFormatException e){
                    System.out.println("Not Int, Please input int");
                    fl = true;
                }
            }
            Diastolic = Integer.parseInt(temp);

            if(Systolic <= 90 || Diastolic <= 60){
                System.out.println("Low Blood Pressure");
            }else if(Systolic >= 140 || Diastolic >= 90){
                System.out.println("High Blood Pressure");
            }else if(Systolic >= 120 || Diastolic >= 80){
                System.out.println("pre-High Blood Pressure");
            }else{
                System.out.println("Ideal Blood Pressure");
            }
            
            System.out.println("Do you want to try again?");
            System.out.println("1. Again");
            System.out.println("2. Stop");
            scanExit = sc.nextLine();
            intExit = Integer.parseInt(scanExit);
            if(intExit == 2){
                exit = true;
            }
        }
    }
}
