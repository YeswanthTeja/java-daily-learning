import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println("Select the operator");
        char operator = input.next().charAt(0);
        
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '%':System.out.println(a%b);
            break;
            
        }
        
    
        
    }
}