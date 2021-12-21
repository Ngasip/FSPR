package session03;
import java.util.*;

public class BloodPressure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Systolic, Diastolic;

        if(args.length==0){
            System.out.println("Please input Argument");
        }else{
            try{
                Integer.parseInt(args[0]);
            }catch(NumberFormatException e){
                System.out.println("Not Integer for args[0]");
                System.exit(0);
            }
            try{
                Integer.parseInt(args[1]);
            }catch(NumberFormatException e){
                System.out.println("Not Integer for args[1]");
                System.exit(0);
            }
            //System.out.println("Input tekanan darah Systolic");
            Systolic = Integer.parseInt(args[0]);
            //System.out.println("Input tekanan darah Diastolic");
            Diastolic = Integer.parseInt(args[1]);

            
            if(Systolic <= 90 || Diastolic <= 60){
                System.out.println("Low Blood Pressure");
            }else if(Systolic >= 140 || Diastolic >= 90){
                System.out.println("High Blood Pressure");
            }else if(Systolic >= 120 || Diastolic >= 80){
                System.out.println("pre-High Blood Pressure");
            }else{
                System.out.println("Ideal Blood Pressure");
            }
        }
    }
}
