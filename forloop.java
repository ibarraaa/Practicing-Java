
// package java fundamentals;
import java.util.Scanner;
class forloop {
    public static void main(String[] args) {
       
       
       Scanner s = new Scanner(System.in);
       
       
       
       String[] names = {"David", "Ace", "allen", "jasfer",  "jaymar"};
       System.out.print("Name To Search: ");
       String search = s.nextLine();
       
       
       for(String name:names){
           System.out.println(name);
           break;
       }
       System.out.println("_condition in for-each loop;__");
       // condition in for-each loop;
       
       for(String name:names){
           if(name.equalsIgnoreCase("Jasfer")){
               System.out.println("WE FOUND: " + name);
               break;
           }else{
               System.out.println(name);
           }
       }
       System.out.println("_________________________"); 
        System.out.println("array of integers SUMMATION");
       // array of integers SUMMATION;
       
       int numbers[] = {1123, 234, 3843, 4634, 5334, 555, 3346, 7636, 8363, 936};
       int sum = 0;
       for(int number:numbers){
           sum += number;
       }
       System.out.println("Sum: " + sum);
       
    }
}
