import java.util.Scanner;
public class rmagic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,i,num,num1,num2,rem,sum,res;
        System.out.print("Enter the  range: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++)
        {
            num=i;
            num1=num;
            sum=0;
            while(num!=0){
                rem=num%10;
                sum=sum+rem;
                num/=10;
            }
            num2=sum;
            res=0;
            while(num2!=0){
                rem=num2%10;
                res=res*10+rem;
                num2/=10;
            }
            if(res*sum==num1){
                System.out.print(num1+" ");
            }
        }
    }
    
}
