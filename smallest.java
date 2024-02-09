import java.util.Scanner;
public class smallest 

{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,rem=0;
        System.out.print("Enter a number :");
        num=sc.nextInt();
        int small=num%10;
        while(num!=0){
            rem=num%10;
            if(small>rem){
                small=rem;
            }
            num/=10;
        }
        System.out.print("The smallest digit is: "+small);
    }
}

    

