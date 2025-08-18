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
         System.out.println("Index    : " + 0);
         System.out.println("Email    : " + emails[0]);
         System.out.println("password : " + password[0]);
         System.out.println("username : " + usernames[0]);
    }
}
