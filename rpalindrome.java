import java.util.Scanner;
public class rpalindrome {
    public static void main(String args[]){
        int i,num1,num3,num4,num2=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number range:");
        num3=sc.nextInt();
        num4=sc.nextInt();
        for(i=num3;i<=num4;i++){ 
            num1=i;
            num2=0;
            while(num1!=0)
            {
                rem=num1%10;
                num2=num2*10+rem;
                num1=num1/10;
            //num2=num2*10+rem;
            }
            if(i==num2)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();

    }
    
}

