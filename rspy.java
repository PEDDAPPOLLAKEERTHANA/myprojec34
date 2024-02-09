import java.util.Scanner;
public class rspy {
    public static void main(String args[]){
        int r1,r2,prod,sum,num,num1,rem=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++)
        {
            num=i;
            num1=num;
            sum=0;
            prod=1;
            while(num!=0){
                rem=num%10;
                sum=sum+rem;
                prod=prod*rem;
                num/=10;
            }
            if(sum==prod){
                System.out.print(num1+" ");
            }
        }
        sc.close();
    }
    
}
