// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//package javaFundamentals;
import  java.util.Scanner;

class Main {
    public static void main (String[] args){ 
        
        
          
        
        System.out.println("arrays | element | Index!");
        
        String cars[] = {
            "honda",
            "suzuki",
            "volvo"
        };
            String StudentNames[] = {
                "zoro",
                "doe",
                "ace",
                "jaymar"
            };
            int uniqueCodes[] = {
                1515,
                1556,
                1616,
                1613,
                3633,
            };
        
        System.out.println(uniqueCodes[0]);
        //index - is a number that represent a position in a collection.
        String GuitarBrand[] = new String[4];
        System.out.println("total: " + (uniqueCodes[0] + uniqueCodes[2]));
        
        uniqueCodes[0] = 9335;
        System.out.println(uniqueCodes[0]);
        
        GuitarBrand[0] = "JCraft";
        GuitarBrand[1] = "Les Pul"; 
        GuitarBrand[2] = "Fender";
        GuitarBrand[3] = "Ligaya";
        
        System.out.println("Guitar Brand: " + GuitarBrand[0]);
        
        Scanner s = new Scanner(System.in);
        
        String employeeNames[] = new String[20];
            //int evenNumbers[] = new int[10];
        
        System.out.print("Enter Employee Name: ");
        employeeNames[0] = s.nextLine();
        System.out.println(employeeNames[0]);
        System.out.println("___");
        System.out.println("Paired Arrays By Index");
        
        
        String emails[] = {
            "juanDelaCrus11@example.com",
            "athenaVellar22@example.com",
            "ruisCabbacu33@example.com",
        };
        String usernames[] = {
            "juandelacruz",
            "athenaVellar",
            "ruiz"    
        };
        String password[] = {
            "juan123", 
            "athena123",
            "ruixzz1233"
        };
        int i = 3;
         System.out.println("Index    : " + 0);
         System.out.println("Email    : " + emails[0]); 
         System.out.println("password : " + password[0]);
         System.out.println("username : " + usernames[0]);

 System.out.println("Conditional Statements ");
        
        boolean isTall = true;
        if(isTall == false){
            System.out.println("r u tall wow!");
        }else{
            System.out.println("false");
        }
        System.out.println("Enter Age: ");
        int age = s.nextInt();
        int legalAge = 18;
        boolean isVerified = false;
        if(age >= legalAge){
            System.out.println("You have Access!");
            if(isVerified)System.out.println("Qualified");
            else System.out.println("But Not Qualified.");
        }else System.out.println("Access Denied!");
        
        
        // Equals Function
        // greet.equals("");
        //equalsIgnoreCase("");
        
        String greet = "hello!";
        if(greet.equalsIgnoreCase("Hello!")){
            System.out.println(true);
        }
        
        
        System.out.print("Enter your Math Grade: ");
        int mathAve = s.nextInt();
        System.out.print("Enter your English Grade: ");
        int englishAve = s.nextInt();
        System.out.print("Enter your Science Grade: ");
        int scienceAve = s.nextInt();
        System.out.print("Enter your Computer Grade: ");
        int computerAve = s.nextInt();
        
        float average = (mathAve + englishAve + scienceAve + computerAve) / 4;
        System.out.println("Average: " + average);
        
        if (average >= 100){
            System.out.println("Invalid");
        }else if(average >= 98){
             System.out.println("With Highes Honor");
        }else if(average >= 95){
             System.out.println("With High Honor");
        }else if (average >=90){
            System.out.println("With Honor");
            
        }
        else if(average >= 75){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }
        
    }
}
