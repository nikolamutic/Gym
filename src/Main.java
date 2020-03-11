import javax.crypto.Cipher;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.security.cert.CertificateParsingException;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        user.add(new Coach("Nikola", "Mutic", "niki", "rastaman4", "fake@gmail.com", "0644433221"));
        user.add(new Coached("Marko", "Jokic", "marko", "jokic"));
        user.add(new Coached("Nikola", "Markovic", "nikolaa", "maro"));
        Meals[] meals = new Meals[7];
        meals[0] = new Meals(7, "Tomato Toast with Macadamia Ricotta", "Strata primavera", "Avocado Egg Salad Recipe", "Summer Minestrone", "Pomegranate chicken with almond couscous", "Pan-Fried Tilapia", "Monday");
        meals[1] = new Meals(7, "Avocado Toast with Egg", "Crêpes with shrimp, spinach and herb filling", "Quinoa quesadillas", "Charred Shrimp and Avocado Salad", "Linguine with avocado, tomato & lime", "Italian Sausage Stuffed Zucchini", "Tuesday");
        meals[2] = new Meals(7, "Nut Butter, Banana, and Chia Seed Toast", "Smoked salmon eggs Benedict with creamy dill caper sauce", "Oatmeal Chocolate Chip", "Roasted Salmon with Green Beans and Tomatoes", "Chicken satay salad", "Chicken Parm Stuffed Peppers", "Wednesday");
        meals[3] = new Meals(7, "Berry and Yogurt Smoothie", "Red pepper and fennel frittata", "Quinoa Quesadillas", "Maple-Glazed Five-Spice Pork", "Spiced carrot & lentil soup", "Baked Catfish", "Thursday");
        meals[4] = new Meals(7, "Berry Breakfast Parfait", "Cinnamon oatmeal pancakes ", "Mini Ham and Cheese Quinoa Cups", "Chicken and Red Plum Salad", "Fresh salmon with Thai noodle salad", "Stuffed Cabbage", "Friday");
        meals[5] = new Meals(7, "Peanut Butter and Banana Smoothie", "Banana bread", "Peanut Butter Yogurt Fruit Dip", "Grilled Ratatouille Linguine", "Egyptian egg salad", "Caprese Zoodles", "Saturday");
        meals[6] = new Meals(7, "Pumpkin Granola Yogurt Parfait", "Three citrus mint dressing with seasonal fresh fruit ", "Chocolate Peanut Butter Cake Cheese Ball", "Salmon BLT", "Prawn & salmon burgers with spicy mayo", "Taco Tomatoes", "Sunday");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        boolean programOn = true;
        //boolean condition = false;
        /*ArrayList<User>CoachedList=new ArrayList<User>();
        CoachedList.add(user[1]);
        CoachedList.add(user[2]);*/
        Scanner s = new Scanner(System.in);
        /******************************************************
         Old way
         ******************************************************
         System.out.println("Hello, please enter username.");
         String userName = s.nextLine();
         System.out.println("Now please enter your password.");
         String password = s.nextLine();
         *********************************************************
         NAPOMENA
         *********************************************************
         gson file gotta be on desktop in order to work with this project
         */
        String userName = MenuFunctions.userNameEntry();
        String password = MenuFunctions.passwordEntry();

        while (programOn == true) {
            User logged=null;
            for (User k : user) {
                logged = k.check(userName, password);
                if (logged != null) {
                    System.out.println("Welcome " + k.getName());
                    break;
                }
            }
            if (logged != null) {
                if (logged.isCoach() == true) {
                    MenuFunctions.coachMenu();
                    int choice = s.nextInt();
                    switch (choice) {
                        case 1:
                            MenuFunctions.coachMembers();
                            for (int i = 0; i < user.size(); i++) {
                                System.out.println(user.get(i));
                            }
                            System.out.println("0) Back");
                            int choiceMembers = s.nextInt();
                            if (choiceMembers == 0) {
                                break;
                            }
                        case 2:
                            System.out.println("Enter name.");
                            String name1 = s.next();
                            System.out.println("Enter last name.");
                            String lastName1 = s.next();
                            System.out.println("Enter username.");
                            String uName = s.next();
                            System.out.println("Enter password.");
                            String pwd = s.next();
                            user.add(new Coached(name1, lastName1, uName, pwd));
                            System.out.println("Member successfully created");
                            System.out.println("0) Back");
                            int choiceMemberss = s.nextInt();
                            if (choiceMemberss == 0) {
                                break;
                            }

                        case 0:
                            try {
                                MenuFunctions.writer(user);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Users successfully updated.");
                            programOn = false;
                            break;
                        default:
                            System.out.println("You entered wrong number!");
                            break;

                    }
                } else {
                    MenuFunctions.coachedMenu();
                    int choice = s.nextInt();
                    switch (choice) {
                        case 1:
                            MenuFunctions.exercisesMenu();
                            int chc = s.nextInt();
                            switch (chc) {
                                case 1:
                                    MenuFunctions.closeGripBenchPress();
                                    int cchc = s.nextInt();
                                    if (cchc == 0) {
                                        break;
                                    }
                                case 2:
                                    MenuFunctions.declinePressMenu();
                                    int ccchc = s.nextInt();
                                    if (ccchc == 0) {
                                        break;
                                    }
                                case 3:
                                    MenuFunctions.pushUps();

                                    int cccchc = s.nextInt();
                                    if (cccchc == 0) {
                                        break;
                                    }
                                case 4:
                                    MenuFunctions.parallelBarDips();
                                    int ccccchc = s.nextInt();
                                    if (ccccchc == 0) {
                                        break;
                                    }
                                case 5:
                                    MenuFunctions.dumbellPress();
                                    int cccccchc = s.nextInt();
                                    if (cccccchc == 0) {
                                        break;
                                    }
                                case 6:
                                    MenuFunctions.inclinePress();
                                    int ccccccchc = s.nextInt();
                                    if (ccccccchc == 0) {
                                        break;
                                    }
                                default:
                                    System.out.println("You entered wrong number!");
                                    break;

                            }
                            break;
                        case 2:
                            MenuFunctions.mealsMenu();
                            String day3 = MenuFunctions.mealsMenu();
                            String dayToday;
                            System.out.println("Meals for " + day3);
                            for (Meals j : meals) {
                                if (j.getDay().equals(day3)) {
                                    System.out.println(j.toString());
                                }
                            }
                            break;
                        case 3:
                            System.out.println("1) BMI Calculator");
                            System.out.println("2) Body fat percentage calculator");
                            System.out.println("3) Fat mass percentage");
                            int chz = s.nextInt();
                            switch (chz) {
                                case 1:
                                    System.out.println("BMI Calculator");
                                    MenuFunctions.calculateBMI();
                                    System.out.println("0) Back");
                                    int cchz = s.nextInt();
                                    if (cchz == 0) {
                                        break;
                                    }
                                case 2:
                                    System.out.println("Body fat percentage calculator");
                                    MenuFunctions.bodyFatCalculator();
                                    System.out.println("0) Back");
                                    int cchzzz = s.nextInt();
                                    if (cchzzz == 0) {
                                        break;
                                    }
                                case 3:
                                    System.out.println("Fat mass percentage calculator");
                                    MenuFunctions.fatMass();
                                    System.out.println("0) Back");
                                    int cchzz = s.nextInt();
                                    if (cchzz == 0) {
                                        break;
                                    }
                                default:
                                    System.out.println("You entered wrong number!");
                                    break;
                            }
                            break;
                        case 4:
                            programOn = false;
                            break;
                        default:
                            System.out.println("You entered wrong number");
                            break;
                    }
                }
            }else {
                System.out.println("Logging in failed.");
                break;
            }


        }

    }
}

