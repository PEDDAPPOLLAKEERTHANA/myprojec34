import java.util.Scanner;
public class rneon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,num2,i,rem=0,res=0;
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            res=0;
            num2=num*num;
            while(num2!=0){
                rem=num2%10;
                res=res+rem;
                num2/=10;
            }
             if(num==res){
                System.out.print(num+" ");
             }
        }
        sc.close();
    }
    
}
