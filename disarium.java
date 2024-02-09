import java.util.Scanner;
public class disarium {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,num1,num2,rem=0,sum=0,count=0;
        System.out.print("Enter a number:");
        num=sc.nextInt();
        num1=num2=num;
        while(num1!=0){
            num1/=10;
            count++;
        }
        while(num!=0){
            rem=num%10;
            sum+=Math.pow(rem,count);
            num/=10;
            count--;
        }
        if(num2==sum){
            System.out.println("It is a disarium number");
        }
        else{
            System.out.println("It is not a disarium number:");
        }
        sc.close();
    }
    
}
