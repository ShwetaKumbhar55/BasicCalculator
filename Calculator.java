 
import java.util.Scanner; 
public class Calculator {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first no");
        int no1 = s.nextInt();
        System.out.println("Enter second no");
        int no2 = s.nextInt();
         System.out.println("Select Symbol(+,-,*,/)");
        String sym = s.next();
         int result;
        
        switch(sym)
        {
            case "+" : result = (no1+no2);
                       System.out.println("The result is:"+result);
                       break;

            case "-" : result  = (no1-no2);
                       System.out.println("The result is:"+result);
                       break;

            case "*" : result = no1 * no2;   
                        System.out.println("The result is:"+result);
                        break;

             case "/" : result = no1 / no2;   
                        System.out.println("The result is:"+result);
                        break;

             default : System.out.println("Invalid symbol");
                       break;
                                 
        }


    }
 }