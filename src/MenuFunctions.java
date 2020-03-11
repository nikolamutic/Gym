import com.google.gson.Gson;

import javax.net.ssl.HostnameVerifier;
import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.util.*;

import static java.lang.Math.log10;

public class MenuFunctions {

    public static String userNameEntry(){
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, please enter username.");
        String userName = s.nextLine();
        return userName;
    }
    public static String passwordEntry(){
        Scanner s = new Scanner(System.in);
        System.out.println("Now please enter your password.");
        String password = s.nextLine();
        return password;
    }
    public static void coachMenu(){
        System.out.println("Hi coach, select one option from above.");
        System.out.println("1) Members");
        System.out.println("2) Create new user");
        System.out.println("0) Quit");
    }
    public static void coachMembers(){
        System.out.println("Members:");
    }

    public static void coachedMenu(){
        System.out.println("You are being coached, so select one of the options from above.");
        System.out.println("1) Exercises");
        System.out.println("2) Meals");
        System.out.println("3) Calculations");
        System.out.println("4) Quit");
    }
    public static void exercisesMenu(){
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"Exercises");
        System.out.println("1) Close Grip Bench Press");
        System.out.println("2) Decline Press");
        System.out.println("3) Push-Ups");
        System.out.println("4) Parallel Bar Dips");
        System.out.println("5) Dumbell Press");
        System.out.println("6) Incline Press");
    }
    public static String mealsMenu(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.get(Calendar.DAY_OF_WEEK);
        String day3 = "";
            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case 2:
                    day3 = "Monday";
                    break;
                case 3:
                    day3 = "Tuesday";
                    break;
                case 4:
                    day3 = "Wednesday";
                    break;
                case 5:
                    day3 = "Thursday";
                    break;
                case 6:
                    day3 = "Friday";
                    break;
                case 1:
                    day3 = "Saturday";
                    break;
                case 7:
                    day3 = "Sunday";
                    break;
            }
            return day3;
    }

    public static void declinePressMenu(){
        System.out.println("Decline Press");
        Exercises.declinePress();
        ExercisesInterface e;
        e = new Exercises();
        System.out.println("Do "+e.reps()+" reps");
        System.out.println("Do "+e.sets()+" sets");
        System.out.println(e.rest());
        System.out.println("0) Exit");
    }
    public static void closeGripBenchPress(){
        System.out.println("Close Grip Bench Press");
        Exercises.closeGripBenchPress();
        ExercisesInterface e;
        e = new Exercises();
        System.out.println("Do "+e.reps()+" reps");
        System.out.println("Do "+e.sets()+" sets");
        System.out.println(e.rest());
        System.out.println("0) Exit");
    }
    public static void pushUps(){
        System.out.println("Push-Ups");
        Exercises.pushUps();
        ExercisesInterface e;
        e = new Exercises();
        System.out.println("Do "+e.reps()+" reps");
        System.out.println("Do "+e.sets()+" sets");
        System.out.println(e.rest());
        System.out.println("0) Exit");
    }
    public static void parallelBarDips(){
        System.out.println("Parallel Bar Dips");
        Exercises.parallelBarDips();
        ExercisesInterface e;
        e = new Exercises();
        System.out.println("Do "+e.reps()+" reps");
        System.out.println("Do "+e.sets()+" sets");
        System.out.println(e.rest());
        System.out.println("0) Exit");
    }
    public static void dumbellPress(){
        System.out.println("Dumbell Press");
        Exercises.dumbellPress();
        ExercisesInterface e;
        e = new Exercises();
        System.out.println("Do "+e.reps()+" reps");
        System.out.println("Do "+e.sets()+" sets");
        System.out.println(e.rest());
        System.out.println("0) Exit");
    }
    public static void inclinePress(){
        System.out.println("Incline Press");
        Exercises.inclinePress();
        ExercisesInterface e;
        e = new Exercises();
        System.out.println("Do "+e.reps()+" reps");
        System.out.println("Do "+e.sets()+" sets");
        System.out.println(e.rest());
        System.out.println("0) Exit");
    }
    public static void calculateBMI(){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your weight in Kg: ");
        float weight = s.nextFloat();
        System.out.print("Please enter your height in Cm: ");
        float height = s.nextFloat();
        float bmi = (100*100*weight)/(height*height);
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);
    }
    private static void printBMICategory(float bmi) {
        System.out.println("Underweight is less than 18.5");
        System.out.println("Normal is from 18.5 to 25");
        System.out.println("Overweight is from 25 to 30");
        System.out.println("Obese is more than 30");
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
    public static void bodyFatCalculator(){
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter your waist width (at narrowest)");
            int waist = s.nextInt();
            System.out.println("Please enter your hip width (at narrowest)");
            int hip = s.nextInt();
            System.out.println("Please enter your neck width (at narrowest)");
            int neck = s.nextInt();
            System.out.println("Please enter your height in Cm");
            int height = s.nextInt();
            double bodyFat = 495 / (1.29579 - .35004 * log10(waist + hip - neck) + .22100 * log10(height)) - 450;
            long intBodyFat = Math.round(bodyFat);
            System.out.println(intBodyFat+"%");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void fatMass(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your weight");
        int weight = s.nextInt();
        System.out.println("Please enter your waist width (at narrowest)");
        int waist = s.nextInt();
        System.out.println("Please enter your hip width (at narrowest)");
        int hip = s.nextInt();
        System.out.println("Please enter your neck width (at narrowest)");
        int neck = s.nextInt();
        System.out.println("Please enter your height in Cm");
        int height = s.nextInt();
        double bodyFat = 495 / (1.29579 - .35004 * log10(waist + hip - neck) + .22100 * log10(height)) - 450;
        long intBodyFat = Math.round(bodyFat);
        int fatMass = (int) (bodyFat*weight);
        fatMass=fatMass/100;
        System.out.println("Your fat mass percentage is: "+fatMass+"%");
        int leanMass=weight-fatMass;
        System.out.println("Your Lean mass is: "+leanMass+"kg");
    }
    public static void writer(ArrayList<User> arrayList) throws FileNotFoundException {
        PrintWriter pWriter = new PrintWriter("members.json");
        Gson gson=new Gson();
        String json=gson.toJson(arrayList);
        pWriter.println(json);
        pWriter.close();
    }


}
