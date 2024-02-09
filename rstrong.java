import java.util.Scanner;
public class rstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,num1,num2,fact=1,rem=0,res=0,i;
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            res=0;
            while(num!=0){
                rem=num%10;
                num1=rem;
                fact=1;
                while(num1!=0){//we can use for loop also
                    fact*=num1;
                    num1--;
                }
                res+=fact;
                num/=10;
            }
            if(res==i){
                System.out.print(i+" ");
            }
        }
    }
    
}
