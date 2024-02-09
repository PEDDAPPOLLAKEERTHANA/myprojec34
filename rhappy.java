import java.util.Scanner;
public class rhappy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,r1,r2,sum=0,num,num1,num2,rem,res;
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            sum=0;
            while(sum!=1&&sum!=4){
                sum=0;
                while(num!=0){
                    rem=num%10;
                    sum+=Math.pow(rem,2);
                    num/=10;
                }
                num=sum;
            }
            if(sum==1){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
