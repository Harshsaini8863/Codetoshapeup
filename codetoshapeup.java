import java.util.Scanner;

class weightGain {                  //class for weightgain 
        double bmr;
        double activityFactor;
        void gaining() {              // method for calculating weightgain calories
        Scanner sc2 = new Scanner(System.in);
        

        System.out.println("What's your current weight (in kg):");
        int cw = sc2.nextInt();
        sc2.nextLine();
        System.out.println("What's your gender (male/female):");
        String gender = sc2.nextLine();
        System.out.println("What's your height in cm:");
        int h = sc2.nextInt();
        System.out.println("What's your age:");
        int a = sc2.nextInt();
        System.out.println("How much weight do you want to gain (in kg):");
        int wg = sc2.nextInt();
        System.out.println("In how many days do you want to gain your weight:");
        int days = sc2.nextInt();
        sc2.nextLine();

        if (gender.equalsIgnoreCase("male")) { 
            bmr = 10 * cw + 6.25 * h - 5 * a + 5;                   //calculating bmr for male furthur used in main logic
        } else if (gender.equalsIgnoreCase("female")) {
            bmr = 10 * cw + 6.25 * h - 5 * a - 161;                 //calculating bmr for female furthur used in main logic
        }

        System.out.println("Are you lightly_active (lw), moderately_active (mw), or fully_active (fw)?");
        String act = sc2.nextLine();
        if (act.equals("lw")) {
            activityFactor = 1.5;       //fixed value for lightly active
        } else if (act.equals("mw")) {
            activityFactor = 1.8;       //fixed value for moderately active
        } else if (act.equals("fw")) {
            activityFactor = 2.2;       //fixed value for fully active
        }

        double dailyCalories = ((wg * 7700) / days) + (bmr * activityFactor);  //this is the main logic for weightgain calories

        System.out.println("You need to consume approximately " + dailyCalories + " calories per day to gain " + wg + " kg in " + days + " days.");
        sc2.close();
    }
}

class weightLoss {   //class for weightloss
    double bmr1;
    double activityFactor1;
    void loss() {     //method for calculating weightloss calories
       
        Scanner sc3 = new Scanner(System.in);
        System.out.println("What's your current weight (in kg):");
        int cw1 = sc3.nextInt();
         sc3.nextLine();
        System.out.println("What's your gender (male/female):");
        String gender1 = sc3.nextLine();
       
        System.out.println("What's your height in cm:");
        int h1 = sc3.nextInt();
        System.out.println("What's your age:");
        int a1 = sc3.nextInt();
        System.out.println("How much weight do you want to lose (in kg):");
        int wl = sc3.nextInt();
        System.out.println("In how many days do you want to lose your weight:");
        int days1 = sc3.nextInt();
        sc3.nextLine();
        
        if (gender1.equalsIgnoreCase("male")) {
            bmr1 = 10 * cw1 + 6.25 * h1 - 5 * a1 + 5;   //calculating bmr for male 
        } else if (gender1.equalsIgnoreCase("female")) {
            bmr1 = 10 * cw1 + 6.25 * h1 - 5 * a1 - 161; //calculating bmr for female
        }

        System.out.println("Are you lightly_active (lw), moderately_active (mw), or fully_active (fw)?");
        String act1 = sc3.nextLine();
        if (act1.equals("lw")) {
            activityFactor1 = 1.5;
        } else if (act1.equals("mw")) {
            activityFactor1 = 1.8;
        } else if (act1.equals("fw")) {
            activityFactor1 = 2.2;
        }

        double dailyCalories2 = (bmr1 * activityFactor1) - ((wl * 7700) / days1); //main method for calculating weightloss calories

            if (dailyCalories2 < 0) {
                     System.out.println("Please consider a more realistic goal.");
            } else {
                    System.out.println("You should aim for a daily calorie intake of approximately " + dailyCalories2 + " calories to lose " + wl + " kg in " + days1 + " days.");
}
}
}

class CalorieCount {  //class for giving choices(switch/case) in weightgain or weightloss
    public void calculateCalories() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1 for weight gain");
        System.out.println("Enter 2 for weight loss");
        int button1 = sc1.nextInt();
        sc1.nextLine();

