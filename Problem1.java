import java.util.*;
public class Problem1{
       public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        scanner.nextLine();
        String operation=scanner.nextLine();
        switch(operation) {
            case "+":

                System.out.println(a+b);
                break;
            case "-":
        
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b!=0){
        
                    System.out.println(a/b);
                } else {
                    System.out.println("Invalid input");
                    
                }
                break;
                default:
                    System.out.println("Give a valid opertaion");
        }
    }
}