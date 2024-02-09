import java.util.Scanner;
public class npalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0,num=1,num1,num2,letest=0,rangenum,rem=0;
        System.out.print("Enter the rangenumber: ");
        rangenum=sc.nextInt();
        while(c!=rangenum){
            num1=num;
            num2=0;
            while(num1!=0){
                rem=num1%10;
                num2=num2*10+rem;
                num1/=10;
            }
            if(num==num2){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("Palindrome rangenumber is " +letest );
        sc.close();
    }
    
}
