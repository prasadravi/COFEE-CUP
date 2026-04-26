import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){
        
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt(),rev=0,temp=number;
        
        while(number !=0){
            rev = rev*10 + number%10;
            number = number/10;                         

        }
        if(temp == rev){
            System.out.println("Is palindrome.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
    
}