        switch (button1) {
            case 1:
                System.out.println("---Weight Gain---");
                weightGain wegain = new weightGain();
                wegain.gaining();
                break;
            case 2:
                System.out.println("---Weight Loss---");
                weightLoss weloss = new weightLoss();
                weloss.loss();
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
        sc1.close();
    }
}

class workoutPlan //class for workoutplan 
{Scanner sc4=new Scanner(System.in);
void exercise() //method for creating workoutplan
{System.out.println("Are you male/female ");
    String gender2=sc4.nextLine();
    if(gender2.equalsIgnoreCase("male"))
        {
            System.out.println("Are you Beginner(B)/Intermediate(I)/Advance(A)?");
            String s4=sc4.nextLine();
            if(s4.equalsIgnoreCase("b"))
            {
                System.out.println("Day 1: Chest, Back, Shoulders, Legs, Biceps, Triceps \r\n"+
                                    "Day 2: Legs, Triceps, Biceps, Chest, Back\r\n"+
                                    "Day 3: Shoulders, Back, Chest, Legs, Triceps, Biceps");
               
                
            }
            else if(s4.equalsIgnoreCase("i"))
            {
                System.out.println("Day 1: Chest, Shoulders and Triceps\r\n" + 
                                    "Day 2: Back and Biceps\r\n" + 
                                    "Day 3: Legs\r\n" + 
                                    "Day 4:  Shoulders, chest, and Triceps\r\n" + 
                                    "Day 5: Back and Biceps");

            }
            else if(s4.equalsIgnoreCase("a"))
            {
                System.out.println("Day 1: Chest & Back Workout\r\n" + 
                        "Day 2: Legs Workout\r\n" + 
                        "Day 3: Shoulders and Arms Workout\r\n" + 
                        "Day 4: Rest\r\n" + 
                        "Day 5: Chest, Shoulders, and Triceps Workout\r\n" + 
                        "Day 6: Back and Biceps Workout\r\n" + 
                        "Day 7: Legs Workout");


            }
        }
        else if(gender2.equalsIgnoreCase("female"))
        {
            System.out.println("Are you Beginner(B)/Intermediate(I)/Advance(A)?");
            String s4=sc4.nextLine();
            if(s4.equalsIgnoreCase("b"))
            {
                System.out.println( "Day 1: full-body strength training\r\n"+
                                    "Day 2: cardio\r\n"+
                                    "Day 3: rest or active recovery\r\n"+
                                    "Day 4: full-body or upper-body strength training\r\n"+
                                    "Day 5: rest or active recovery\r\n"+
                                    "Day 6: full-body or lower-body strength training\r\n"+
                                    "Day 7: rest or active recovery\r\n");
               
                
            }
            else if(s4.equalsIgnoreCase("i"))
            {
                System.out.println("Day 1 :Chest, Shoulders, and Triceps\r\n"+
                                    "Day 2 : Back and Biceps\r\n"+
                                    "Day 3 : Legs\r\n"+
                                    "Day 4 : Shoulder, Chest, and Triceps\r\n"+
                                    "Day 5 : Back and Biceps\r\n"+
                                    "Day 6 : Rest\r\n"+
                                    "Day 7 : Rest\r\n");

            }
            else if(s4.equalsIgnoreCase("a"))
            {
                System.out.println("Day 1: Chest & Back Workout\r\n" + 
                        "Day 2: Legs Workout\r\n" + 
                        "Day 3: Shoulders and Arms Workout\r\n" + 
                        "Day 4: Rest\r\n" + 
                        "Day 5: Chest, Shoulders, and Triceps Workout\r\n" + 
                        "Day 6: Back and Biceps Workout\r\n" + 
                        "Day 7: Legs Workout");
        }

    }
}
public class codetoshapeup { //this is the main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Welcome to Shape Up Program---------");
        System.out.println("Enter 1 for calorie count");
        System.out.println("Enter 2 for workout plan");
        int button = sc.nextInt();
        sc.nextLine();

        switch (button) {
            case 1:
                System.out.println("-----Calorie Count-----");
                CalorieCount cal = new CalorieCount();
                cal.calculateCalories();
                break;                                                      
            case 2:                                                             //choices for caloriecount and workoutplan
                System.out.println("-----Workout Plan----");
                workoutPlan wp=new workoutPlan();
                wp.exercise();
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
        sc.close();
    }
}
}
