
import java.util.Scanner;
public class spyno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,rem=0,sum=0,prod=0;
        System.out.print("Enter number to find spy or not:");
        num1=sc.nextInt();
        while(num1!=0){
            rem=num1%10;
            sum=sum+rem;
            prod=prod+rem;
            num1/=10;
        }
        if(sum==prod){
            System.out.println("It is a spy nummber");
        }
        else{
            System.out.println("It is not a spy number");
        }
        sc.close();
    }
}
